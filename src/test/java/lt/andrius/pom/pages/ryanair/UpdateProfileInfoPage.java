package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class UpdateProfileInfoPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnCookies() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.buttonCookiesNo);
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.buttonCookiesNo);
    }

    public static void clickOnProfileEmail() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.buttonLogIn);
    }

    public static void clickOnMyRyanairButton() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.buttonMyRyanair);
    }

    public static void clickOnEditButton() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.buttonEditWait);
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.buttonEdit);
    }

    public static void addDay(String day) {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.inputDobWait);
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.inputTxtDay, day);
    }

    public static void addMonth(String month) {
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.inputTxtMonth, month);
    }

    public static void addYear(String year) {
        Common.addText(Locator.Ryanair.UpdateProfileInfoPage.inputTxtYear, year);
    }

    public static void clickOnSave() {
        Common.clickOnElement(Locator.Ryanair.UpdateProfileInfoPage.buttonSave);
    }

    public static String readDateOfBirth() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.UpdateProfileInfoPage.spanTxtDob);
        return Common.getText(Locator.Ryanair.UpdateProfileInfoPage.spanDate);
    }
}
