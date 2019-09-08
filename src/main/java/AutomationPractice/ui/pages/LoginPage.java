package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * BasePage class, this class is the intermediary between the 'WebDriverManager' class and the pages.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class LoginPage extends BasePage {

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    @FindBy(id = "email")
    private WebElement userNameTxtb;

    @FindBy(id = "passwd")
    private WebElement passwordTxtb;

    @FindBy(css = "#SubmitLogin > span")
    private WebElement loginBtn;

    @FindBy(css = ".account > span")
    private WebElement userNameText;

    /**
     * This method is in charge of the login to the application.
     *
     * @param email 'email', it indicates the email with which the login will be carried out.
     * @param password 'password', it indicates the password with which the login will be carried out.
     */
    public void login(final String email, final String password) {
        clickSignInLink();
        setUserName(email);
        setPassword(password);
        clickSignInBtn();
    }

    /**
     * This method is in charge of clicking on the sign in textLink.
     */
    public void clickSignInLink() {
        signInLink.click();
    }

    /**
     * This method sets the username in the text box of the login form.
     *
     * @param userName 'username', that represent a valid email.
     */
    public void setUserName(final String userName) {
        userNameTxtb.sendKeys(userName);
    }

    /**
     * This method sets the password in the text box of the login form.
     *
     * @param password 'password', that represent a valid password for the email.
     */
    public void setPassword(final String password) {
        passwordTxtb.sendKeys(password);
    }

    /**
     * This method is in charge of clicking on the sign up button.
     */
    public void clickSignInBtn() {
        loginBtn.click();
    }

    /**
     * This method recovers the text of the username.
     *
     * @return value, that represent the username text.
     */
    public String getText() {
        return userNameText.getText();
    }

    /**
     * This method closes the driver.
     */
    public void quitWindow() {
        driver.quit();
    }
}


