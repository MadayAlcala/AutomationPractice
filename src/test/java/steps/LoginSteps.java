package steps;

import AutomationPractice.ui.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    LoginPage loginPage;

    @Given("I visit the login page")
    public void i_visit_the_login_page() {
        loginPage = new LoginPage();
    }

    @When("^I fill the form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_fill_the_form_with_and(String email, String password) {
        loginPage.login("smilingly3@gmail.com", "tresconejos");
    }

    @Then("Username should appear in the left panel")
    public void username_should_appear_in_the_left_panel() {
        Assert.assertEquals(loginPage.getValue(), "Maday Alcala",
                "It is not the same text");
        loginPage.quitWindow();
    }
}

