import lt.andrius.pom.pages.ryanair.FlightSearchPage;
import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightSearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {

        FlightSearchPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();
    }

    @Test
    public void testFlightSelect() throws InterruptedException {

        String expectedResult = "FR 6637";
        String actualResult;

        FlightSearchPage.clickOneWay();
        FlightSearchPage.clickOnFromTextBox();
        Thread.sleep(1000);
        FlightSearchPage.inputDeparture();
        Thread.sleep(1000);
        FlightSearchPage.inputDestination();
        Thread.sleep(1000);
        FlightSearchPage.inputDestinationAirport();
        Thread.sleep(1000);
        FlightSearchPage.clickOnDepartDateBox();
        FlightSearchPage.clickOnButtonDone();
        FlightSearchPage.clickOnSearchBox();
        Thread.sleep(1000);

        actualResult = FlightSearchPage.readFlightNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
