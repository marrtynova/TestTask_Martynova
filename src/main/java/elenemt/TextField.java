package elenemt;

import browser.BrowserFactory;
import org.openqa.selenium.By;

public class TextField extends BaseElement {

    public TextField(By locator, String elementName) {
        super(locator, elementName);
    }

    public void sendText(String text) {
        BrowserFactory.getBrowser().findElement(this.getLocator()).sendKeys(text);
    }
}
