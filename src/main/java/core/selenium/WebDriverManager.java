/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

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
    private static WebDriver webDriver;
    private static WebDriverManager instance;
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
        if (instance == null || webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    /**
     * This method initializes the browser characteristics.
     */
    private void initialize() {
        webDriver = WebDriverFactory.getWebDriver(WebDriverConfig.getInstance().getBrowser());
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(WebDriverConfig.getInstance().getImplicitWaitTime(),
                TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, WebDriverConfig.getInstance().getExplicitWaitTime());
    }

    /**
     * This method is in charge of return an instance of WebDriverManager.
     *
     * @return webDriver, that is an instance of a browser.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

    /**
     * This method is in charge of return an instance of WebDriverWait.
     *
     * @return webDriverWait, that is an instance of a Wait.
     */
    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
