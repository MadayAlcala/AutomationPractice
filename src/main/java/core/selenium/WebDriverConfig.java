/*
 * @(#) FormPageFour.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium;

import AutomationPractice.ui.Common.PropertyLoader;
import core.selenium.webdrivers.BrowserType;

import java.util.Properties;

/**
 * WebDriverConfig, this class is in charge of the basic configuration of the browser.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public final class WebDriverConfig {
    private static WebDriverConfig instance;
    private static Properties properties;
    private static final String BROWSER = "browser";
    private static final String IMPLICIT_WAIT_TIME = "implicitWaitTime";
    private static final String EXPLICIT_WAIT_TIME = "explicitWaitTime";
    private static final String BROWSER_PROPERTIES = "gradle.properties";

    /**
     * Constructor of WebDriverConfig.
     */
    private WebDriverConfig() {
        initialize();
    }

    /**
     * This method verifies that there is only one instance of 'WebDriverConfig' and if there is not,
     * it creates it, according to the Singleton pattern.
     *
     * @return an instance of WebDriverConfig.
     */
    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    /**
     * This method reads browser properties and initializes the basic browser characteristics.
     */
    public void initialize() {
        properties = PropertyLoader.loadProperty(BROWSER_PROPERTIES);
    }

    /**
     * This method gets the browser type set for the WebDriver.
     *
     * @return a browser type.
     */
    public BrowserType getBrowser() {
        return BrowserType.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    /**
     * This method gets the implicit wait time set for the WebDriver.
     *
     * @return the implicit wait time for the browser.
     */
    public int getImplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(IMPLICIT_WAIT_TIME));
    }

    /**
     * This method gets the explicit wait time set for the WebDriver.
     *
     * @return the explicit wait time for the browser.
     */
    public int getExplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(EXPLICIT_WAIT_TIME));
    }
}
