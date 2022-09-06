import browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigManager;

public class BaseTest {

    Browser browser = new Browser();

    @BeforeMethod
    public void setUp() {
        browser.maximizeBrowserSize();
        browser.openUrl(ConfigManager.getConfigurationProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        browser.quitDriver();
    }
}