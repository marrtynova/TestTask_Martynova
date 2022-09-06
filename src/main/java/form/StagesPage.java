package form;

import elenemt.Label;
import org.openqa.selenium.By;
import utils.ConfigManager;

public class StagesPage extends BaseForm {

    private static String stagesPageLocator = "//input[@type='search']";
    private Label addressLabel = new Label(By.xpath("//span[@data-testid='address']"), "Address label");
    private Label checkInDate = new Label(By.xpath("//button[@data-testid='date-display-field-start']"), "Check-in date");
    private Label checkOutDate = new Label(By.xpath("//button[@data-testid='date-display-field-end']"), "Check-out date");

    public StagesPage() {
        super(By.xpath(stagesPageLocator), "Stages page");
    }

    public boolean containCity() {
        return addressLabel.getText().contains(ConfigManager.getTestDataProperty("destination"));
    }

    public boolean addressContainCheckInDate() {
        return checkInDate.getText().contains(ConfigManager.getTestDataProperty("firstMonthOfTrip") + " " +
                ConfigManager.getTestDataProperty("firstDayOfTrip") + ", "+ConfigManager.getTestDataProperty("yearOfTrip"));
    }

    public boolean addressContainCheckOutDate() {
        return checkOutDate.getText().contains(ConfigManager.getTestDataProperty("lastMonthOfTrip") + " " +
                ConfigManager.getTestDataProperty("lastDayOfTrip") + ", "+ConfigManager.getTestDataProperty("yearOfTrip"));
    }
}