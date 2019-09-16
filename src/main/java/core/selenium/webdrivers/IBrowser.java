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
