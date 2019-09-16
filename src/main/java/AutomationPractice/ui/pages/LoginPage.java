/*
 * @(#) FormPageFour.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import AutomationPractice.ui.Common.ReadAppFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * LoginPage class, this class is in charge of the login elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class LoginPage extends BasePage {

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    @FindBy(id = "email")
    private WebElement emailTxtb;

    @FindBy(id = "passwd")
    private WebElement passwordTxtb;

    @FindBy(css = "#SubmitLogin > span")
    private WebElement loginBtn;

    /**
     * This method is in charge of the login to the application.
     *
     * @param email 'email', it indicates the email with which the login will be carried out.
     * @param password 'password', it indicates the password with which the login will be carried out.
     */
    public void login(final String email, final String password) {
        clickSignInLink();
        setEmail(ReadAppFile.getInstance().getEmail());
        setPassword(ReadAppFile.getInstance().getPassword());
        clickSignInBtn();
    }

    /**
     * This method is in charge of clicking on the sign in textLink.
     */
    private void clickSignInLink() {
        signInLink.click();
    }

    /**
     * This method sets the username in the text box of the login form.
     *
     * @param email 'username', that represent a valid email.
     */
    private void setEmail(final String email) {
        emailTxtb.sendKeys(email);
    }

    /**
     * This method sets the password in the text box of the login form.
     *
     * @param password 'password', that represent a valid password for the email.
     */
    private void setPassword(final String password) {
        passwordTxtb.sendKeys(password);
    }

    /**
     * This method is in charge of clicking on the sign up button.
     */
    private void clickSignInBtn() {
        loginBtn.click();
    }
}
