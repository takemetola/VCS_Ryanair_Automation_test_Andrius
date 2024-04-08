package lt.andrius.pom.tests.ryanair;

import lt.andrius.pom.pages.ryanair.HotelBookingPage;
import lt.andrius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotelBookingTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HotelBookingPage.openUrl("https://www.ryanair.com/gb/en");
        HotelBookingPage.clickOnCookies();
    }

    @DataProvider(name = "testHotelBooking")
    public static Object[][] provideDataForTestHotelBooking() {
        return new Object[][]{
                {"Berlin", "Berlin (and vicinity), Germany"}
        };
    }

    @Test(dataProvider = "testHotelBooking")
    public void testHotelBooking(String destinationHotel, String expectedResult) throws InterruptedException {
        String actualResult;

        HotelBookingPage.clickOnButtonHotels();
        HotelBookingPage.addTextToFindHotel(destinationHotel);

        HotelBookingPage.clickOnChooseCheckInDate();
        HotelBookingPage.clickCallendarArrowForward();
        HotelBookingPage.clickOnStartDate();
        HotelBookingPage.clickOnEndDate();
        HotelBookingPage.clickOnSearchButton();

        actualResult = HotelBookingPage.readTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
