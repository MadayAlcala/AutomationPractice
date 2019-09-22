/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Account class, this class is in charge of the account elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Account extends BasePage {
    @FindBy(css = ".account")
    private WebElement accountBtn;

    @FindBy(xpath = "//span[contains(text(), \"Order history and details\")]")
    private WebElement accountOrderHistoryBtn;

    /**
     * This method is used to see an account.
     */
    public void getAccountBtn() {
        accountBtn.click();
    }

    /**
     * This method is used to see the history of an account.
     */
    public void getAccountOrderHistoryBtn() {
        accountOrderHistoryBtn.click();
    }
}
