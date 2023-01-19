package elements;

import org.openqa.selenium.By;

public class Label extends BaseElements{

    public Label(By locator){
        super(locator);
    }

    public void clickOnElement(){
        clickOnElementBase();
    }
}
