package seleniumB2B.pages.shopify;

import seleniumB2B.elements.*;
import org.openqa.selenium.By;

public class PurchasePage  {

    InputTextBox emailField;
    InputTextBox firstnameField;
    InputTextBox lastnameField;
    InputTextBox addressField;
    InputTextBox postalCodeField;
    InputTextBox cityField;
    InputTextBox phoneNumberField;
    SelectBox selectCountry;
    Button continueToShipping;
    InputCheckbox newsletter;
    InputCheckbox saveMe;

    public PurchasePage(){
        emailField = new InputTextBox(By.xpath("//input[@id='checkout_email']"));
        firstnameField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_first_name']"));
        lastnameField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_last_name']"));
        addressField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_address1']"));
        postalCodeField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_zip']"));
        cityField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_city']"));
        phoneNumberField = new InputTextBox(By.xpath("//input[@id='checkout_shipping_address_phone']"));
        selectCountry = new SelectBox(By.xpath("//select[@id='checkout_shipping_address_country']"));
        continueToShipping = new Button(By.xpath("//button[@id='continue_button']"));
        newsletter = new InputCheckbox(By.xpath("//input[@id='checkout_buyer_accepts_marketing']"));
        saveMe = new InputCheckbox(By.xpath("//input[@id='checkout_remember_me']"));

    }
    public ShippingPage fillInContactForm (String email, boolean newsCheckbox, String firstName, String lastName,
                                           String address, String postalCode, String cityName, String phoneNumber,
                                           boolean saveCheckbox, String countryName){
        emailField.sendText(email);
        newsletter.checkUncheckCheckbox(newsCheckbox);
        firstnameField.sendText(firstName);
        lastnameField.sendText(lastName);
        addressField.sendText(address);
        postalCodeField.sendText(postalCode);
        cityField.sendText(cityName);
        selectCountry.selectByVisibleText(countryName);
        phoneNumberField.sendText(phoneNumber);
        saveMe.checkUncheckCheckbox(saveCheckbox);
        continueToShipping.clickOnElement();
        return new ShippingPage();
    }
}
