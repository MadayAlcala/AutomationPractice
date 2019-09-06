package core.selenium;

import core.selenium.webdrivers.Browser;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public final class WebDriverConfig {
    private static WebDriverConfig instance = null;
    private Properties properties;
    private InputStream inputProperties;
    private static final String BROWSER = "browser";
    private static final String IMPLICIT_WAIT_TIME = "implicitWaitTime";
    private static final String EXPLICIT_WAIT_TIME = "explicitWaitTime";

    private WebDriverConfig() {
        initialize();
    }

    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    public void initialize() {
        try {
            inputProperties = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputProperties);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public Browser getBrowser() {
        return Browser.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    public int getImplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(IMPLICIT_WAIT_TIME));
    }

    public int getExplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(EXPLICIT_WAIT_TIME));
    }
}
