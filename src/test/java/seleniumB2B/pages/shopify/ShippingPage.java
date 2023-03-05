package seleniumB2B.pages.shopify;

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
