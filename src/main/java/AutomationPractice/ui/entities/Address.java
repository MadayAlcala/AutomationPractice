/*
 * Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Jalasoft.
 */

package AutomationPractice.ui.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Address class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Address {
    private String firstName;
    private String lastName;
    private String company;
    private String mainAddress;
    private String secondAddress;
    private String city;
    private String idState;
    private String postcode;
    private String idCountry;
    private String phone;
    private String phoneMobile;
    private String additionalInfo;
    private String alias;

    /**
     * This method is in charge of return the address' firstName.
     *
     * @return firstName.
     */
    private String getFirstName() {
        return firstName;
    }

    /**
     * This method is in charge of return the address' firstName.
     *
     * @param firstName firstName.
     */
    private void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method is in charge of return the address' lastName.
     *
     * @return lastName.
     */
    private String getLastName() {
        return lastName;
    }

    /**
     * This method is in charge of set the address' lastName.
     *
     * @param lastName lastName.
     */
    private void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method is in charge of return the address' company.
     *
     * @return company.
     */
    private String getCompany() {
        return company;
    }

    /**
     * This method is in charge of set the address' company.
     *
     * @param company company.
     */
    private void setCompany(final String company) {
        this.company = company;
    }

    /**
     * This method is in charge of return the address' mainAddress.
     *
     * @return mainAddress.
     */
    private String getMainAddress() {
        return mainAddress;
    }

    /**
     * This method is in charge of set the address' mainAddress.
     *
     * @param mainAddress mainAddress.
     */
    private void setMainAddress(final String mainAddress) {
        this.mainAddress = mainAddress;
    }

    /**
     * This method is in charge of return the address' secondAddress.
     *
     * @return secondAddress.
     */
    private String getSecondAddress() {
        return secondAddress;
    }

    /**
     * This method is in charge of set the address' secondAddress.
     *
     * @param secondAddress secondAddress.
     */
    private void setSecondAddress(final String secondAddress) {
        this.secondAddress = secondAddress;
    }

    /**
     * This method is in charge of return the address' city.
     *
     * @return city.
     */
    private String getCity() {
        return city;
    }

    /**
     * This method is in charge of set the address' city.
     *
     * @param city city.
     */
    private void setCity(final String city) {
        this.city = city;
    }

    /**
     * This method is in charge of return the address' idState.
     *
     * @return idState.
     */
    private String getIdState() {
        return idState;
    }

    /**
     * This method is in charge of set the address' idState.
     *
     * @param idState idState.
     */
    private void setIdState(final String idState) {
        this.idState = idState;
    }

    /**
     * This method is in charge of return the address' postcode.
     *
     * @return postcode.
     */
    private String getPostcode() {
        return postcode;
    }

    /**
     * This method is in charge of set the address' postcode.
     *
     * @param postcode postcode.
     */
    private void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    /**
     * This method is in charge of return the address' idCountry.
     *
     * @return idCountry.
     */
    private String getIdCountry() {
        return idCountry;
    }

    /**
     * This method is in charge of set the address' idCountry.
     *
     * @param idCountry idCountry.
     */
    private void setIdCountry(final String idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * This method is in charge of return the address' phone.
     *
     * @return phone.
     */
    private String getPhone() {
        return phone;
    }

    /**
     * This method is in charge of set the address' main phone.
     *
     * @param phone that represents the main phone.
     */
    private void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * This method is in charge of return the address' second phone.
     *
     * @return phoneMobile that represents an optional phone.
     */
    private String getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * This method is in charge of set the address' second phone.
     *
     * @param phoneMobile 'phoneMobile' that represents an optional phone.
     */
    private void setPhoneMobile(final String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    /**
     * This method is in charge of set the address' additionalInfo.
     *
     * @param additionalInfo 'additionalInfo' that could be any other additional information.
     */
    private void setAdditionalInfo(final String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * This method is in charge of return the address' alias.
     *
     * @return alias.
     */
    public String getAlias() {
        return alias.toUpperCase();
    }

    /**
     * This method is in charge of set the address' alias.
     *
     * @param alias alias.
     */
    private void setAlias(final String alias) {
        this.alias = alias;
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
        strategyMap.put("address1", () -> setMainAddress(accountMap.get("mainAddress")));
        strategyMap.put("address2", () -> setSecondAddress(accountMap.get("secondAddress")));
        strategyMap.put("city", () -> setCity(accountMap.get("city")));
        strategyMap.put("id_state", () -> setIdState(accountMap.get("id_state")));
        strategyMap.put("postcode", () -> setPostcode(accountMap.get("postcode")));
        strategyMap.put("id_country", () -> setIdCountry(accountMap.get("id_country")));
        strategyMap.put("phone", () -> setPhone(accountMap.get("phone")));
        strategyMap.put("phone_mobile", () -> setPhoneMobile(accountMap.get("phone_mobile")));
        strategyMap.put("other", () -> setAdditionalInfo(accountMap.get("additionalInfo")));
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
        strategyMap.get(getFirstName());
        strategyMap.get(getLastName());
        strategyMap.get(getCompany());
        strategyMap.get(getMainAddress());
        strategyMap.get(getSecondAddress());
        strategyMap.get(getCity());
        strategyMap.get(getIdState());
        strategyMap.get(getPostcode());
        strategyMap.get(getIdCountry());
        strategyMap.get(getPhone());
        strategyMap.get(getPhoneMobile());
        strategyMap.get(getAlias());
        return strategyMap;
    }
}
