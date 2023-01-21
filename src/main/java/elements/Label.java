package elements;

import org.openqa.selenium.By;

public class Label extends WebElementBase {

    public Label(By locator){
        super(locator);
    }

    public void click(){
        clickOnElementBase();
    }
}
