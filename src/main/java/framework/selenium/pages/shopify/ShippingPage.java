package framework.selenium.pages.shopify;

import framework.selenium.base.elements.Button;
import org.openqa.selenium.By;

public class ShippingPage {

    Button continueToPayment;

    public ShippingPage(){
        continueToPayment = new Button(By.xpath("//button[./span[text()='Continue to payment']]"));
    }

    public PaymentPage shipping (){
        continueToPayment.click();
        return new PaymentPage();
    }
}
