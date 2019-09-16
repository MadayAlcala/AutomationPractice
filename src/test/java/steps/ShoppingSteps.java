/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package steps;

import AutomationPractice.ui.pages.Account;
import AutomationPractice.ui.pages.Cart;
import AutomationPractice.ui.pages.CartSummary;
import AutomationPractice.ui.pages.Clothes;
import AutomationPractice.ui.pages.ShoppingActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * ShoppingSteps class, here are implemented the steps for a shopping.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class ShoppingSteps {
    private Clothes clothes;
    private Cart cart;
    private ShoppingActions shoppingActions;
    private CartSummary summary;
    private Account account;

    /**
     * This method is for choose a summer dress.
     */
    @When("^The user Choose a summer dress$")
    public void choosingSummerDress() {
        clothes = new Clothes();
        cart = new Cart();
        shoppingActions = new ShoppingActions();
        summary = new CartSummary();
        account = new Account();
        shoppingActions.getAvailable();
        clothes.getSummerDressProduct(1);
        shoppingActions.getAddToCartBtn();
        shoppingActions.getContinueShopingBtn();
        cart.getCartTab();
        Assert.assertEquals(cart.getCartProductsQty().size(), 1);
    }

//    /**
//     * This method is for test the data.
//     *
//     * @param cartsSum with the price values.
//     */
//    @Then("^The cart sum of product is equal to the next information$")
//    public void cartSummarytotalPrice(final Map<String, String> cartsSum) {
//        Assert.assertEquals(summary.getCartSummTotalProductsPrice(), cartsSum.get("TotalProductsPrice"));
//        Assert.assertEquals(summary.getCartSummaryTotalPrice(), cartsSum.get("TotalPrice"));
//        Assert.assertEquals(summary.getCartSummTotalShipping(), cartsSum.get("TotalShipping"));
//    }

    /**
     * This method is for accept the terms condition.
     */
    @When("^The user accept the terms of service check$")
    public void acceptTermsCondition() {
        summary.getCartProceedBtn();
        summary.getCartProceedBtnTwo();
        summary.getCartSummTermsOfServiceCheck();
        summary.getCartProceedBtnTwo();
    }

    /**
     * This method is for choose a payment meethod.
     */
    @When("^The user choose a payment method$")
    public void choosingPaymentMethod() {
        summary.getCartSummPayByBankWire();
        Assert.assertEquals(summary.getCartSummPayByBankWireConfirm(), "BANK-WIRE PAYMENT.");
        summary.getCartSummOtherPaymentMethods();
        summary.getCartSummPayByCheck();
        Assert.assertEquals(summary.getCartSummPayByCheckConfirm(), "CHECK PAYMENT");
    }

    /**
     * This method is for check the succes message.
     *
     * @param successMessage of the order.
     */
    @Then("^The user should see this success message: \"([^\"]*)\"$")
    public void successMessage(final String successMessage) {
        summary.getCartSummConfirmOrderBtn();
        Assert.assertEquals(summary.getCartSummSuccessMsg(), successMessage);
    }

    /**
     * this method is for check the order in OrderHistory.
     *
     * @param number that represetn the increase of the order.
     */
    @Then("^The user should see the order history with the number (\\d+)$")
    public void orderHistoryIncresed(final int number) {
        account.getAccountBtn();
        account.getAccountOrderHistoryBtn();
        Assert.assertEquals(account.getAccountOrdersLis().size(), number);
    }
}
