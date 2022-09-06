package form;

import elenemt.Button;
import elenemt.Label;
import elenemt.TextField;
import org.openqa.selenium.By;

public class DestinationForm extends BaseForm {

    private static String stagesPageLocator = "//a[@data-decider-header='attractions']";
    private TextField destinationTextField = new TextField(By.xpath("//input[@type='search']"), "Where are you going text field");
    private Label firstDayOfTrip = new Label(By.xpath("//span[@aria-label='1 October 2022']"), "First day of trip");
    private Label lastDayOfTrip = new Label(By.xpath("//span[@aria-label='31 October 2022']"), "Last day of trip");
    private Label chooseDateCar = new Label(By.xpath("//div[@data-calendar2-type='checkin']//button[@aria-label='Open calendar']"), "Button to choose the date");
    private Label firstDayOfRentingCar = new Label(By.xpath("//th[text()='September 2022']/following::tr[4]/td[@data-id='1662940800000'][1]"), "");
    private Label dateButton = new Label(By.xpath("//div[@class=\"xp__dates-inner\"]"), "");
    private Button searchButton = new Button(By.xpath("//button[@class='sb-searchbox__button ']"), "");

    public void clickSearchButton() {
        searchButton.clickButton();
    }

    public DestinationForm() {
        super(By.xpath(stagesPageLocator), "Attractions page");
    }

    public void sendTextToDestinationTextField(String destination) {
        destinationTextField.sendText(destination);
    }

    public void clickFirstDay() {
        firstDayOfTrip.clickButton();
    }

    public void clickLastDay() {
        lastDayOfTrip.clickButton();
    }

    public void clickDateButton() {
        dateButton.clickButton();
    }

    public void chooseDateForRentingCar() {
        chooseDateCar.clickButton();
    }

    public void chooseTheFirstDayOfRentingCar() {
        firstDayOfRentingCar.clickButton();
    }
}