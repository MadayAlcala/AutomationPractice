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

import java.util.HashMap;
import java.util.Map;

/**
 * AddressPage class, this class is in charge of the address elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class AddressPage extends BasePage {
    @FindBy(id = "firstname")
    private WebElement firstNameTxtField;

    @FindBy(id = "lastname")
    private WebElement lastNameTxtField;

    @FindBy(id = "company")
    private WebElement companyTxtField;

    @FindBy(id = "address1")
    private WebElement address1TxtField;

    @FindBy(id = "address2")
    private WebElement address2TxtField;

    @FindBy(id = "city")
    private WebElement cityTxtField;

    @FindBy(id = "id_state")
    private WebElement stateTxtField;

    @FindBy(id = "postcode")
    private WebElement postcodeTxtField;

    @FindBy(id = "id_country")
    private WebElement countryTxtField;

    @FindBy(id = "phone")
    private WebElement phoneTxtField;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobileTxtField;

    @FindBy(id = "other")
    private WebElement otherTxtField;

    @FindBy(id = "alias")
    private WebElement aliasTxtField;

    @FindBy(css = "#submitAddress > span")
    private WebElement submitBtn;

    @FindBy(css = ".last_item .address_name")
    private WebElement firstName;

    @FindBy(css = ".last_item .address_name +.address_name")
    private WebElement lastName;

    @FindBy(css = ".last_item .address_company")
    private WebElement company;

    @FindBy(css = ".last_item .address_address1")
    private WebElement address1;

    @FindBy(css = ".last_item .address_address2")
    private WebElement address2;

    @FindBy(css = ".last_item > li:nth-child(5) > span:nth-child(1)")
    private WebElement city;

    @FindBy(css = ".last_item > li:nth-child(5) > span:nth-child(2)")
    private WebElement state;

    @FindBy(css = ".last_item span:nth-child(3)")
    private WebElement postCode;

    @FindBy(css = ".last_item > li:nth-child(6) > span")
    private WebElement country;

    @FindBy(css = ".last_item .address_phone")
    private WebElement phone;

    @FindBy(css = ".last_item .address_phone_mobile")
    private WebElement phoneMobile;

    @FindBy(css = ".last_item .page-subheading")
    private WebElement alias;

    @FindBy(css = ".last_item .btn:nth-child(2) >span")
    private WebElement deleteBtn;

    /**
     * This method delete the last address created.
     */
    public void deleteAddress() {
        deleteBtn.click();
        driver.switchTo().alert().accept();
    }

    /**
     * This method is in charge of clicking on the submit button.
     */
    public void clickSubmitBtn() {
        submitBtn.click();
    }

    /**
     * This method sets the firstName in the text box of the address form.
     *
     * @param firstName 'firstName', that represent an firstName.
     */
    private void setFirstName(final String firstName) {
        firstNameTxtField.clear();
        firstNameTxtField.sendKeys(firstName);
    }

    /**
     * This method is in charge of return the address' first name.
     *
     * @return first name.
     */
    private String getFirstNameTxt() {
        return firstName.getText();
    }

    /**
     * This method sets the lastName in the text box of the address form.
     *
     * @param lastName 'lastName', that represent an lastName.
     */
    private void setLastName(final String lastName) {
        lastNameTxtField.clear();
        lastNameTxtField.sendKeys(lastName);
    }

    /**
     * This method is in charge of return the address' last name.
     *
     * @return last name.
     */
    private String getLastNameTxt() {
        return lastName.getText();
    }

    /**
     * This method sets the company in the text box of the address form.
     *
     * @param company 'company', that represent an company.
     */
    private void setCompany(final String company) {
        companyTxtField.clear();
        companyTxtField.sendKeys(company);
    }

    /**
     * This method is in charge of return the address' company.
     *
     * @return company.
     */
    private String getCompanyTxt() {
        return company.getText();
    }

    /**
     * This method sets the address1 in the text box of the address form.
     *
     * @param address1 'address1', that represent an address1.
     */
    private void setAddress1(final String address1) {
        address1TxtField.sendKeys(address1);
    }

    /**
     * This method is in charge of return the address' main address.
     *
     * @return address1 that represent the main address.
     */
    private String getAddress1Txt() {
        return address1.getText();
    }

    /**
     * This method sets the address2 in the text box of the address form.
     *
     * @param address2 'address2', that represent an address2.
     */
    private void setAddress2(final String address2) {
        address2TxtField.sendKeys(address2);
    }

    /**
     * This method is in charge of return the address' optional.
     *
     * @return address2 that is an optional address.
     */
    private String getAddress2Txt() {
        return address2.getText();
    }

    /**
     * This method sets the city in the text box of the address form.
     *
     * @param city 'city', that represent an city.
     */
    private void setCity(final String city) {
        cityTxtField.sendKeys(city);
    }

    /**
     * This method is in charge of return the address' city.
     *
     * @return city.
     */
    private String getCityTxt() {
        return city.getText();
    }

    /**
     * This method sets the state in the text box of the address form.
     *
     * @param state 'state', that represent an state.
     */
    private void setIdState(final String state) {
        stateTxtField.sendKeys(state);
    }

    /**
     * This method is in charge of return the address' state.
     *
     * @return state.
     */
    private String getIdStateTxt() {
        return state.getText();
    }

    /**
     * This method sets the postCode in the text box of the address form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    private void setPostCode(final String postCode) {
        postcodeTxtField.sendKeys(postCode);
    }

    /**
     * This method is in charge of return the address' post code.
     *
     * @return post code.
     */
    private String getPostCodeTxt() {
        return postCode.getText();
    }

    /**
     * This method sets the country in the text box of the address form.
     *
     * @param country 'country', that represent an country.
     */
    private void setIdCountry(final String country) {
        countryTxtField.sendKeys(country);
    }

    /**
     * This method is in charge of return the address' country.
     *
     * @return country.
     */
    private String getCountryTxt() {
        return country.getText();
    }

    /**
     * This method sets the phone in the text box of the address form.
     *
     * @param phone 'phone', that represent an phone.
     */
    private void setPhone(final String phone) {
        phoneTxtField.sendKeys(phone);
    }

    /**
     * This method is in charge of return the address' main phone.
     *
     * @return phone that represent the main phone.
     */
    private String getPhoneTxt() {
        return phone.getText();
    }

    /**
     * This method sets the phoneMobile in the text box of the address form.
     *
     * @param phoneMovil 'phoneMobile', that represent an phoneMobile.
     */
    private void setPhoneMobile(final String phoneMovil) {
        phoneMobileTxtField.sendKeys(phoneMovil);
    }

    /**
     * This method is in charge of return the address' phone mobile.
     *
     * @return phone mobile that represent an optional phone..
     */
    private String getPhoneMobileTxt() {
        return phoneMobile.getText();
    }

    /**
     * This method sets the other in the text box of the address form.
     *
     * @param other 'other', that represent an other.
     */
    private void setOther(final String other) {
        otherTxtField.sendKeys(other);
    }

    /**
     * This method sets the alias in the text box of the address form.
     *
     * @param alias 'alias', that represent an alias.
     */
    private void setAlias(final String alias) {
        aliasTxtField.clear();
        aliasTxtField.sendKeys(alias);
    }

    /**
     * This method is in charge of return the address' alias.
     *
     * @return alias.
     */
    public String getAliasTxt() {
        return alias.getText();
    }

    /**
     * This method is in charge of create a map for the address' elements.
     *
     * @param accountMap that represent all the values for the elements.
     */
    public void setAccountInformation(final Map<String, String> accountMap) {
        HashMap<String, Runnable> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).run());
    }

    /**
     * This method is in charge of fill of the address' element in the map.
     *
     * @param accountMap that represents the values for the map.
     * @return strategy map.
     */
    private HashMap<String, Runnable> composeStrategyMap(final Map<String, String> accountMap) {
        HashMap<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.put("firstname", () -> setFirstName(accountMap.get("firstname")));
        strategyMap.put("lastname", () -> setLastName(accountMap.get("lastname")));
        strategyMap.put("company", () -> setCompany(accountMap.get("company")));
        strategyMap.put("address1", () -> setAddress1(accountMap.get("address1")));
        strategyMap.put("address2", () -> setAddress2(accountMap.get("address2")));
        strategyMap.put("city", () -> setCity(accountMap.get("city")));
        strategyMap.put("id_state", () -> setIdState(accountMap.get("id_state")));
        strategyMap.put("postcode", () -> setPostCode(accountMap.get("postcode")));
        strategyMap.put("id_country", () -> setIdCountry(accountMap.get("id_country")));
        strategyMap.put("phone", () -> setPhone(accountMap.get("phone")));
        strategyMap.put("phone_mobile", () -> setPhoneMobile(accountMap.get("phone_mobile")));
        strategyMap.put("other", () -> setOther(accountMap.get("other")));
        strategyMap.put("alias", () -> setAlias(accountMap.get("alias")));
        return strategyMap;
    }

    /**
     * This method build getter map with all the variables of an address.
     *
     * @return 'strategyMap' that contains all the variables of the address.
     */
    public HashMap<String, Runnable> composeStrategyMap() {
        HashMap<String, Runnable> strategyMap = new HashMap<>();
        strategyMap.get(getFirstNameTxt());
        strategyMap.get(getLastNameTxt());
        strategyMap.get(getCompanyTxt());
        strategyMap.get(getAddress1Txt());
        strategyMap.get(getAddress2Txt());
        strategyMap.get(getCityTxt());
        strategyMap.get(getIdStateTxt());
        strategyMap.get(getPostCodeTxt());
        strategyMap.get(getCountryTxt());
        strategyMap.get(getPhoneTxt());
        strategyMap.get(getPhoneMobileTxt());
        strategyMap.get(getAliasTxt());
        return strategyMap;
    }
}
