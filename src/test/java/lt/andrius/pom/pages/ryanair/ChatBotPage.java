package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class ChatBotPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnCookies() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ContactUsPage.waitForElement);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnNoThanks);
    }

    public static void clickOnContactUsButton() {
        Common.scrollWindowByActionsMinusPlus3000Y();
        Common.waitForElementToBeVisible(3,Locator.Ryanair.ContactUsPage.waitForElementtoBeClickable);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnButtonContactUs);
    }

    public static void clickOnLetsChatMenu() {
       // Common.waitForElementToBeVisible(3,Locator.Ryanair.ContactUsPage.waitForElementLetsChat);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnTagName);
    }

    public static void clickOnChatNowButton() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ContactUsPage.waitForElementChatNow);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnLinkChatNow);
    }

    public static void clickOnCookiesAgree() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ContactUsPage.waitforCookies);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnButtonAgree);
    }

    public static void addTextName(String name) {
        Common.waitForElementToBeVisible(3, Locator.Ryanair.ContactUsPage.waitForChatBox);
        Common.switchToFrame(Locator.Ryanair.ContactUsPage.switchToIFrame);
        Common.addText(Locator.Ryanair.ContactUsPage.addTextToNameBox, name);

    }

    public static void addTextEmail(String email) {
        //Common.waitForElementToBeVisible(3, Locator.Ryanair.ContactUsPage.waitForChatBox);
        //Common.switchToFrame(Locator.Ryanair.ContactUsPage.switchToIFrame);
        Common.addText(Locator.Ryanair.ContactUsPage.addTextToEmailBox, email);
    }

    public static String readChatBox() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.ContactUsPage.waitForChatBoxElement);
        return Common.getText(Locator.Ryanair.ContactUsPage.getChatBoxText);
    }

    public static void clickOnStartChatButton() {
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnButtonStartChat);
    }
}
