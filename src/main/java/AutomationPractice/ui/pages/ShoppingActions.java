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
 * ShoppingActions class, this class is in charge of the shopping actions.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class ShoppingActions extends BasePage {
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//span[@title=\"Continue shopping\"]")
    private WebElement continueShoppingBtn;

    /**
     * This method is used to go to cart.
     */
    public void getAddToCartBtn() {
        addToCartBtn.click();
    }

    /**
     * This method is used to continue with a shopping.
     */
    public void getContinueShoppingBtn() {
        continueShoppingBtn.click();
    }
}
