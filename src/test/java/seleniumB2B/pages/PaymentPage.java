package seleniumB2B.pages;

import framework.selenium.elements.*;
import seleniumB2B.elements.*;
import org.openqa.selenium.By;

public class PaymentPage {

    InputTextBox cardNumberField;
    InputTextBox nameCardField;
    InputTextBox expirationDateField;
    InputTextBox securityCodeField;
    InputRadioButton diffAdd;
    InputRadioButton sameAdd;
    Button payButton;
    IFrameElement cardNumberFrame;
    IFrameElement nameCardFrame;
    IFrameElement expirationDateFrame;
    IFrameElement securityCodeFrame;
    Notice errorMassage;

    public PaymentPage(){
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

    public PaymentPage fillInPaymentInformation (String cardNumber1, String cardNumber2, String cardNumber3, String cardNumber4, String nameCard, String expirationDate1, String expirationDate2, String securityCode)  {
        cardNumberFrame.switchToFrame();
        cardNumberField.sendText2(cardNumber1);
        cardNumberField.sendText2(cardNumber2);
        cardNumberField.sendText2(cardNumber3);
        cardNumberField.sendText2(cardNumber4);
        nameCardFrame.switchToFrame();
        nameCardField.sendText(nameCard);
        expirationDateFrame.switchToFrame();
        expirationDateField.sendText2(expirationDate1);
        expirationDateField.sendText2(expirationDate2);
        securityCodeFrame.switchToFrame();
        securityCodeField.sendText(securityCode);
//        BaseElements.switchToDefaultBase();
        securityCodeField.switchToDefaultBase();
        diffAdd.selectRadioButton();
        sameAdd.selectRadioButton();
        payButton.clickOnElement();
        return this;
    }

    public String getErrorMessage(){
        if(errorMassage.isVisble()){
            return errorMassage.getTextNotice();
        }else {
            return null;
        }
    }
}