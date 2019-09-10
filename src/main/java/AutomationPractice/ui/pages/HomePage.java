package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * HomePage class, this class have the locators of the HomePage.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class HomePage extends BasePage {
    @FindBy(css = ".account > span")
    private WebElement userNameText;

    /**
     * This method recovers the text of the username.
     *
     * @return value, that represent the username text.
     */
    public String getUserNameText() {
        return userNameText.getText();
    }
}
