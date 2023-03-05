package seleniumB2B.pages.shopify;

import seleniumB2B.elements.*;
import org.openqa.selenium.By;


public class PurchasePage  {

    InputTextBox emailField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox firstnameField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox lastnameField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox addressField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox postalCodeField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox cityField; // Deklaracja obiektu klasy InputTextBox
    InputTextBox phoneNumberField; // Deklaracja obiektu klasy InputTextBox
    SelectBox selectCountry; // Deklaracja obiektu klasy SelectBox
    Button continueToShipping; // Deklaracja obiektu klasy Button
    InputCheckbox newsletter;
    InputCheckbox saveMe;



    // Konstruktor dla klasy
    public PurchasePage(){

        // Stworzenie obiektów i przekazanie lokatorów - ścieżek do tych webelementów na stronach
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

    // Metoda do poszukiania elementów
    public ShippingPage fillInContactForm (String email, boolean newsCheckbox, String firstName, String lastName, String address, String postalCode, String cityName, String phoneNumber, boolean saveCheckbox, String countryName){
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
