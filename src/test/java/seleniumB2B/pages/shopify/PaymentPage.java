package seleniumB2B.pages.shopify;

import seleniumB2B.elements.*;
import org.openqa.selenium.By;

public class PaymentPage {

    InputTextBox cardNumberField;       // Deklaracja obiektu klasy InputTextBox
    InputTextBox nameCardField;         // Deklaracja obiektu klasy InputTextBox
    InputTextBox expirationDateField;   // Deklaracja obiektu klasy InputTextBox
    InputTextBox securityCodeField;     // Deklaracja obiektu klasy InputTextBox

    InputRadioButton diffAdd;
    InputRadioButton sameAdd;

    Button payButton;

    IFrameElement cardNumberFrame;
    IFrameElement nameCardFrame;
    IFrameElement expirationDateFrame;
    IFrameElement securityCodeFrame;

    Notice errorMassage;

    // Konstruktor dla klasy
    public PaymentPage(){

        // Stworzenie obiektów i przekazanie lokatorów - ścieżek do tych webelementów na stronach
        cardNumberField = new InputTextBox(By.id("number"));
        nameCardField = new InputTextBox(By.id("name"));
        expirationDateField = new InputTextBox(By.id("expiry"));
        securityCodeField = new InputTextBox(By.id("verification_value"));

        diffAdd = new InputRadioButton(By.xpath("//input[@id='checkout_different_billing_address_true']"));
        sameAdd = new InputRadioButton(By.xpath("//input[@id='checkout_different_billing_address_false']"));

        payButton = new Button(By.xpath("//button[@id='continue_button']"));

        cardNumberFrame = new IFrameElement(By.xpath("//iframe[starts-with(@id, 'card-fields-number-')]"));
        nameCardFrame = new IFrameElement(By.xpath("//iframe[starts-with(@id, 'card-fields-name-')]"));
        expirationDateFrame = new IFrameElement(By.xpath("//iframe[starts-with(@id, 'card-fields-expiry-')]"));
        securityCodeFrame = new IFrameElement(By.xpath("//iframe[starts-with(@id, 'card-fields-verification_value-')]"));

        errorMassage = new Notice((By.xpath("//div[@class='notice notice--error default-background']//p")));
    }

    // Metoda do poszukiania elementów
    public PaymentPage fillInPaymentInformation (String cardNumber1, String cardNumber2, String cardNumber3, String cardNumber4, String nameCard, String expirationDate1, String expirationDate2, String securityCode)  {

        cardNumberFrame.switchToFrame();        // przełącza na ramkę gdzie znajduje się pole cardNumberField
        cardNumberField.sendText2(cardNumber1); // odwołanie do obiektu cardNumberField i przesłanie tekstu przypisanego do zmiennej cardNumber1 za pomocą metody sendText1
        cardNumberField.sendText2(cardNumber2);
        cardNumberField.sendText2(cardNumber3);
        cardNumberField.sendText2(cardNumber4);


        nameCardFrame.switchToFrame();       // przełącza na ramkę gdzie znajduje się pole nameCardField
        nameCardField.sendText(nameCard);


        expirationDateFrame.switchToFrame(); // przełącza na ramkę gdzie znajduje się pole expirationDateField
        expirationDateField.sendText2(expirationDate1);
        expirationDateField.sendText2(expirationDate2);

        securityCodeFrame.switchToFrame();   // przełącza na ramkę gdzie znajduje się pole securityCodeField
        securityCodeField.sendText(securityCode);

        // pozwala wrócić spowrotem do pierwotnej strony
//        BaseElements.switchToDefaultBase();    // odwołanie się do klasy BaseElements i użycie statycznej metody (metoda musi być statyczna)
        securityCodeField.switchToDefaultBase(); // odwołanie się do obiektu securityCodeField

        diffAdd.selectRadioButton(); // zazancz radio button diffAdd
        sameAdd.selectRadioButton(); // zazancz radio button sameAdd
        payButton.clickOnElement(); // kliknij w payButton
        return this;
    }

    public String getErrorMessage(){
        if(errorMassage.isVisble()){             // sprawadz czy tekst jest widoczny
            return errorMassage.getTextNotice(); // jeśli tekst jest widoczny to z obietku errorMassage pobierze .getTextNotice() teskt i go zwróci return
        }else
        return null; // jeśli tekst bedzie niewidoczny to zwroci nulla
    }
}