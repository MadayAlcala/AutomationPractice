package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Chrome, this class is in charge of initializing the specific characteristics of Chrome.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Chrome {

    /**
     * Initializes Chrome driver.
     *
     * @return a ChromeDriver.
     */
    public WebDriver init() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        return new ChromeDriver(chromeOptions);
    }
}
