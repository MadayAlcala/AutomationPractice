/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package hook;

import AutomationPractice.ui.entities.Context;
import AutomationPractice.ui.pages.AddressPage;
import AutomationPractice.ui.pages.HomePage;
import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Hook class, here are implemented the hook for cucumber screenshots.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Hook {
    private final WebDriver webDriver;
    private final Context context;

    /**
     * Constructor of Hook.
     *
     * @param context represent the entities that it could be called.
     */
    public Hook(final Context context) {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        this.context = context;
    }

    /**
     * This method is executed after the scenarios.
     *
     * @param scenario that represent the scenarios of cucumber.
     */
    @After
    public void tearDown(final Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    /**
     * This method is for delete an address.
     */
    @After(order = 1, value = "@DeleteAddress")
    public void deleteContact() {
        AddressPage addressPage = new AddressPage();
        if (context.getAddress().getAlias().equals(addressPage.getAliasTxt())) {
            addressPage.deleteAddress();
        }
    }

    /**
     * This method is sign out of the app.
     */
    @After(order = 0, value = "@signOut")
    public void signOut() {
        HomePage homePage = new HomePage();
        homePage.clickSignOutLink();
    }
}
