/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package core.selenium.webdrivers;

import core.selenium.IBrowser;
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
public class Chrome implements IBrowser {

    /**
     * Initializes Chrome driver.
     *
     * @return a ChromeDriver.
     */
    @Override
    public WebDriver initDriver() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        return new ChromeDriver(chromeOptions);
    }
}
