import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.ryanair.ContactUsPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ContactUsPage.openUrl("https://www.ryanair.com/gb/en");
        ContactUsPage.clickOnCookies();
    }
    @Test
    public void testChatBotMessage(){
        String expectedResult = "";
        String actualResult;

        ContactUsPage.clickOnContactUsButton();
        actualResult = "";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
