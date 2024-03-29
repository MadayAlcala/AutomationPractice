/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package runner;

import AutomationPractice.ui.Report.Report;
import core.selenium.WebDriverManager;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"steps", "hook"},
        features = {"src/test/resources/feature"})

public class RunCukesTest extends AbstractTestNGCucumberTests {
    /**
     * This method afterExecution executes the project, close the driver instance and generates the reports.
     */
    @AfterTest
    public void afterExecution() {
        WebDriverManager.getInstance().getWebDriver().quit();
        Report.getInstance().generateReport();
    }
}
