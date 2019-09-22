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
 * CartSummary class, this class is in charge of the CartSummary elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class CartSummary extends BasePage {
    @FindBy(id = "total_product")
    private WebElement cartSummTotalProductsPrice;

    @FindBy(id = "total_shipping")
    private WebElement cartSummTotalShipping;

    @FindBy(id = "total_price")
    private WebElement cartSummaryTotalPrice;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    private WebElement cartProceedBtn;

    @FindBy(xpath = "//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]")
    private WebElement cartProceedBtnTwo;

    @FindBy(xpath = "//ul[@id=\"address_invoice\"]/li[@class=\"address_firstname address_lastname\"]")
    private WebElement cartSummBillingAdressName;

    @FindBy(id = "cgv")
    private WebElement cartSummTermsOfServiceCheck;

    @FindBy(xpath = "//p[contains(text(), \"You must agree to the terms of service before continuing.\")]")
    private WebElement cartSummTermsOfServiceDialog;

    @FindBy(xpath = "//a[@class=\"fancybox-item fancybox-close\"]")
    private WebElement cartSummTermsOfServiceDialogClose;

    @FindBy(css = ".bankwire")
    private WebElement cartSummPayByBankWire;

    @FindBy(css = ".cheque")
    private WebElement cartSummPayByCheck;

    @FindBy(css = ".page-subheading")
    private WebElement cartSummPayByBankWireConfirm;

    @FindBy(css = ".page-subheading")
    private WebElement cartSummPayByCheckConfirm;

    @FindBy(xpath = "//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]")
    private WebElement cartSummConfirmOrderBtn;

    @FindBy(css = ".button-exclusive")
    private WebElement cartSummOtherPaymentMethods;

    @FindBy(css = ".alert")
    private WebElement cartSummSuccessMsg;

    @FindBy(xpath = "//table[@id=\"cart_summary\"]/tbody/tr")
    private List<WebElement> cartSummTotalProductsNum;

    @FindBy(xpath = "#our_price_display")
    private WebElement oficialPrice;

    /**
     * This method return the total price of products.
     *
     * @return the cart summ total price of Products.
     */
    public String getCartSummTotalProductsPrice() {
        return cartSummTotalProductsPrice.getText();
    }

    /**
     * This method return the total shipping for a shopping of products.
     *
     * @return the cart summ total shipping of Products.
     */
    public String getCartSummTotalShipping() {
        return cartSummTotalShipping.getText();
    }

    /**
     * This method return the total price sum of products.
     *
     * @return the cart summ total of Products.
     */
    public String getCartSummaryTotalPrice() {
        return cartSummaryTotalPrice.getText();
    }

    /**
     * This methos is used to proceed with the order.
     */
    public void getCartProceedBtn() {
        cartProceedBtn.click();
    }

    /**
     * This method is used to continue while doing an order.
     */
    public void getCartProceedBtnTwo() {
        cartProceedBtnTwo.click();
    }

    /**
     * This method is used to obtain the Billing Address Name.
     *
     * @return a String with the address name.
     */
    public String getCartSummBillingAdressName() {
        return cartSummBillingAdressName.getText();
    }

    /**
     * This method is used for accept the terms of the pay service.
     */
    public void getCartSummTermsOfServiceCheck() {
        cartSummTermsOfServiceCheck.click();
    }

    /**
     * This method is used to pay by BankWire.
     */
    public void getCartSummPayByBankWire() {
        cartSummPayByBankWire.click();
    }

    /**
     * This method is used to pay by check.
     */
    public void getCartSummPayByCheck() {
        cartSummPayByCheck.click();
    }

    /**
     * This method is to confirm a pay bay bank.
     *
     * @return a String with cartSumm of bank Pay.
     */
    public String getCartSummPayByBankWireConfirm() {
        return cartSummPayByBankWireConfirm.getText();
    }

    /**
     * This method is used to confirm a pay bay check.
     *
     * @return a String with cartSumm of check Pay.
     */
    public String getCartSummPayByCheckConfirm() {
        return cartSummPayByCheckConfirm.getText();
    }

    /**
     * This method is used to confirm an order.
     */
    public void getCartSummConfirmOrderBtn() {
        cartSummConfirmOrderBtn.click();
    }

    /**
     * This method is used to choose other method of payment.
     */
    public void getCartSummOtherPaymentMethods() {
        cartSummOtherPaymentMethods.click();
    }

    /**
     * This method returns the success message of an order.
     *
     * @return a String with the success message.
     */
    public String getCartSummSuccessMsg() {
        return cartSummSuccessMsg.getText();
    }
}
