package seleniumB2B.pages;

import seleniumB2B.elements.Button;
import seleniumB2B.elements.InputTextBox;
import seleniumB2B.elements.Link;
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
