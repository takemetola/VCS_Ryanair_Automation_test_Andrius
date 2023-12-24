import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.pages.ryanair.UpdateProfileInfoPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateProfileInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() throws InterruptedException {
        UpdateProfileInfoPage.openUrl("https://www.ryanair.com/gb/en");
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

        UpdateProfileInfoPage.clickOnProfileEmail();
        UpdateProfileInfoPage.clickOnMyRyanairButton();
        Thread.sleep(1000);
        UpdateProfileInfoPage.clickOnEditButton();
        Thread.sleep(1000);
        UpdateProfileInfoPage.addDay(day);
        UpdateProfileInfoPage.addMonth(month);
        UpdateProfileInfoPage.addYear(year);
        UpdateProfileInfoPage.clickOnSave();
        Thread.sleep(1000);

        actualResult = UpdateProfileInfoPage.readDateOfBirth();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
