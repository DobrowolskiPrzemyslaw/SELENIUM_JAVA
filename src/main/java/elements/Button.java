package elements;

import org.openqa.selenium.By;

public class Button extends WebelementBase {

    public Button(By locator){
        super(locator);
    }

    public void click(){
        clickOnElementBase();
    }
}
