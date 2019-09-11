package AutomationPractice.ui.pages;

import AutomationPractice.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * AddressPage class, this class is in charge of the address elements.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
public class AddressPage extends BasePage {
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

    /**
     * This method is in charge of the change address fields of the application.
     *
     * @param field 'field', it indicates the field with which the address update will be carried out.
     */
    public void address(final String field) {
        setFirstName(field);
        clickSubmitBtn();
    }

    /**
     * This method is in charge of clicking on the submit button.
     */
    private void clickSubmitBtn() {
        submitBtn.click();
    }

    /**
     * This method sets the firstName in the text box of the address form.
     *
     * @param firstName 'firstName', that represent an firstName.
     */
    private void setFirstName(final String firstName) {
        firstnametxtField.clear();
        firstnametxtField.sendKeys(firstName);
    }

    /**
     * This method sets the lastName in the text box of the address form.
     *
     * @param lastName 'lastName', that represent an lastName.
     */
    private void setLastName(final String lastName) {
        lastnametxtField.sendKeys(lastName);
    }

    /**
     * This method sets the company in the text box of the address form.
     *
     * @param company 'company', that represent an company.
     */
    private void setCompany(final String company) {
        companytxtField.sendKeys(company);
    }

    /**
     * This method sets the address1 in the text box of the address form.
     *
     * @param address1 'address1', that represent an address1.
     */
    private void setAddress1(final String address1) {
        address1txtField.sendKeys(address1);
    }

    /**
     * This method sets the address2 in the text box of the address form.
     *
     * @param address2 'address2', that represent an address2.
     */
    private void setAddress2(final String address2) {
        address2txtField.sendKeys(address2);
    }

    /**
     * This method sets the city in the text box of the address form.
     *
     * @param city 'city', that represent an city.
     */
    private void setcity(final String city) {
        citytxtField.sendKeys(city);
    }

    /**
     * This method sets the state in the text box of the address form.
     *
     * @param state 'state', that represent an state.
     */
    private void setIdState(final String state) {
        statetxtField.sendKeys(state);
    }

    /**
     * This method sets the postCode in the text box of the address form.
     *
     * @param postCode 'postCode', that represent an postCode.
     */
    private void setPostCode(final String postCode) {
        postcodetxtField.sendKeys(postCode);
    }

    /**
     * This method sets the country in the text box of the address form.
     *
     * @param country 'country', that represent an country.
     */
    private void setIdCountry(final String country) {
        countrytxtField.sendKeys(country);
    }

    /**
     * This method sets the phone in the text box of the address form.
     *
     * @param phone 'phone', that represent an phone.
     */
    private void setPhone(final String phone) {
        phonetxtField.sendKeys(phone);
    }

    /**
     * This method sets the phoneMovil in the text box of the address form.
     *
     * @param phoneMovil 'phoneMovil', that represent an phoneMovil.
     */
    private void setPhoneMovil(final String phoneMovil) {
        phoneMobiletxtField.sendKeys(phoneMovil);
    }

    /**
     * This method sets the other in the text box of the address form.
     *
     * @param other 'other', that represent an other.
     */
    private void setOther(final String other) {
        othertxtField.sendKeys(other);
    }

    /**
     * This method sets the alias in the text box of the address form.
     *
     * @param alias 'alias', that represent an alias.
     */
    private void setAlias(final String alias) {
        aliastxtField.sendKeys(alias);
    }
}
