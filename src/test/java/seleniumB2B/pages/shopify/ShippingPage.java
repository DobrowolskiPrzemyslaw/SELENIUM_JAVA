package seleniumB2B.pages.shopify;

import seleniumB2B.elements.*;
import org.openqa.selenium.By;

public class ShippingPage {

    Button paymentButton; // Deklaracja obiektu klasy Button

    // Konstruktor dla klasy
    public ShippingPage(){

        // Stworzenie obiektów i przekazanie lokatorów - ścieżek do tych webelementów na stronach
        paymentButton = new Button(By.xpath("//button[@class='step__footer__continue-btn btn']"));

    }

    // Metoda do poszukiania elementów
    public PaymentPage shipping (){
        paymentButton.clickOnElement();
        return new PaymentPage();
    }

}
