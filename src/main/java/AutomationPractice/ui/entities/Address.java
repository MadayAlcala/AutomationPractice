package AutomationPractice.ui.entities;

import AutomationPractice.ui.StrategySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Address class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class Address {
    private String firstname;
    private String lastname;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String idState;
    private String postcode;
    private String idCountry;
    private String phone;
    private String phoneMobile;
    private String other;
    private String alias;

    /**
     * This method is in charge of return the address firstname.
     *
     * @return firstname.
     */
    private String getFirstName() {
        return firstname;
    }

    /**
     * This method is in charge of return the address firstname.
     *
     * @param firstname firstname.
     */
    private void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method is in charge of return the address lastname.
     *
     * @return lastname.
     */
    private String getLastname() {
        return lastname;
    }

    /**
     * This method is in charge of set the address lastname.
     *
     * @param lastname lastname.
     */
    private void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method is in charge of return the address company.
     *
     * @return company.
     */
    private String getCompany() {
        return company;
    }

    /**
     * This method is in charge of set the address company.
     *
     * @param company company.
     */
    private void setCompany(final String company) {
        this.company = company;
    }

    /**
     * This method is in charge of return the address address1.
     *
     * @return address1.
     */
    private String getAddress1() {
        return address1;
    }

    /**
     * This method is in charge of set the address address1.
     *
     * @param address1 address1.
     */
    private void setAddress1(final String address1) {
        this.address1 = address1;
    }

    /**
     * This method is in charge of return the address address2.
     *
     * @return address2.
     */
    private String getAddress2() {
        return address2;
    }

    /**
     * This method is in charge of set the address address2.
     *
     * @param address2 address2.
     */
    private void setAddress2(final String address2) {
        this.address2 = address2;
    }

    /**
     * This method is in charge of return the address city.
     *
     * @return city.
     */
    private String getCity() {
        return city;
    }

    /**
     * This method is in charge of set the address city.
     *
     * @param city city.
     */
    private void setCity(final String city) {
        this.city = city;
    }

    /**
     * This method is in charge of return the address idState.
     *
     * @return idState.
     */
    private String getIdState() {
        return idState;
    }

    /**
     * This method is in charge of set the address idState.
     *
     * @param idState idState.
     */
    private void setIdState(final String idState) {
        this.idState = idState;
    }

    /**
     * This method is in charge of return the address postcode.
     *
     * @return postcode.
     */
    private String getPostcode() {
        return postcode;
    }

    /**
     * This method is in charge of set the address postcode.
     *
     * @param postcode postcode.
     */
    private void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    /**
     * This method is in charge of return the address idCountry.
     *
     * @return idCountry.
     */
    private String getIdCountry() {
        return idCountry;
    }

    /**
     * This method is in charge of set the address idCountry.
     *
     * @param idCountry idCountry.
     */
    private void setIdCountry(final String idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * This method is in charge of return the address phone.
     *
     * @return phone.
     */
    private String getPhone() {
        return phone;
    }

    /**
     * This method is in charge of set the address phone.
     *
     * @param phone phone.
     */
    private void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * This method is in charge of return the address phoneMobile.
     *
     * @return phoneMobile.
     */
    public String getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * This method is in charge of set the address phoneMobile.
     *
     * @param phoneMobile phoneMobile.
     */
    private void setPhoneMobile(final String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    /**
     * This method is in charge of return the address other.
     *
     * @return other.
     */
    private String getOther() {
        return other;
    }

    /**
     * This method is in charge of set the address other.
     *
     * @param other other.
     */
    private void setOther(final String other) {
        this.other = other;
    }

    /**
     * This method is in charge of return the address alias.
     *
     * @return alias.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method is in charge of set the address alias.
     *
     * @param alias alias.
     */
    private void setAlias(final String alias) {
        this.alias = alias;
    }

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
        strategyMap.put("firstname", () -> setFirstname(accountMap.get("firstname")));
        strategyMap.put("lastname", () -> setLastname(accountMap.get("lastname")));
        strategyMap.put("company", () -> setCompany(accountMap.get("company")));
        strategyMap.put("address1", () -> setAddress1(accountMap.get("address1")));
        strategyMap.put("address2", () -> setAddress2(accountMap.get("address2")));
        strategyMap.put("city", () -> setCity(accountMap.get("city")));
        strategyMap.put("id_state", () -> setIdState(accountMap.get("id_state")));
        strategyMap.put("postcode", () -> setPostcode(accountMap.get("postcode")));
        strategyMap.put("id_country", () -> setIdCountry(accountMap.get("id_country")));
        strategyMap.put("phone", () -> setPhone(accountMap.get("phone")));
        strategyMap.put("phone_mobile", () -> setPhoneMobile(accountMap.get("phone_mobile")));
        strategyMap.put("other", () -> setOther(accountMap.get("other")));
        strategyMap.put("alias", () -> setAlias(accountMap.get("alias")));
        return strategyMap;
    }
}
