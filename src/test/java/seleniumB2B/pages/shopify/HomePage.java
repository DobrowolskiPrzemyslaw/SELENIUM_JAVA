package seleniumB2B.pages.shopify;

import seleniumB2B.driver.DriverManager;
import seleniumB2B.elements.Button;
import seleniumB2B.elements.InputTextBox;
import seleniumB2B.elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    InputTextBox searchField; // Deklaracja obiektu klasy InputTextBox
    Button searchButton; // Deklaracja obiektu klasy Button
    Link productDetialLink;
    WebDriver driver = DriverManager.getDriver(); // przypisz pobranego drivera do zmiennej


    // Konstruktor dla klasy
    public HomePage(){

        // Stworzenie obiektów i przekazanie lokatorów - ścieżek do tych webelementów na stronach
        searchField = new InputTextBox(By.className("search-bar__input"));
        searchButton = new Button(By.className("search-bar__submit"));
        productDetialLink = new Link(By.linkText("Goran Zip Boot - Rust"));
    }

//    // Metoda do otwierania pierszej strony - metoda skasowana gdyż @Beforetest będzie uruchamiał url
//    public HomePage openHomePage(){
//        driver.get("url"); // otwórz stronę https://simpletheme.myshopify.com/
//        return this;
//    }
    // Metoda do poszukiania elementów
    public HomePage searchItem(String item){
        searchField.sendText(item);
        searchButton.clickOnElement();
        return this;
    }

    // Twrzymy metode do klikania na linki (link musimy przeslać)
    public ProductDetails clickOnItemLink(){
        productDetialLink.clickOnLink();
        return new ProductDetails(); // musimy zwrócić nowy obiekt bo przeniesie nas na kolejna strone
    }
}
