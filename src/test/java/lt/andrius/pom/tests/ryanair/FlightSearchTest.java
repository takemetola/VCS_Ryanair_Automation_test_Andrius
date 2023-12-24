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

        String expectedResult = "";
        String actualResult;


        FlightSearchPage.clickOneWay();
        FlightSearchPage.clickOnFromTextBox();
        FlightSearchPage.inputDeparture();
        FlightSearchPage.inputDestination();
        Thread.sleep(1000);
        FlightSearchPage.inputDestinationAirport();

        FlightSearchPage.clickOnDepartDateBox();

        actualResult = "";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
