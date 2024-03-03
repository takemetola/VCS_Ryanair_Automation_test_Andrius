package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class HotelBookingPage {
    public static void openUrl(String url) {
        Common.setUpChrome(2);
        Common.openUrl(url);
    }

    public static void clickOnButtonHotels() {
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.buttonHotels);
    }

    public static void addTextToFindHotel(String destinationHotel) {
        Common.addText(Locator.Ryanair.HotelBookingPage.inputTxtBox, destinationHotel);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.elementBerlin);
    }

    public static void clickOnChooseCheckInDate() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.HotelBookingPage.inputCalendar);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.inputDate);
    }

    public static void clickOnStartDate() {
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.divCalendarClickStart);
    }

    public static void clickOnEndDate() {
        Common.waitForElementToBeVisible(Locator.Ryanair.HotelBookingPage.divCalendarClickEnd);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.divCalendarClickEnd);
    }

    public static void clickOnSearchButton() {
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.buttonclickSearch);
    }

    public static String readTitle() {
        return Common.getText(Locator.Ryanair.HotelBookingPage.headerTitle);
    }

    public static void clickOnCookies() {
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.buttonRejectCookies);
    }

    public static void clickCallendarArrowForward() throws InterruptedException {
        Common.waitForElementToBeVisible(5, Locator.Ryanair.HotelBookingPage.calendarForwardArrowButton);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.calendarForwardArrowButton);
        Thread.sleep(2);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.calendarForwardArrowButton);
        Common.clickOnElement(Locator.Ryanair.HotelBookingPage.calendarForwardArrowButton);
    }
}
