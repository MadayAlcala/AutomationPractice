package steps;

import AutomationPractice.ui.pages.AddressPage;
import AutomationPractice.ui.pages.PageTransporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * AddressSteps class, here are implemented the steps for the address of users.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class AddressSteps {
    private AddressPage accountPage;

    /**
     * This method is in charge of opening the address page.
     *
     * @param url is the parameter that indicates what type of url needed.
     */
    @Given("^I go to update \"([^\"]*)\" form$")
    public void goToAddressPage(final String url) {
        PageTransporter.goToUrl(url);
        accountPage = new AddressPage();
    }

    /**
     * This method fills a field of the address to be able to update it.
     *
     * @param userName that indicates de type of field.
     */
    @When("^I update a \"([^\"]*)\" of the address$")
    public void updateUserName(final String userName) {
        accountPage.address("SomeName");
    }
}
