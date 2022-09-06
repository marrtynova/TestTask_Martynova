import form.DestinationForm;
import form.StagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigManager;

public class FindStayTest extends BaseTest {

    StagesPage stagesPage = new StagesPage();
    DestinationForm destinationForm = new DestinationForm();

    @Test
    public void chooseAndCheckStayTest() {

        destinationForm.sendTextToDestinationTextField(ConfigManager.getTestDataProperty("destination"));
        destinationForm.clickDateButton();
        destinationForm.clickFirstDay();
        destinationForm.clickLastDay();
        destinationForm.clickSearchButton();
        Assert.assertTrue(stagesPage.containCity(),"The address doesn't contain" + ConfigManager.getTestDataProperty("destination"));
        Assert.assertTrue(stagesPage.addressContainCheckInDate(),"The address doesn't contain check-in date");
        Assert.assertTrue(stagesPage.addressContainCheckOutDate(),"The address doesn't contain check-out date");
    }
}