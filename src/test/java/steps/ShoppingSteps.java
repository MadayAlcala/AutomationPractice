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
     * This method is for choose a dress.
     */
    @When("^The user Choose a dress$")
    public void choosingSummerDress() {
        clothes = new Clothes();
        shoppingActions = new ShoppingActions();
        summary = new CartSummary();
        cart = new Cart();
        shoppingActions.getAvailable();
        clothes.getDressProduct(1);
        shoppingActions.getAddToCartBtn();
        shoppingActions.getContinueShopingBtn();
    }

    /**
     * This method is used to verify the correct quantity of an order.
     *
     * @param quantity that represent the quantity of the order.
     */
    @Then("^The user quantity of orders should be (\\d+)$")
    public void verifyOrderQuantity(final int quantity) {
        cart.getCartTab();
        Assert.assertEquals(cart.getCartProductsQty().size(), quantity);
    }

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
    @When("^The user choose a bank payment method$")
    public void chooseBankPaymentMethod() {
        summary.getCartSummPayByBankWire();
    }

    /**
     * This method is to compare the bank payment heading.
     *
     * @param heading that represent the bank payment name.
     */
    @Then("^The user should see \"([^\"]*)\" heading$")
    public void verifyHeading(final String heading) {
        Assert.assertEquals(summary.getCartSummPayByBankWireConfirm(), heading);
    }

    /**
     * This method is used for choose a check payment method.
     */
    @When("^The user choose a check payment method$")
    public void choosingPaymentMethod() {
        summary.getCartSummOtherPaymentMethods();
        summary.getCartSummPayByCheck();
    }

    /**
     * This method is used to continue with the order.
     */
    @When("^The user proceed with the order$")
    public void proceedWithOrder() {
        summary.getCartSummConfirmOrderBtn();
    }

    /**
     * This method is for check the succes message of a complete order.
     *
     * @param successMessage of the order.
     */
    @Then("^The user should see this success message: \"([^\"]*)\"$")
    public void successMessage(final String successMessage) {
        Assert.assertEquals(summary.getCartSummSuccessMsg(), successMessage);
    }

    /**
     * this method is for check the order in OrderHistory.
     */
    @Then("^The user should see the order history")
    public void orderHistoryIncresed() {
        account = new Account();
        account.getAccountBtn();
        account.getAccountOrderHistoryBtn();
    }
}
