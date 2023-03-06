package seleniumB2B.pages;

import framework.selenium.elements.Button;
import framework.selenium.elements.InputTextBox;
import framework.selenium.elements.Link;
import org.openqa.selenium.By;

public class HomePage {
    InputTextBox searchField;
    Button searchButton;
    Link productDetialLink;

    public HomePage(){
        searchField = new InputTextBox(By.className("search-bar__input"));
        searchButton = new Button(By.className("search-bar__submit"));
        productDetialLink = new Link(By.linkText("Goran Zip Boot - Rust"));
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
