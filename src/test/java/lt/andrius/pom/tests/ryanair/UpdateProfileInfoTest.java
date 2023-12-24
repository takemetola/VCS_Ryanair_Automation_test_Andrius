import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateProfileInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();

    }
    @Test
    public void testUpdateProfile_DateOfBirth_PhoneNumber() throws InterruptedException {
        String email = "jurkusand@gmail.com";
        String password = "Tomukas123";
        String expectedResult = "jurkusand@gmail.com";
        String actualResult;

        LoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickToLogin();
        Thread.sleep(1000);

        LoginPage.clickOnProfileEmail();



        actualResult = "";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
