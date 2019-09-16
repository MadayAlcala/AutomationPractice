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
import AutomationPractice.ui.StrategySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * AddressFormAbstract class, this class is in charge of declare the address' methods.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public abstract class AddressFormAbstract extends BasePage {

    /**
     * This method is in charge of clicking on the submit button.
     */
    public abstract void clickSubmitBtn();

    /**
     * This method sets the firstName in the text box of the address' form.
     *
     * @param firstName 'firstName', that represent an firstName.
     */
    public abstract void setFirstName(String firstName);

    /**
     * This method is in charge of return the address' first name.
     *
     * @return first name.
     */
    public abstract String getFirstNameTxt();


    /**
     * This method sets the lastName in the text box of the address' form.
     *
     * @param lastName 'lastName', that represent an lastName.
     */
    public abstract void setLastName(String lastName);

    /**
     * This method is in charge of return the address' last name.
     *
     * @return last name.
     */
    public abstract String getLastNameTxt();

    /**
     * This method sets the company in the text box of the address' form.
     *
     * @param company 'company', that represent a company.
     */
    public abstract void setCompany(String company);

    /**
     * This method is in charge of return the address' company.
     *
     * @return company.
     */
    public abstract String getCompanyTxt();

    /**
     * This method sets the address1 in the text box of the address' form.
     *
     * @param address1 'address1', that represent an address1.
     */
    public abstract void setAddress1(String address1);

    /**
     * This method is in charge of return the address' main address.
     *
     * @return address1 that represent the main address.
     */
    public abstract String getAddress1Txt();

    /**
     * This method sets the address2 in the text box of the address' form.
     *
     * @param address2 'address2', that represent an optional address.
     */
    public abstract void setAddress2(String address2);

    /**
     * This method is in charge of return the address' optional.
     *
     * @return address2 that is an optional address.
     */
    public abstract String getAddress2Txt();

    /**
     * This method sets the city in the text box of the address' form.
     *
     * @param city 'city', that represent an city.
     */
    public abstract void setCity(String city);

    /**
     * This method is in charge of return the address' city.
     *
     * @return city.
     */
    public abstract String getCityTxt();

    /**
     * This method sets the state in the text box of the address' form.
     *
     * @param state 'state', that represent an state.
     */
    public abstract void setIdState(String state);

    /**
     * This method is in charge of return the address' state.
     *
     * @return state.
     */
    public abstract String getIdStateTxt();

    /**
     * This method sets the postCode in the text box of the address' form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    public abstract void setPostCode(String postCode);

    /**
     * This method is in charge of return the address' post code.
     *
     * @return post code.
     */
    public abstract String getPostCodeTxt();

    /**
     * This method sets the country in the text box of the address' form.
     *
     * @param country 'country', that represent an country.
     */
    public abstract void setIdCountry(String country);

    /**
     * This method is in charge of return the address' country.
     *
     * @return country.
     */
    public abstract String getCountryTxt();

    /**
     * This method sets the phone in the text box of the address' form.
     *
     * @param phone 'phone', that represent a main phone.
     */
    public abstract void setPhone(String phone);

    /**
     * This method is in charge of return the address' main phone.
     *
     * @return phone that represent the main phone.
     */
    public abstract String getPhoneTxt();

    /**
     * This method sets the phoneMovil in the text box of the address' form.
     *
     * @param phoneMovil 'phoneMovil', that represent an optional phone.
     */
    public abstract void setPhoneMovil(String phoneMovil);

    /**
     * This method is in charge of return the address' phone mobile.
     *
     * @return phone mobile that represent an optional phone..
     */
    public abstract String getPhoneMovilTxt();

    /**
     * This method sets the other in the text box of the address' form.
     *
     * @param other 'other', that represent any optional information.
     */
    public abstract void setOther(String other);

    /**
     * This method sets the alias in the text box of the address' form.
     *
     * @param alias 'alias', that represent an alias.
     */
    public abstract void setAlias(String alias);

    /**
     * This method is in charge of return the address' alias.
     *
     * @return alias.
     */
    public abstract String getAliasTxt();

    /**
     * This method is in charge of create a map for the address' elements.
     *
     * @param accountMap that represent all the values for the elements.
     */
    public void setAccountInformation(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * This method is in charge of fill of the address' element in the map.
     *
     * @param accountMap that represents the values for the map.
     * @return strategy map.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = new HashMap<>();
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
        strategyMap.put("phone_mobile", () -> setPhoneMovil(accountMap.get("phone_mobile")));
        strategyMap.put("other", () -> setOther(accountMap.get("other")));
        strategyMap.put("alias", () -> setAlias(accountMap.get("alias")));
        return strategyMap;
    }

    /**
     * This method build getter map with all the variables of an address.
     *
     * @return 'strategyMap' that contains all the variables of the address.
     */
    public HashMap<String, StrategySetter> composeStrategyMap() {
        HashMap<String, StrategySetter> strategyMap = new HashMap<>();
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
        strategyMap.get(getPhoneMovilTxt());
        strategyMap.get(getAliasTxt());
        return strategyMap;
    }
}

