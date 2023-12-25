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
                    By.xpath("//button[@class='passengers__confirm-button " +
                            "ry-button--anchor-blue ry-button--anchor']");
            public static By clickOnBox = By.xpath("//button[@aria-label='Search']");
            public static By getTextFlighNumber =
                    By.xpath("//div[@class='card-flight-num__content' and @data-ref='FR 6637']");
        }

        public class HotelBookingPage {

            public static By buttonClickHotels =
                    By.xpath("//button[@data-ref='search-widget-tabs__rooms']");
            public static By addTexToBox =
                    By.xpath("//input[@class='input-button__input ng-star-inserted']");
            public static By divTextBerlin =
                    By.xpath("(//hp-room-search-location-item[div[@data-ref='location-item__name' " +
                            "and @class='location__name b2' and .='Berlin']])[2]");
            public static By clickOnInputDate =
                    By.xpath("//hp-input-button[@uniqueid='check-in' " +
                            "and @class='rooms-widget-controls__control rooms-widget-controls__control--date " +
                            "input-button--connected-right']");
            public static By divCalendarClickStart =
                    By.xpath("(//div[@data-id='2024-01-27'])[2]");
            public static By divCalendarClickEnd = By.xpath("(//div[@data-id='2024-01-28'])[2]");
            public static By buttonclickSearch = By.xpath("//button[@ry-button " +
                    "and @data-ref='rooms-search-widget__cta' " +
                    "and @class='rooms-search-widget__start-search ry-button--gradient-yellow']");
            public static By buttonClickRejectAll =
                    By.xpath("//button[@id='onetrust-reject-all-handler']");
            public static By buttonClickOnHotelLink =
                    By.xpath("(//button[@type='button' " +
                            "and @data-testid='uitk-gallery-item-current-trigger' " +
                            "and @class='uitk-image-link'])[1]");
            public static By buttonClickOnReserve =
                    By.xpath("(//button[@data-stid='submit-hotel-reserve' " +
                            "and @type='button' and @class='uitk-button uitk-button-medium uitk-button-primary'])[1]");
            public static By buttonClickOnPayAtProperty = By.xpath("(//button[@type='submit'])[1]");
            public static By getTitle =
                    By.xpath("(//h1[@class='is-visually-hidden'])[2]");
        }

        public class ContactUsPage {
            public static By waitForElement = By.xpath("//button[@data-ref='cookie.no-thanks']");
            public static By clickOnNoThanks = By.xpath("//button[@data-ref='cookie.no-thanks']");
            public static By clickOnButtonContactUs =
                    By.xpath("//a[contains(@class,'legal-footer__links-item') " +
                            "and contains(text(), 'Contact us')]");
        }
    }
}
