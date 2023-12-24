package lt.andrius.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Ryanair {

        public class LoginPage {
            public static By clickOnButton = By.xpath("//button[@aria-label='Log In']");
            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonClickLogin =
                    By.xpath("//button[@type='submit' " +
                            "and @class='auth-submit__button ry-button--gradient-yellow']");
            public static By spanEmail = By.xpath("//span[text()='jurkusand@gmail.com']");
            public static By waitForElement = By.xpath("//button[@data-ref='cookie.no-thanks']");

            public static By clickOnNoThanks = By.xpath("//button[@data-ref='cookie.no-thanks']");
        }

        public class UpdateProfileInfoPage {

            public static By clickOnEmail = By.xpath("//button[@aria-label='Log In']");
            public static By clickOnButtonMyRyanair = By.xpath("//a[@aria-label='myRyanair']");
            public static By clickOnButtonEdit = By.xpath("//button[@data-ref='header-action-edit' " +
                    "and @class='ng-tns-c663872481-1 " +
                    "ry-button--anchor-blue ry-button--medium ry-button--anchor']");
            public static By textAddDay = By.xpath("//input[@name='dob-day']");
            public static By textAddMonth = By.xpath("//input[@name='dob-month']");
            public static By textAddYear = By.xpath("//input[@name='dob-year']");
            public static By clickOnButtonSave = By.xpath("//button[@id='saveBtn']");

            public static By readSpanDate = By.xpath("//span[@data-ref='date-of-birth']");
        }

        public class FlightSearchPage {
            public static By clickOnOneWayRadioButton =
                    By.xpath("//ry-radio-button[@data-ref='flight-search-trip-type__one-way-trip']");
            public static By clickonTextBox =
                    By.xpath("//input[@id='input-button__departure' " +
                            "and @data-ref='input-button__display-value']");
            public static By clickOnElementVNO = By.xpath("//span[@data-ref='airport-item__name' " +
                    "and @data-id='VNO']");
            public static By clickOnElementGermany =
                    By.xpath("//span[@data-ref='country__name' and normalize-space(.)='Germany']");
            public static By clickOnElementBerlinBrandenburg =
                    By.xpath("//span[@data-ref='airport-item__name' and @data-id='BER']");
            public static By clickOnDeparturesDateBox =
                    By.xpath("//div[@data-id='2024-01-31']");
            public static By clickOnDone =
                    By.xpath("//button[@class='passengers__confirm-button ry-button--anchor-blue ry-button--anchor']");
            public static By clickOnBox = By.xpath("//button[@aria-label='Search']");
            public static By getTextFlighNumber =
                    By.xpath("//div[@class='card-flight-num__content' and @data-ref='FR 6637']");
        }
    }
}
