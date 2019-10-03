/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package steps;

import AutomationPractice.entities.Context;
import AutomationPractice.ui.pages.AddressPage;
import AutomationPractice.ui.PageTransporter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.Map;

/**
 * AddressSteps class, here are implemented the steps for the address of users.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class AddressSteps {
    private final Context context;
    private AddressPage addressPage;

    /**
     * This is the constructor.
     *
     * @param context context.
     */
    public AddressSteps(final Context context) {
        this.context = context;
    }

    /**
     * This method fills the form address to be able to create it.
     *
     * @param addressMap that indicates all the fields.
     */
    @When("^The user fills the form with the following information$")
    public void crateNewAddress(final Map<String, String> addressMap) {
        addressPage = new AddressPage();
        context.getAddress().setAccountInformation(addressMap);
        addressPage.setAccountInformation(addressMap);
        addressPage.clickSubmitBtn();
    }

    /**
     * This method verifies the correct address creation.
     */
    @Then("^The address information should be displayed in the Address page$")
    public void verifyTheAddressInformation() {
        Assert.assertEquals(addressPage.composeStrategyMap(), context.getAddress().composeStrategyMap());
    }
}
