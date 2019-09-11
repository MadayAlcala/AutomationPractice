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

    @FindBy(linkText = "Sign out")
    private WebElement signOutLink;

    /**
     * This method recovers the text of the username.
     *
     * @return value, that represent the username text.
     */
    public String getUserNameText() {
        return userNameText.getText();
    }

    /**
     * This method is in charge of clicking on the sign out button.
     */
    public void clickSignOutLink() {
        signOutLink.click();
    }

    /**
     * This method recovers the text of the signOutLink.
     *
     * @return signOutLink, that represent the signOutLink text.
     */
    public String signOutLink() {
        return signOutLink.getText();
    }
}
