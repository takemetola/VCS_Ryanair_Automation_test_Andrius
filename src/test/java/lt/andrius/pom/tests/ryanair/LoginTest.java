import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override

    public void setUp() {
        LoginPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();
    }

    @Test
    public void testLogin() throws InterruptedException {
        String email = "jurkusand@gmail.com";
        String password = "Tomukas123";
        String expectedResult = "jurkusand@gmail.com";
        String actualResult;

        LoginPage.clickOnLoginButton();
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickToLogin();

        actualResult = LoginPage.readProfileEmail();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
