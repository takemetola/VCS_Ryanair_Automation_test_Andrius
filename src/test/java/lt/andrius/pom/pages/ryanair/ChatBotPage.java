package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class ChatBotPage {
    public static void openUrl(String url) {
        Common.setUpChrome(2);
        Common.openUrl(url);
    }

    public static void clickOnLetsChatMenu() {
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.divTagName);
    }

    public static void clickOnChatNowButton() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ChatBotPage.buttonChatNow);
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.buttonLinkChatNow);
    }

    public static void clickOnCookiesAgree() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ChatBotPage.buttonAgreeCookies);
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.buttonAgree);
    }

    public static void addTextName(String name) {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ChatBotPage.inputForChatBoxWait);
        Common.switchToFrame(Locator.Ryanair.ChatBotPage.iFrameWidget);
        Common.addText(Locator.Ryanair.ChatBotPage.inputTxtNameBox, name);

    }

    public static void addTextEmail(String email) {
        Common.addText(Locator.Ryanair.ChatBotPage.inputTxtToEmailBox, email);
    }

    public static String readChatBox() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.ChatBotPage.divParagraph);
        return Common.getText(Locator.Ryanair.ChatBotPage.divChatBoxText);
    }

    public static void clickOnStartChatButton() {
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.buttonStartChat);
    }
}
