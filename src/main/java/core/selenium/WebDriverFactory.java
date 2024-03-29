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

import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import core.selenium.webdrivers.BrowserType;
import core.selenium.webdrivers.IBrowser;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static core.selenium.webdrivers.BrowserType.CHROME;
import static core.selenium.webdrivers.BrowserType.FIREFOX;

/**
 * WebDriverFactory class, this class initializes a browser according to the type it receives.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public final class WebDriverFactory {

    /**
     * This is the empty constructor according to checkstyle.
     */
    private WebDriverFactory() {
    }

    /**
     * This method returns the initialized web driver according to the name of the browser it receives.
     *
     * @param browserType 'browserType', this parameter indicates the type of browser to be initialized.
     * @return webDriver, an initialized browser.
     */
    public static WebDriver getWebDriver(final BrowserType browserType) {
        Map<BrowserType, IBrowser> map = new HashMap<>();
        map.put(CHROME, new Chrome());
        map.put(FIREFOX, new Firefox());
        return map.get(browserType).initDriver();
    }
}
