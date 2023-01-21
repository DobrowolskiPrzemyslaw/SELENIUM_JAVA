package elements;

import org.openqa.selenium.By;

public class Link extends WebElementBase {

    public Link(By locator){
        super(locator);
    }

    public void click(){
        clickOnElementBase();
    }
}
