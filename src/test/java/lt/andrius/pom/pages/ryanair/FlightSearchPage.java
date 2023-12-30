package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class FlightSearchPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOneWay() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.radioButtonOneWay);
    }

    public static void clickOnFromTextBox() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.inputDeparture);
    }

    public static void inputDeparture() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.FlightSearchPage.spanElementAirport);
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.spanElementVNO);
    }

    public static void inputDestination() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.FlightSearchPage.spanElementCountry);
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.spanElementGermany);
    }

    public static void inputDestinationAirport() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.spanEelementBER);
    }

    public static void clickOnDepartDateBox() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.FlightSearchPage.divDepartBox);
        Common.scrollWindowByActionsPlus300Y();
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.divDepartDate);
    }

    public static void clickOnButtonDone() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.buttonDone);
    }

    public static void clickOnSearchBox() {
        Common.scrollWindowByActionsMinus300Y();
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.buttonSearch);
    }

    public static String readFlightNumber() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.FlightSearchPage.divFlightNumber);
        return Common.getText(Locator.Ryanair.FlightSearchPage.divFlightNum);
    }

    public static void clickOnCookies() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.buttonRejectCookies);
    }
}
