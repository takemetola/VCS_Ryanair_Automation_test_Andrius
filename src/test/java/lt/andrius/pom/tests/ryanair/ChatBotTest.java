import lt.andrius.pom.pages.ryanair.ChatBotPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChatBotTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ChatBotPage.openUrl("https://help.ryanair.com/hc/en-gb/sections/12504616835857");
    }

    @Test
    public void testChatBotMessage() {
        String name = "Tom Tom";
        String email = "test01@gmail.com";
        String expectedResult = "Chat with us";
        String actualResult;

        ChatBotPage.clickOnLetsChatMenu();
        ChatBotPage.clickOnChatNowButton();
        ChatBotPage.clickOnCookiesAgree();
        ChatBotPage.addTextName(name);
        ChatBotPage.addTextEmail(email);
        ChatBotPage.clickOnStartChatButton();

        actualResult = ChatBotPage.readChatBox();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
