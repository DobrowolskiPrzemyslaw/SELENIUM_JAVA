package elements;

import org.openqa.selenium.By;

public class IFrame extends BaseElements{

    public IFrame(By locator){
        super(locator);
    }

    public void switchToFrame(){
        switchToDefaultBase();
        switchToFrameBase();
    }
}