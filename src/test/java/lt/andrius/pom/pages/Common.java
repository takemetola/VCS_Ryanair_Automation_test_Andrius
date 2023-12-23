package lt.andrius.pom.pages;

import lt.andrius.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
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
}
