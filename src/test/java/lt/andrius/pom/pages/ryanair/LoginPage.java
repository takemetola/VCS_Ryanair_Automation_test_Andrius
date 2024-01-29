package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class LoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnLoginButton() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.LoginPage.clickOnButton);
        Common.clickOnElement(Locator.Ryanair.LoginPage.clickOnButton);
    }

    public static void inputEmail(String email) {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.LoginPage.inputEmailBox);
        Common.addText(Locator.Ryanair.LoginPage.inputEmail, email);
    }

    public static void inputPassword(String password) {
        Common.addText(Locator.Ryanair.LoginPage.inputPassword, password);
    }

    public static void clickToLogin() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.LoginPage.buttonWaitLogin);
        Common.clickOnElement(Locator.Ryanair.LoginPage.buttonClickLogin);
    }

    public static String readProfileEmail() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.LoginPage.spanEmailBox);
        return Common.getText(Locator.Ryanair.LoginPage.spanEmail);
    }

    public static void clickOnCookies() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.LoginPage.buttonWaitCookieNoThanks);
        Common.clickOnElement(Locator.Ryanair.LoginPage.buttonNoThanks);
    }
}
