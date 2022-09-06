import form.BookingPage;
import form.CarRentalsPage;
import form.DestinationForm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarRentalsTest extends BaseTest {


    DestinationForm destinationForm = new DestinationForm();
    CarRentalsPage carRentalsPage = new CarRentalsPage();
    BookingPage bookingPage = new BookingPage();

    @Test
    public void searchCarRentalTest() throws InterruptedException {

        carRentalsPage.clickCarRentalsButton();
        carRentalsPage.isPageOpen();
        carRentalsPage.clickCityButton();
        carRentalsPage.switchToNewWindow();
        destinationForm.chooseDateForRentingCar();
        destinationForm.chooseTheFirstDayOfRentingCar();
        destinationForm.clickSearchButton();
        Thread.sleep(4000);
        bookingPage.isPageOpen();
        Assert.assertTrue(bookingPage.isTitleTheSame(), "The title isn't the same");
    }
}
