package lt.andrius.pom.tests.ryanair;

import lt.andrius.pom.pages.ryanair.ChatBotPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChatBotTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ChatBotPage.openUrl("https://help.ryanair.com/hc/en-gb/sections/12504616835857");
    }

    @DataProvider(name = "testChatBotMessage")
    public static Object[][] provideDataForTestChatBotMessage() {
        return new Object[][]{
                {"Tom Tom", "test01@gmail.com", "How can I help you today?"}
        };
    }

    @Test(dataProvider = "testChatBotMessage")
    public void testChatBotMessage(String name, String email, String expectedResult){
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
