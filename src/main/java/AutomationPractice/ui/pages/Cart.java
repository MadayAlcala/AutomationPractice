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

import java.util.List;

/**
 * Cart class, this class is in charge of the cart elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Cart extends BasePage {
    @FindBy(css = ".shopping_cart > a")
    private WebElement cartTab;

    @FindBy(xpath = "//dt")
    private List<WebElement> cartProductsQty;

    /**
     * This method returns a list of cart' products.
     *
     * @return cartProductsQty that is a list.
     */
    public List<WebElement> getCartProductsQty() {
        return cartProductsQty;
    }

    /**
     * This method get a cart table.
     */
    public void getCartTab() {
        cartTab.click();
    }
}
