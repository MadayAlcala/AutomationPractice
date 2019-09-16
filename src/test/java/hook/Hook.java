package hook;

import AutomationPractice.ui.entities.Context;
import AutomationPractice.ui.pages.AddressPage;
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
    private WebDriver webDriver;
    private Context context;

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
    @After("@DeleteAddress")
    public void deleteContact() {
        AddressPage addressPage = new AddressPage();
        if (context.getAddress().getAlias().equals(addressPage.getAliasTxt())) {
            addressPage.deleteAddress();
        }
    }
}
