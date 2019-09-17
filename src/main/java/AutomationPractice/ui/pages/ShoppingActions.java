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
 * ShoppingActions class, this class is in charge of the shopping acctions.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class ShoppingActions extends BasePage {
    @FindBy(xpath = "//span[contains(.,'Add to cart')]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//span[@title=\"Continue shopping\"]")
    private WebElement continueShopingBtn;

    @FindBy(css = ".available-now")
    private WebElement available;

    /**
     * This method is used to go to cart.
     */
    public void getAddToCartBtn() {
        addToCartBtn.click();
    }

    /**
     * This method is used to continue with a shopping.
     */
    public void getContinueShopingBtn() {
        continueShopingBtn.click();
    }

    /**
     * This method is used to verify if a product is available.
     */
    public void getAvailable() {
        available.click();
    }
}
