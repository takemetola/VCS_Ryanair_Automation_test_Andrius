package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class ChatBotPage {
    public static void openUrl(String url) {
        Common.setUpChrome(2);
        Common.openUrl(url);
    }

    public static void clickOnLetsChatMenu() {
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.clickOnTagName);
    }

    public static void clickOnChatNowButton() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ChatBotPage.waitForElementChatNow);
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.clickOnLinkChatNow);
    }

    public static void clickOnCookiesAgree() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ChatBotPage.waitforCookies);
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.clickOnButtonAgree);
    }

    public static void addTextName(String name) {
        Common.waitForElementToBeVisible(3, Locator.Ryanair.ChatBotPage.waitForChatBox);
        Common.switchToFrame(Locator.Ryanair.ChatBotPage.switchToIFrame);
        Common.addText(Locator.Ryanair.ChatBotPage.addTextToNameBox, name);

    }

    public static void addTextEmail(String email) {
        Common.addText(Locator.Ryanair.ChatBotPage.addTextToEmailBox, email);
    }

    public static String readChatBox() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.ChatBotPage.waitForChatBoxElement);
        return Common.getText(Locator.Ryanair.ChatBotPage.getChatBoxText);
    }

    public static void clickOnStartChatButton() {
        Common.clickOnElement(Locator.Ryanair.ChatBotPage.clickOnButtonStartChat);
    }
}
