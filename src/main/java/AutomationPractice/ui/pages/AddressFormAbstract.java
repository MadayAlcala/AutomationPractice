package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import AutomationPractice.ui.StrategySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * AddressFormAbstract class, this class is in charge of declare the address methods.
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
     * This method sets the firstName in the text box of the address form.
     *
     * @param firstName 'firstName', that represent an firstName.
     */
    public abstract void setFirstName(String firstName);

    /**
     * This method sets the lastName in the text box of the address form.
     *
     * @param lastName 'lastName', that represent an lastName.
     */
    public abstract void setLastName(String lastName);

    /**
     * This method sets the company in the text box of the address form.
     *
     * @param company 'company', that represent an company.
     */
    public abstract void setCompany(String company);

    /**
     * This method sets the address1 in the text box of the address form.
     *
     * @param address1 'address1', that represent an address1.
     */
    public abstract void setAddress1(String address1);

    /**
     * This method sets the address2 in the text box of the address form.
     *
     * @param address2 'address2', that represent an address2.
     */
    public abstract void setAddress2(String address2);

    /**
     * This method sets the city in the text box of the address form.
     *
     * @param city 'city', that represent an city.
     */
    public abstract void setcity(String city);

    /**
     * This method sets the state in the text box of the address form.
     *
     * @param state 'state', that represent an state.
     */
    public abstract void setIdState(String state);

    /**
     * This method sets the postCode in the text box of the address form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    public abstract void setPostCode(String postCode);

    /**
     * This method sets the country in the text box of the address form.
     *
     * @param country 'country', that represent an country.
     */
    public abstract void setIdCountry(String country);

    /**
     * This method sets the phone in the text box of the address form.
     *
     * @param phone 'phone', that represent an phone.
     */
    public abstract void setPhone(String phone);

    /**
     * This method sets the phoneMovil in the text box of the address form.
     *
     * @param phoneMovil 'phoneMovil', that represent an phoneMovil.
     */
    public abstract void setPhoneMovil(String phoneMovil);

    /**
     * This method sets the other in the text box of the address form.
     *
     * @param other 'other', that represent an other.
     */
    public abstract void setOther(String other);

    /**
     * This method sets the alias in the text box of the address form.
     *
     * @param alias 'alias', that represent an alias.
     */
    public abstract void setAlias(String alias);

    /**
     * This method is in charge of create a map for the address elements.
     *
     * @param accountMap that represent all the values for the elements.
     */
    public void setAccountInformation(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * This method is in charge of fill of the address element in the map.
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
        strategyMap.put("city", () -> setcity(accountMap.get("city")));
        strategyMap.put("id_state", () -> setIdState(accountMap.get("id_state")));
        strategyMap.put("postcode", () -> setPostCode(accountMap.get("postcode")));
        strategyMap.put("id_country", () -> setIdCountry(accountMap.get("id_country")));
        strategyMap.put("phone", () -> setPhone(accountMap.get("phone")));
        strategyMap.put("phone_mobile", () -> setPhoneMovil(accountMap.get("phone_mobile")));
        strategyMap.put("other", () -> setOther(accountMap.get("other")));
        strategyMap.put("alias", () -> setAlias(accountMap.get("alias")));
        return strategyMap;
    }
}

