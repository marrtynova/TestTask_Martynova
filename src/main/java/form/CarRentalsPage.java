package form;

import elenemt.Button;
import org.openqa.selenium.By;

public class CarRentalsPage extends BaseForm {

    private static String stagesPageLocator = "//a[@data-decider-header='bookinggo']";
    private Button carRentalsButton = new Button(By.xpath("//a[@data-decider-header='bookinggo']"), "Car rentals button");
    private Button londonButton = new Button(By.xpath("//h3[@class='bui-card__title']"), "City button");

    public CarRentalsPage() {
        super(By.xpath(stagesPageLocator), "Stages page");
    }

    public void clickCarRentalsButton() {
        carRentalsButton.clickButton();
    }

    public void clickCityButton() {
        londonButton.scrollTo();
        londonButton.clickButton();
    }
}
