package core.selenium;

import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import core.selenium.webdrivers.Browser;
import org.openqa.selenium.WebDriver;

public final class WebDriverFactory {
    private static WebDriver webDriver;
    public static final String MESSAGE_FOR_UNKNOWN_BROWSER = "Unknown browser type";

    public static WebDriver getWebDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                webDriver = new Chrome().init();
                break;
            case FIREFOX:
                webDriver = new Firefox().init();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_BROWSER);
        }
        return webDriver;
    }
}
