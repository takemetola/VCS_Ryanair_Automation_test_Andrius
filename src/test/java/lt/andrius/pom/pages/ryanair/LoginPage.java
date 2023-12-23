package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;
import lt.andrius.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnLoginButton() {
        Common.clickOnElement(Locator.Ryanair.LoginPage.clickOnButton);
    }

    public static void inputEmail(String email) {
        Common.addText(Locator.Ryanair.LoginPage.inputEmail, email);

    }

    public static void inputPassword(String password) {
        Common.addText(Locator.Ryanair.LoginPage.inputPassword, password);
    }

    public static void clickToLogin() {
        Common.clickOnElement(Locator.Ryanair.LoginPage.buttonClickLogin);
    }

    public static String readProfileEmail() {
        return Common.getText(Locator.Ryanair.LoginPage.spanEmail);
    }

    public static void clickOnCookies() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.LoginPage.waitForElement);
        Common.clickOnElement(Locator.Ryanair.LoginPage.clickOnNoThanks);
    }
}
