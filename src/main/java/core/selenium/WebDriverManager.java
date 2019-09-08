package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public final class WebDriverManager {
    private WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private WebDriver webDriver;
    private static WebDriverManager instance = null;
    private WebDriverWait webDriverWait;

    private WebDriverManager() {
        initialize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize() {
        this.webDriver = WebDriverFactory.getWebDriver(webDriverConfig.getBrowser());
        this.webDriver.get("http://automationpractice.com/index.php");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, webDriverConfig.getExplicitWaitTime());
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWait(){
        return webDriverWait;
    }
}
