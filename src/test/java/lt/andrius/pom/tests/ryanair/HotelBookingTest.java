import lt.andrius.pom.pages.ryanair.HotelBookingPage;
import lt.andrius.pom.pages.ryanair.LoginPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelBookingTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp(){
        HotelBookingPage.openUrl("https://www.ryanair.com/gb/en");
        LoginPage.clickOnCookies();
    }
    @Test
    public void testHotelBooking() throws InterruptedException {
        String destinationHotel = "Berlin";
        String expectedResult =
                "Properties in Berlin (and vicinity), Germany. January 27, 2024 through January 28, 2024";
        String actualResult;

        HotelBookingPage.clickOnButtonHotels();
        Thread.sleep(1000);
        HotelBookingPage.clickOnChooseCheckInDate();
        HotelBookingPage.clickOnStartDate();
        HotelBookingPage.clickOnEndDate();
        HotelBookingPage.addTextToFindHotel(destinationHotel);
        Thread.sleep(1000);
        HotelBookingPage.clickOnElementBerlin();
        HotelBookingPage.clickOnSearchButton();
        HotelBookingPage.clickOnRejectAllCookiesButton();
        Thread.sleep(2000);

        actualResult = HotelBookingPage.readTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
