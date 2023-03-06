package framework.selenium.pages.shopify;

import framework.selenium.base.elements.Button;
import framework.selenium.base.elements.InputTextBox;
import framework.selenium.base.elements.Link;
import org.openqa.selenium.By;

public class HomePage {
    InputTextBox searchField;
    Button searchButton;
    Link productDetialLink;

    public HomePage(){
        searchField = new InputTextBox(By.className("search-bar__input"));
        searchButton = new Button(By.className("search-bar__submit"));
        productDetialLink = new Link(By.xpath("//a[@title='Goran Zip Boot - Rust']"));
    }

    public HomePage searchItem(String item){
        searchField.sendText(item);
        searchButton.click();
        return this;
    }

    public ProductDetails clickOnItemLink() throws InterruptedException {
        productDetialLink.click();
        return new ProductDetails();
    }
}
