import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateProfileInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() throws InterruptedException {
        LoginPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();
        String email = "jurkusand@gmail.com";
        String password = "Tomukas123";
        LoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickToLogin();
        Thread.sleep(1000);

    }
    @Test
    public void testUpdateProfile_DateOfBirth_PhoneNumber() throws InterruptedException {

        String day = "20";
        String month = "04";
        String year = "2000";
        String expectedResult = "** / ** / 2000";
        String actualResult;

        LoginPage.clickOnProfileEmail();
        LoginPage.clickOnMyRyanairButton();
        Thread.sleep(1000);
        LoginPage.clickOnEditButton();
        Thread.sleep(1000);
        LoginPage.addDay(day);
        LoginPage.addMonth(month);
        LoginPage.addYear(year);
        LoginPage.clickOnSave();
        Thread.sleep(1000);

        actualResult = LoginPage.readDateOfBirth();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
