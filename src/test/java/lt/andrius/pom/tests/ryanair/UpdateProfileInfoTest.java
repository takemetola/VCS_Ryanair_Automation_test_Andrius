import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.pages.ryanair.UpdateProfileInfoPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "testUpdateProfile_DateOfBirth")
    public static Object[][] provideDataForTestUpdateProfile_DateOfBirth() {
        return new Object[][]{
                {"20", "04", "2000", "** / ** / 2000"}
        };
    }

    @Test(dataProvider = "testUpdateProfile_DateOfBirth")
    public void testUpdateProfile_DateOfBirth(String day, String month, String year, String expectedResult)
            throws InterruptedException {

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
