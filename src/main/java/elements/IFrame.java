package elements;

import org.openqa.selenium.By;

public class IFrame extends WebElementBase {

    public IFrame(By locator){
        super(locator);
    }

    public void switchToDefault(){
        switchToDefaultBase();
    }

    public void switchToFrame(){
        switchToDefaultBase();
        switchToFrameBase();
    }
}