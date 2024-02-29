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
            public static By buttonWaitCookieNoThanks = By.xpath("//button[@data-ref='cookie.no-thanks']");

            public static By buttonNoThanks = By.xpath("//button[@data-ref='cookie.no-thanks']");
            public static By inputEmailBox = By.xpath("//input[@name='email']");
            public static By spanEmailBox = By.xpath("//span[text()='jurkusand@gmail.com']");
            public static By buttonWaitLogin = By.xpath("//button[@type='submit' " +
                    "and @class='auth-submit__button ry-button--gradient-yellow']");
        }

        public class UpdateProfileInfoPage {

            public static By buttonLogIn = By.xpath("//button[@aria-label='Log In']");
            public static By buttonMyRyanair = By.xpath("//a[@aria-label='myRyanair']");
            public static By buttonEdit = By.xpath("//button[@data-ref='header-action-edit' " +
                    "and @class='ng-tns-c663872481-1 " +
                    "ry-button--anchor-blue ry-button--medium ry-button--anchor']");
            public static By inputTxtDay = By.xpath("//input[@name='dob-day']");
            public static By inputTxtMonth = By.xpath("//input[@name='dob-month']");
            public static By inputTxtYear = By.xpath("//input[@name='dob-year']");
            public static By buttonSave = By.xpath("//button[@id='saveBtn']");

            public static By spanDate = By.xpath("//span[@data-ref='date-of-birth']");
            public static By buttonEditWait = By.xpath("//button[@data-ref='header-action-edit' " +
                    "and @class='ng-tns-c663872481-1 " +
                    "ry-button--anchor-blue ry-button--medium ry-button--anchor']");
            public static By inputDobWait = By.xpath("//input[@name='dob-day']");
            public static By spanTxtDob = By.xpath("//span[@data-ref='date-of-birth']");
            public static By buttonCookiesNo = By.xpath("//button[@data-ref='cookie.no-thanks']");
        }

        public class FlightSearchPage {
            public static By radioButtonOneWay =
                    By.xpath("//ry-radio-button[@data-ref='flight-search-trip-type__one-way-trip']");
            public static By inputDeparture =
                    By.xpath("//input[@id='input-button__departure' " +
                            "and @data-ref='input-button__display-value']");
            public static By spanElementVNO = By.xpath("//*[@id='input-button__departure']");
            public static By spanElementGermany =
                    By.xpath("//*[@id='input-button__destination']");
            public static By spanEelementBER =
                    By.xpath("//span[@data-ref='airport-item__name' and @data-id='BER']");
            public static By divDepartDate = By.xpath("//div[@data-id='2024-06-08']");
            public static By buttonDone =
                    By.xpath("//button[@class='passengers__confirm-button " +
                            "ry-button--anchor-blue ry-button--anchor']");
            public static By buttonSearch = By.xpath("//button[@aria-label='Search']");
            public static By divFlightNum =
                    By.xpath("//div[@class='card-flight-num__content' and text()=' FR 1571 ']");
            public static By buttonRejectCookies = By.xpath("//button[@data-ref='cookie.no-thanks']");
            public static By spanElementAirport = By.xpath("//span[@data-ref='airport-item__name' " +
                    "and @data-id='VNO']");
            public static By spanElementCountry =
                    By.xpath("//span[@data-ref='country__name' and normalize-space(.)='Germany']");
            public static By calendarArrowForwardButton = By.xpath("//div[@class='datepicker__arrow-wrap']");
            public static By calendarArrowForwardButtonNext = By.xpath("(//div[@class='datepicker__arrow-wrap'][2])");
        }

        public class HotelBookingPage {

            public static By buttonHotels =
                    By.xpath("//button[@data-ref='search-widget-tabs__rooms']");
            public static By inputTxtBox =
                    By.xpath("//input[@class='input-button__input ng-star-inserted']");
            public static By divTextBerlin =
                    By.xpath("(//hp-room-search-location-item[div[@data-ref='location-item__name' " +
                            "and @class='location__name b2' and .='Berlin']])[2]");
            public static By inputDate =
                    By.xpath("//hp-input-button[@uniqueid='check-in' " +
                            "and @class='rooms-widget-controls__control rooms-widget-controls__control--date " +
                            "input-button--connected-right']");
            public static By divCalendarClickStart =
                    By.xpath("//div[@class='calendar-body__cell' and @data-id='2024-05-30']");
            public static By divCalendarClickEnd = By.xpath("(//div[@class='calendar-body__cell' and @data-id='2024-05-31'])[2]");
            public static By buttonclickSearch = By.xpath("//button[@ry-button " +
                    "and @data-ref='rooms-search-widget__cta' " +
                    "and @class='rooms-search-widget__start-search ry-button--gradient-yellow']");
            public static By headerTitle =
                    By.xpath("(//h1[@class='is-visually-hidden'])[2]");
            public static By inputCalendar = By.xpath("//hp-input-button[@uniqueid='check-in' " +
                    "and @class='rooms-widget-controls__control rooms-widget-controls__control--date " +
                    "input-button--connected-right']");
            public static By divLocation =
                    By.xpath("(//hp-room-search-location-item[div[@data-ref='location-item__name' " +
                            "and @class='location__name b2' and .='Berlin']])[2]");
            public static By buttonRejectCookies = By.xpath("//button[@data-ref='cookie.no-thanks']");
            public static By calendarForwardArrowButton = By.xpath("//*[@id='ry-tooltip-12']//div[2]/hp-lazy-room-search-controls-tooltips/hp-app-room-search-controls-tooltips/hp-room-search-controls-tooltips-container/hp-room-search-controls-tooltips/hp-room-search-datepicker-container/fsw-datepicker/ry-datepicker-desktop/div/div[2]");
        }

        public class ChatBotPage {
            public static By divTagName =
                    By.xpath("//div[@id='article-toggle-16116483455505']/a");
            public static By buttonChatNow =
                    By.xpath("//a[@class='button button-outline-primary button-lg' " +
                            "and contains(text(), 'Chat now')]");
            public static By buttonLinkChatNow =
                    By.xpath("//a[@class='button button-outline-primary button-lg' " +
                            "and contains(text(), 'Chat now')]");
            public static By buttonAgree =
                    By.xpath("//button[@data-ref='cookie.accept-all']");
            public static By buttonAgreeCookies =
                    By.xpath("//button[@class='cookie-popup-with-overlay__button' " +
                            "and text()='Yes, I agree']");
            public static By inputForChatBoxWait = By.xpath("//input[@id='2val-field_1.3.10--input']");
            public static By inputTxtToEmailBox = By.xpath("//input[@id='2val-field_1.3.10--input']");
            public static By divParagraph =
                    By.xpath("//div[@class='panelParagraph-3qh9g lineClamp-E9j4z'" +
                            "and text()='How can I help you today?']");
            public static By divChatBoxText =
                    By.xpath("//div[text()='How can I help you today?']");
            public static By iFrameWidget = By.xpath("//iframe[@id='webWidget']");
            public static By inputTxtNameBox = By.xpath("//input[@id='1val-field_1.3.10--input']");
            public static By buttonStartChat = By.xpath("//button[@data-testid='button-ok']");
        }
    }
}
