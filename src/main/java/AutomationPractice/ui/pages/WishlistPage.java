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
