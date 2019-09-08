package steps;

import AutomationPractice.ui.pages.LoginPage;
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
    private static  LoginPage loginPage;

    /**
     * This method is in charge of opening the page.
     */
    @Given("I visit the login page")
    public void initializeLoginPage() {
        loginPage = new LoginPage();
    }

    /**
     * This method fills in the user data to be able to log in.
     *
     * @param email 'email', represents the email of an user.
     * @param password 'password', represents the password according to the emal.
     */
    @When("^I fill the form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillLogInForm(String email, String password) {
        email = "smilingly3@gmail.com";
        password = "tresconejos";
        loginPage.login(email, password);
    }

    /**
     * This method checks that the username is displayed in the window.
     */
    @Then("Username should appear in the left panel")
    public void verifyUserName() {
        Assert.assertEquals(loginPage.getText(), "Maday Alcala",
                "It is not the same text");
        loginPage.quitWindow();
    }
}
