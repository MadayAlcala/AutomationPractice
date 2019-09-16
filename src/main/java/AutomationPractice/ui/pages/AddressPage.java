package AutomationPractice.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * AddressPage class, this class is in charge of the address elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class AddressPage extends AddressFormAbstract {
    @FindBy(id = "firstname")
    private WebElement firstnametxtField;

    @FindBy(id = "lastname")
    private WebElement lastnametxtField;

    @FindBy(id = "company")
    private WebElement companytxtField;

    @FindBy(id = "address1")
    private WebElement address1txtField;

    @FindBy(id = "address2")
    private WebElement address2txtField;

    @FindBy(id = "city")
    private WebElement citytxtField;

    @FindBy(id = "id_state")
    private WebElement statetxtField;

    @FindBy(id = "postcode")
    private WebElement postcodetxtField;

    @FindBy(id = "id_country")
    private WebElement countrytxtField;

    @FindBy(id = "phone")
    private WebElement phonetxtField;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobiletxtField;

    @FindBy(id = "other")
    private WebElement othertxtField;

    @FindBy(id = "alias")
    private WebElement aliastxtField;

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

//    /**
//     * This method return the name of the address header.
//     * @return heading of the address.
//     */
//    public String getHeadingTxt() {
//        return heading.getText();
//    }
//
//    /**
//     * This method return the name of the mobile phone header.
//     * @return text of the mobile phone.
//     */
//    public String getPhoneMobileTxt() {
//        return phoneMobile.getText();
//    }

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
    @Override
    public void clickSubmitBtn() {
        submitBtn.click();
    }

    /**
     * This method sets the firstName in the text box of the address form.
     *
     * @param firstName 'firstName', that represent an firstName.
     */
    @Override
    public void setFirstName(final String firstName) {
        firstnametxtField.clear();
        firstnametxtField.sendKeys(firstName);
    }

    @Override
    public String getFirstNameTxt() {
        return firstName.getText();
    }

    /**
     * This method sets the lastName in the text box of the address form.
     *
     * @param lastName 'lastName', that represent an lastName.
     */
    @Override
    public void setLastName(final String lastName) {
        lastnametxtField.clear();
        lastnametxtField.sendKeys(lastName);
    }

    @Override
    public String getLastNameTxt() {
        return lastName.getText();
    }

    /**
     * This method sets the company in the text box of the address form.
     *
     * @param company 'company', that represent an company.
     */
    @Override
    public void setCompany(final String company) {
        companytxtField.clear();
        companytxtField.sendKeys(company);
    }

    @Override
    public String getCompanyTxt() {
        return company.getText();
    }

    /**
     * This method sets the address1 in the text box of the address form.
     *
     * @param address1 'address1', that represent an address1.
     */
    @Override
    public void setAddress1(final String address1) {
        address1txtField.sendKeys(address1);
    }

    @Override
    public String getAddress1Txt() {
        return address1.getText();
    }

    /**
     * This method sets the address2 in the text box of the address form.
     *
     * @param address2 'address2', that represent an address2.
     */
    @Override
    public void setAddress2(final String address2) {
        address2txtField.sendKeys(address2);
    }

    @Override
    public String getAddress2Txt() {
        return address2.getText();
    }

    @Override
    public String getCityTxt() {
        return city.getText();
    }

    /**
     * This method sets the city in the text box of the address form.
     *
     * @param city 'city', that represent an city.
     */
    @Override
    public void setCity(final String city) {
        citytxtField.sendKeys(city);
    }

    /**
     * This method sets the state in the text box of the address form.
     *
     * @param state 'state', that represent an state.
     */
    @Override
    public void setIdState(final String state) {
        statetxtField.sendKeys(state);
    }

    @Override
    public String getIdStateTxt() {
        return state.getText();
    }

    /**
     * This method sets the postCode in the text box of the address form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    @Override
    public void setPostCode(final String postCode) {
        postcodetxtField.sendKeys(postCode);
    }

    @Override
    public String getPostCodeTxt() {
        return postCode.getText();
    }

    /**
     * This method sets the country in the text box of the address form.
     *
     * @param country 'country', that represent an country.
     */
    @Override
    public void setIdCountry(final String country) {
        countrytxtField.sendKeys(country);
    }

    @Override
    public String getCountryTxt() {
        return country.getText();
    }

    /**
     * This method sets the phone in the text box of the address form.
     *
     * @param phone 'phone', that represent an phone.
     */
    @Override
    public void setPhone(final String phone) {
        phonetxtField.sendKeys(phone);
    }

    @Override
    public String getPhoneTxt() {
        return phone.getText();
    }

    /**
     * This method sets the phoneMovil in the text box of the address form.
     *
     * @param phoneMovil 'phoneMovil', that represent an phoneMovil.
     */
    @Override
    public void setPhoneMovil(final String phoneMovil) {
        phoneMobiletxtField.sendKeys(phoneMovil);
    }

    @Override
    public String getPhoneMovilTxt() {
        return phoneMobile.getText();
    }

    /**
     * This method sets the other in the text box of the address form.
     *
     * @param other 'other', that represent an other.
     */
    @Override
    public void setOther(final String other) {
        othertxtField.sendKeys(other);
    }


    /**
     * This method sets the alias in the text box of the address form.
     *
     * @param alias 'alias', that represent an alias.
     */
    @Override
    public void setAlias(final String alias) {
        aliastxtField.clear();
        aliastxtField.sendKeys(alias);
    }

    @Override
    public String getAliasTxt() {
        return alias.getText();
    }
}
