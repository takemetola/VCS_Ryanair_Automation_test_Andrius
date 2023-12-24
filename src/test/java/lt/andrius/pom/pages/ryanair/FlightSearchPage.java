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
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementVNO);
    }

    public static void inputDestination() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementGermany);
    }

    public static void clickOnDepartDateBox() {
        Common.scrollWindowByActions();
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnDeparturesDateBox);
    }

    public static void inputDestinationAirport() {
        Common.clickOnElement(Locator.Ryanair.FlightSearchPage.clickOnElementBerlinBrandenburg);
    }
}
