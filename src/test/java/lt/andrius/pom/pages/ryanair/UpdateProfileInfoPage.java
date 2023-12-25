package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class UpdateProfileInfoPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnCookies() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.clickOnReject);
    }

    public static void clickOnProfileEmail() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.UpdateProfileInfoPage.waitForEmailBox);
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.clickOnEmail);
    }

    public static void clickOnMyRyanairButton() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.clickOnButtonMyRyanair);
    }

    public static void clickOnEditButton() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.waitForEditButton);
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.clickOnButtonEdit);
    }

    public static void addDay(String day) {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.waitForElementBox);
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.textAddDay, day);

    }

    public static void addMonth(String month) {
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.textAddMonth, month);
    }

    public static void addYear(String year) {
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.textAddYear, year);
    }

    public static void clickOnSave() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.clickOnButtonSave);
    }

    public static String readDateOfBirth() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.waitToReadText);
        return Common.getText(Locator.Ryanair.UpdateProfileInfoPage.readSpanDate);
    }
}
