package form;

import browser.BrowserFactory;
import org.openqa.selenium.By;

public abstract class BaseForm {

    private String pageName;
    private By uniqueElement;

    public BaseForm(By uniqueElement, String pageName) {
        this.uniqueElement = uniqueElement;
        this.pageName = pageName;
    }

    public boolean isPageOpen() {
        return BrowserFactory.getBrowser().findElement(this.uniqueElement).isDisplayed();
    }

    public void switchToNewWindow() {
        for (String winHandle : BrowserFactory.getBrowser().getWindowHandles()) {
            BrowserFactory.getBrowser().switchTo().window(winHandle);
        }
    }
}