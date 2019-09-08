package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * WebDriverManager class, this class is responsible for creating an instance of a browser.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public final class WebDriverManager {
    private static WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private static WebDriver webDriver;
    private static WebDriverManager instance = null;
    private static WebDriverWait webDriverWait;

    /**
     * Constructor of WebDriverManager.
     */
    private WebDriverManager() {
        initialize();
    }

    /**
     * This method verifies that there is only one instance of 'WebDriverManager'
     * and if there is not, it creates it, according to the Singleton pattern.
     *
     * @return 'instance' variable, that is an instance of WebDriverManager.
     */
    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    /**
     * This method initializes the browser characteristics.
     */
    private void initialize() {
        this.webDriver = WebDriverFactory.getWebDriver(webDriverConfig.getBrowser());
        this.webDriver.get("http://automationpractice.com/index.php");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, webDriverConfig.getExplicitWaitTime());
    }

    /**
     * This method is in charge of return an instance if WebDriverManager.
     *
     * @return webDriver, that is an instance of a browser.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
