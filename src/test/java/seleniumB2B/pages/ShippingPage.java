package seleniumB2B.pages;

import framework.selenium.elements.Button;
import seleniumB2B.elements.*;
import org.openqa.selenium.By;

public class ShippingPage {

    Button paymentButton;

    public ShippingPage(){
        paymentButton = new Button(By.xpath("//button[@class='step__footer__continue-btn btn']"));
    }

    public PaymentPage shipping (){
        paymentButton.clickOnElement();
        return new PaymentPage();
    }
}
