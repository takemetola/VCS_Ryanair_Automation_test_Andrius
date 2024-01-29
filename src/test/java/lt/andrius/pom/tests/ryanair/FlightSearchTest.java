package lt.andrius.pom.tests.ryanair;

import lt.andrius.pom.pages.ryanair.FlightSearchPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightSearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {

        FlightSearchPage.openUrl("https://www.ryanair.com/gb/en");
        FlightSearchPage.clickOnCookies();
    }

    @Test
    public void testFlightSelect() throws InterruptedException {

        String expectedResult = "FR 6637";
        String actualResult;

        FlightSearchPage.clickOneWay();
        FlightSearchPage.clickOnFromTextBox();
        FlightSearchPage.inputDeparture();
        FlightSearchPage.inputDestination();
        FlightSearchPage.inputDestinationAirport();
        //FlightSearchPage.calendarArrowClickForward();
        FlightSearchPage.clickOnDepartDateBox();
        FlightSearchPage.clickOnButtonDone();
        FlightSearchPage.clickOnSearchBox();

        actualResult = FlightSearchPage.readFlightNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
