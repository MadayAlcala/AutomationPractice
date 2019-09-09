package AutomationPractice.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * BasePage class, this class is the intermediary between the 'WebDriverManager' class and the pages.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public abstract class BasePage {
    protected WebDriver driver;

    /**
     * This method initializes the base class.
     */
    public BasePage() {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver, this);
//        this.driver.quit();
    }
}
