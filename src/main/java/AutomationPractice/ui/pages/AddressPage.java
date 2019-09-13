package AutomationPractice.ui.pages;

import org.openqa.selenium.By;
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

    @FindBy(css = ".last_item .page-subheading")
    private WebElement heading;

    @FindBy(css = ".last_item .address_phone_mobile")
    private WebElement phoneMobile;

    @FindBy(css = ".last_item .btn:nth-child(2) >span")
    private WebElement deleteBtn;

    /**
     * This method return the name of the address header.
     * @return heading of the address.
     */
    public String getHeadingTxt() {
        return heading.getText();
    }

    /**
     * This method return the name of the mobile phone header.
     * @return text of the mobile phone.
     */
    public String getPhoneMobileTxt() {
        return phoneMobile.getText();
    }

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

    /**
     * This method sets the address1 in the text box of the address form.
     *
     * @param address1 'address1', that represent an address1.
     */
    @Override
    public void setAddress1(final String address1) {
        address1txtField.sendKeys(address1);
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

    /**
     * This method sets the city in the text box of the address form.
     *
     * @param city 'city', that represent an city.
     */
    @Override
    public void setcity(final String city) {
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

    /**
     * This method sets the postCode in the text box of the address form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    @Override
    public void setPostCode(final String postCode) {
        postcodetxtField.sendKeys(postCode);
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

    /**
     * This method sets the phone in the text box of the address form.
     *
     * @param phone 'phone', that represent an phone.
     */
    @Override
    public void setPhone(final String phone) {
        phonetxtField.sendKeys(phone);
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
}
