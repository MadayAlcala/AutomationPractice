package hook;

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

    /**
     * Constructor of Hook.
     */
    public Hook() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * This method is executed after the scenarios.
     *
     * @param scenario that represent the scenarios of cucumber.
     */
    @After
    public void tearDown(final Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }
}
