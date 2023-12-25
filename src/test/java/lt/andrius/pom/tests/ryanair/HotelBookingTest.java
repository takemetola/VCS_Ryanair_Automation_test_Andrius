import lt.andrius.pom.pages.ryanair.HotelBookingPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelBookingTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HotelBookingPage.openUrl("https://www.ryanair.com/gb/en");
        HotelBookingPage.clickOnCookies();
    }

    @Test
    public void testHotelBooking() {
        String destinationHotel = "Berlin";
        String expectedResult =
                "Properties in Berlin (and vicinity), Germany. January 27, 2024 through January 28, 2024";
        String actualResult;

        HotelBookingPage.clickOnButtonHotels();
        HotelBookingPage.clickOnChooseCheckInDate();
        HotelBookingPage.clickOnStartDate();
        HotelBookingPage.clickOnEndDate();
        HotelBookingPage.addTextToFindHotel(destinationHotel);
        HotelBookingPage.clickOnElementBerlin();
        HotelBookingPage.clickOnSearchButton();

        actualResult = HotelBookingPage.readTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
