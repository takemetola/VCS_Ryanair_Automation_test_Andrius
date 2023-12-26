package lt.andrius.pom.pages;

import lt.andrius.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {

        return getElement(locator).getText();
    }

    public static boolean waitForElementToBeVisible(int seconds, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static void scrollWindowByActionsPlus300Y() {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .scrollByAmount(0, 300)
                .perform();
    }

    public static void scrollWindowByActionsMinus300Y() {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .scrollByAmount(0, -300)
                .perform();
    }

    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElement(locator));
    }

}
