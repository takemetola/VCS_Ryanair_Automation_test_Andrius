package lt.andrius.pom.tests.ryanair;

import lt.andrius.pom.pages.ryanair.FlightSearchPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlightSearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {

        FlightSearchPage.openUrl("https://www.ryanair.com/gb/en");
        FlightSearchPage.clickOnCookies();
    }

    @DataProvider(name = "testFlightSelect")
    public static Object[][] provideDataForTestFlightSelect() {
        return new Object[][]{
                {"Vilnius", "Berlin Brandenburg", "FR 1571"}
        };
    }

    @Test(dataProvider = "testFlightSelect")
    public void testFlightSelect(String departureCity, String destinationCity, String expectedResult) throws InterruptedException {

        String actualResult;

        FlightSearchPage.clickOneWay();
        FlightSearchPage.clickOnFromTextBox();
        FlightSearchPage.inputDeparture(departureCity);
        FlightSearchPage.inputDestination(destinationCity);
        FlightSearchPage.calendarArrowClickForward();
        FlightSearchPage.clickOnDepartDateBox();
        FlightSearchPage.clickOnButtonDone();
        FlightSearchPage.clickOnSearchBox();

        actualResult = FlightSearchPage.readFlightNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
