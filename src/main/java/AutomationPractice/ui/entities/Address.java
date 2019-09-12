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
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method is in charge of return the address firstname.
     *
     * @param firstname firstname.
     */
    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method is in charge of return the address lastname.
     *
     * @return lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method is in charge of set the address lastname.
     *
     * @param lastname lastname.
     */
    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method is in charge of return the address company.
     *
     * @return company.
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method is in charge of set the address company.
     *
     * @param company company.
     */
    public void setCompany(final String company) {
        this.company = company;
    }

    /**
     * This method is in charge of return the address address1.
     *
     * @return address1.
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * This method is in charge of set the address address1.
     *
     * @param address1 address1.
     */
    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    /**
     * This method is in charge of return the address address2.
     *
     * @return address2.
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * This method is in charge of set the address address2.
     *
     * @param address2 address2.
     */
    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    /**
     * This method is in charge of return the address city.
     *
     * @return city.
     */
    public String getCity() {
        return city;
    }

    /**
     * This method is in charge of set the address city.
     *
     * @param city city.
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * This method is in charge of return the address idState.
     *
     * @return idState.
     */
    public String getIdState() {
        return idState;
    }

    /**
     * This method is in charge of set the address idState.
     *
     * @param idState idState.
     */
    public void setIdState(final String idState) {
        this.idState = idState;
    }

    /**
     * This method is in charge of return the address postcode.
     *
     * @return postcode.
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method is in charge of set the address postcode.
     *
     * @param postcode postcode.
     */
    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    /**
     * This method is in charge of return the address idCountry.
     *
     * @return idCountry.
     */
    public String getIdCountry() {
        return idCountry;
    }

    /**
     * This method is in charge of set the address idCountry.
     *
     * @param idCountry idCountry.
     */
    public void setIdCountry(final String idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * This method is in charge of return the address phone.
     *
     * @return phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method is in charge of set the address phone.
     *
     * @param phone phone.
     */
    public void setPhone(final String phone) {
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
    public void setPhoneMobile(final String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    /**
     * This method is in charge of return the address other.
     *
     * @return other.
     */
    public String getOther() {
        return other;
    }

    /**
     * This method is in charge of set the address other.
     *
     * @param other other.
     */
    public void setOther(final String other) {
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
    public void setAlias(final String alias) {
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
        strategyMap.put("idState", () -> setIdState(accountMap.get("idState")));
        strategyMap.put("postcode", () -> setPostcode(accountMap.get("postcode")));
        strategyMap.put("idCountry", () -> setIdCountry(accountMap.get("idCountry")));
        strategyMap.put("phone", () -> setPhone(accountMap.get("phone")));
        strategyMap.put("phoneMobile", () -> setPhoneMobile(accountMap.get("phoneMobile")));
        strategyMap.put("other", () -> setOther(accountMap.get("other")));
        strategyMap.put("alias", () -> setAlias(accountMap.get("alias")));
        return strategyMap;
    }
}
