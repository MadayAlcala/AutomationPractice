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
 * WishlistPage class, this class have the locators of the WishlistPage.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class WishlistPage extends BasePage {
    @FindBy(css = "#wishlist_12464 .icon-remove")
    private WebElement wishlist;

    /**
     * This method delete a Wishlist.
     */
    public void deleteWishlist() {
        wishlist.click();
        driver.switchTo().alert().accept();
    }
}
