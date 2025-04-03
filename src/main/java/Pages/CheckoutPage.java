package Pages;

import Helper.Clicking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import static Helper.Clicking.clickFunc;

import static Helper.SelectDropDown.selectFunc;

import static Helper.SendKeys.sendKeysFunc;

public class CheckoutPage {


    //Private Webdriver
    private final WebDriver driver;



    //Public Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }



    //Locators
    private final By firstNameField = By.id("billing_first_name");
    private final By lastNameField = By.id("billing_last_name");
    private final By addressField = By.id("billing_address_1");
    private final By cityField = By.id("billing_city");
    private final By zipField = By.id("billing_postcode");
    private final By emailField = By.id("billing_email");
    private final By placeOrder = By.id("place_order");
    private final By countryDropDown = By.id("billing_country");
    private final By stateDropDown = By.id("billing_state");



    //Actions
    public CheckoutPage enterFirstName(String firstName) {
        sendKeysFunc(driver,firstNameField,firstName,5);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        sendKeysFunc(driver,lastNameField,lastName,5);
        return this;
    }

    public CheckoutPage enterAddress(String address) {
        sendKeysFunc(driver,addressField,address,5);
        return this;
    }


    public CheckoutPage enterCity(String city) {
        sendKeysFunc(driver,cityField,city,5);
        return this;
    }


    public CheckoutPage enterZip(String zip) {
        sendKeysFunc(driver,zipField,zip,5);
        return this;
    }


    public CheckoutPage enterEmail(String email) {
        sendKeysFunc(driver,emailField,email,5);
        return this;
    }

    public CheckoutPage clickPlaceOrder() {
        clickFunc(driver,placeOrder,5);
        return this;
    }

    public CheckoutPage selectCountry(String country) {
        selectFunc(driver,countryDropDown,country);
        return this;
    }

    public CheckoutPage selectState(String state) {
        selectFunc(driver,stateDropDown,state);
        return this;
    }

    public void placeOrder() {
        clickFunc(driver,placeOrder,5);
    }



}
