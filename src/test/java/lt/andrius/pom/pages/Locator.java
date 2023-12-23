package lt.andrius.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Ryanair {

        public class LoginPage {
            public static By clickOnButton = By.xpath("//button[@aria-label='Log In']");
            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonClickLogin =
                    By.xpath("//button[@type='submit' and @class='auth-submit__button ry-button--gradient-yellow']");
            public static By spanEmail = By.xpath("//span[text()='jurkusand@gmail.com']");
            public static By waitForElement = By.xpath("//button[@data-ref='cookie.no-thanks']");

            public static By clickOnNoThanks = By.xpath("//button[@data-ref='cookie.no-thanks']");
        }
    }
}
