package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement loginForm;

    public void login(final String email, final String password) {
        clickSignInLink();
        setUserName(email);
        setPassword(password);
        clickSignInBtn();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void setUserName(final String userName) {
        userNameTxtb.sendKeys(userName);
    }

    public void setPassword(final String password) {
        passwordTxtb.sendKeys(password);
    }

    public void clickSignInBtn() {
        loginBtn.click();
    }

    public String getValue() {
        return loginForm.getText();
    }

    public void quitWindow() {
        driver.quit();
    }
}


