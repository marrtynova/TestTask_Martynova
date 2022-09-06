package browser;

public class Browser {

    public Browser() {

    }

    public void openUrl(String url) {
        BrowserFactory.getBrowser().get(url);
    }

    public void quitDriver() {
        BrowserFactory.getBrowser().quit();
    }

    public void maximizeBrowserSize(){
        BrowserFactory.getBrowser().manage().window().maximize();
    }
}
