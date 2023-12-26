import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override

    public void setUp() {
        LoginPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();
    }

    @DataProvider(name = "testLogin")
    public static Object[][] provideDataForTestLogin() {
        return new Object[][]{
                {"jurkusand@gmail.com", "Tomukas123", "jurkusand@gmail.com"}
        };
    }

    @Test(dataProvider = "testLogin")
    public void testLogin(String email, String password, String expectedResult) {
        String actualResult;

        LoginPage.clickOnLoginButton();
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickToLogin();

        actualResult = LoginPage.readProfileEmail();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
