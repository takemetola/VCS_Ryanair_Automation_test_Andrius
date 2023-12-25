import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.pages.ryanair.UpdateProfileInfoPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateProfileInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UpdateProfileInfoPage.openUrl("https://www.ryanair.com/gb/en");
        UpdateProfileInfoPage.clickOnCookies();
        String email = "jurkusand@gmail.com";
        String password = "Tomukas123";
        LoginPage.clickOnLoginButton();
        LoginPage.inputEmail(email);
        LoginPage.inputPassword(password);
        LoginPage.clickToLogin();

    }

    @Test
    public void testUpdateProfile_DateOfBirth() throws InterruptedException {

        String day = "20";
        String month = "04";
        String year = "2000";
        String expectedResult = "** / ** / 2000";
        String actualResult;

        Thread.sleep(1000);
        UpdateProfileInfoPage.clickOnProfileEmail();
        UpdateProfileInfoPage.clickOnMyRyanairButton();
        UpdateProfileInfoPage.clickOnEditButton();

        UpdateProfileInfoPage.addDay(day);
        UpdateProfileInfoPage.addMonth(month);
        UpdateProfileInfoPage.addYear(year);
        UpdateProfileInfoPage.clickOnSave();

        actualResult = UpdateProfileInfoPage.readDateOfBirth();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
