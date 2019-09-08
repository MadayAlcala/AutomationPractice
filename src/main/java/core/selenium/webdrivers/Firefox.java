package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Firefox, this class is in charge of initializing the specific characteristics of Firefox.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Firefox {

    /**
     * Initializes Firefox driver.
     *
     * @return a FirefoxDriver.
     */
    public WebDriver init() {
        FirefoxDriverManager.getInstance().version("0.24.0").setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }
}
