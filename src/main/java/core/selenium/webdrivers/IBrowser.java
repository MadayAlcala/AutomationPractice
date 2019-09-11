package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * IBrowser, this interface is used in order to have a Strategy pattern.
 *
 * @author Maday Alcala.
 * @version 0.0.1
 */
public interface IBrowser {
    /**
     * This method initializes the browser according to the classes that implement this interface.
     *
     * @return initDriver, that init the necessary browser.
     */
    WebDriver initDriver();
}
