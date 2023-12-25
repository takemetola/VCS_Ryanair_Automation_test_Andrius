package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class ContactUsPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnCookies() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.ContactUsPage.waitForElement);
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnNoThanks);
    }

    public static void clickOnContactUsButton() {
        Common.scrollWindowByActionsMinusPlus2000Y();
        Common.waitForElementToBeVisible();
        Common.clickOnElement(Locator.Ryanair.ContactUsPage.clickOnButtonContactUs);
    }
}
