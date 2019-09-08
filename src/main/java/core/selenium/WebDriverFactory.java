package core.selenium;

import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import core.selenium.webdrivers.BrowserType;
import org.openqa.selenium.WebDriver;

/**
 * WebDriverFactory class, this class initializes a browser according to the type it receives.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public final class WebDriverFactory {
    private static WebDriver webDriver;
    private static final String MESSAGE_FOR_UNKNOWN_BROWSER = "Unknown browser type";

    /**
     * This method returns the initialized web driver according to the name of the browser it receives.
     *
     * @param browserType 'browserType', this parameter indicates the type of browser to be initialized.
     * @return webDriver, an initialized browser.
     */
    public static WebDriver getWebDriver(BrowserType browserType) {
        switch (browserType) {
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
