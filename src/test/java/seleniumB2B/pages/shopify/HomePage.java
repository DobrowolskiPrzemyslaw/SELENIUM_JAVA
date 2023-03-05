package seleniumB2B.pages.shopify;

import seleniumB2B.driver.DriverManager;
import seleniumB2B.elements.Button;
import seleniumB2B.elements.InputTextBox;
import seleniumB2B.elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    InputTextBox searchField;
    Button searchButton;
    Link productDetialLink;
    WebDriver driver = DriverManager.getDriver();

    public HomePage(){
        searchField = new InputTextBox(By.className("search-bar__input"));
        searchButton = new Button(By.className("search-bar__submit"));
        productDetialLink = new Link(By.linkText("Goran Zip Boot - Rust"));
    }

    public HomePage openHomePage(){
        driver.get("https://simpletheme.myshopify.com/");
        return this;
    }

    public HomePage searchItem(String item){
        searchField.sendText(item);
        searchButton.clickOnElement();
        return this;
    }

    public ProductDetails clickOnItemLink(){
        productDetialLink.clickOnLink();
        return new ProductDetails();
    }
}
