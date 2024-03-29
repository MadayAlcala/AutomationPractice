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

import AutomationPractice.ui.pages.HomePage;
import AutomationPractice.ui.pages.LoginPage;
import AutomationPractice.ui.pages.PageTransporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * LoginSteps class, here are implemented the steps for the login of users.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class LoginSteps {
    private LoginPage loginPage;
    private HomePage homePage;

    /**
     * This method is in charge of opening the login page.
     *
     * @param url is the parameter that indicates what type of url needed.
     */
    @Given("The user goes to \"([^\"]*)\" page")
    public void initializeLoginPage(final String url) {
        PageTransporter.goToUrl(url);
    }

    /**
     * This method fills in the user data to be able to log in.
     *
     * @param email    'email', represents the email of an user.
     * @param password 'password', represents the password according to the emal.
     */
    @When("^The user fills the form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillLogInForm(final String email, final String password) {
        loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    /**
     * This method checks that the username is displayed in the window.
     */
    @Then("Username should appear in the left panel")
    public void verifyUserName() {
        homePage = new HomePage();
        Assert.assertEquals(homePage.getUserNameText(), "Maday Alcala",
                "It is not the same text");
    }

    /**
     * This method checks that the 'Sign out' linkText is displayed in the window.
     *
     * @param signOut that represent the link that should appear.
     */
    @Then("^\"([^\"]*)\" should appear$")
    public void shouldAppearLinkText(final String signOut) {
        homePage = new HomePage();
        Assert.assertEquals(homePage.signOutLink(), signOut,
                "It is not the same text");
    }
}
