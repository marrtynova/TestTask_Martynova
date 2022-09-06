package form;

import elenemt.Label;
import org.openqa.selenium.By;
import utils.ConfigManager;

public class BookingPage extends BaseForm {

    private static String stagesPageLocator = "//td[@class='ab-SearchSummary_GridFix-1']//div[@class='ab-SearchSummary_PickUp_City']";
    private Label title = new Label(By.xpath("//td[@class='ab-SearchSummary_GridFix-1']//div[@class='ab-SearchSummary_PickUp_City']"), "Title city");

    public BookingPage() {
        super(By.xpath(stagesPageLocator), "Stages page");
    }

    public boolean isTitleTheSame() {
        return title.getText().contains(ConfigManager.getTestDataProperty("city"));
    }
}
