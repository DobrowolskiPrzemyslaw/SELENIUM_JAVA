package elements;

import org.openqa.selenium.By;

public class Button extends WebElementBase {

    public Button(By locator){
        super(locator);
    }

    public void click(){
        clickOnElementBase();
    }

    public void moveTo(){
        moveToElementBase();
    }
}
