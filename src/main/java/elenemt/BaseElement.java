package elenemt;

import browser.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public abstract class BaseElement {

    private By locator;
    private String elementName;

    public BaseElement(By locator, String elementName) {
        this.elementName = elementName;
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

    public String getElementName() {
        return elementName;
    }

    public void clickButton() {
        BrowserFactory.getBrowser().findElement(this.locator).click();
    }

    public String getText() {
        return BrowserFactory.getBrowser().findElement(this.locator).getText();
    }

    public void scrollTo() {
        ((JavascriptExecutor) BrowserFactory.getBrowser()).executeScript("arguments[0].scrollIntoView();", BrowserFactory.getBrowser().findElement(this.locator));
    }
}