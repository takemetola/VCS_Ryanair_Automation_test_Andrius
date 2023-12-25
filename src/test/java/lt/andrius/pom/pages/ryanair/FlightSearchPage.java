package lt.andrius.pom.pages.ryanair;

import lt.andrius.pom.pages.Common;
import lt.andrius.pom.pages.Locator;

public class FlightSearchPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOneWay() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnOneWayRadioButton);
    }

    public static void clickOnFromTextBox() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickonTextBox);
    }

    public static void inputDeparture() {
        Common.waitForElementToBeVisible(1,Locator.Ryanair.FlightSearchPage.waitForElement);
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementVNO);
    }

    public static void inputDestination() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.FlightSearchPage.waitForElementGermany);
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementGermany);
    }

    public static void inputDestinationAirport() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementBerlinBrandenburg);
    }

    public static void clickOnDepartDateBox() {
        Common.waitForElementToBeVisible(1, Locator.Ryanair.FlightSearchPage.waitForDepartBox);
        Common.scrollWindowByActionsPlus300Y();
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnDeparturesDateBox);
    }

    public static void clickOnButtonDone() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnDone);
    }

    public static void clickOnSearchBox() {
        Common.scrollWindowByActionsMinus300Y();
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnBox);
    }

    public static String readFlightNumber() {
        Common.waitForElementToBeVisible(2, Locator.Ryanair.FlightSearchPage.waitForFlightNumber);
        return Common.getText(Locator.Ryanair.FlightSearchPage.getTextFlighNumber);
    }

    public static void clickOnCookies() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickReject);
    }
}
