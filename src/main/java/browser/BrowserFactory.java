package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigManager;

import java.util.HashMap;

public class BrowserFactory {

    private static WebDriver driver;

    public static WebDriver getBrowser() {
        if (driver == null) {
            switch ((ConfigManager.getConfigurationProperty("browserName"))) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                    chromePrefs.put("profile.default_content_settings.popups", 0);
                    chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", chromePrefs);
                    break;
                default:
                    throw new UnsupportedOperationException("The browser " + (ConfigManager.getConfigurationProperty("browserName")) + " didn't found");
            }
        }
        return driver;
    }
}