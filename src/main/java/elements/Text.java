package elements;

import org.openqa.selenium.By;

public class Text extends WebElementBase {

    public Text(By locator){
        super(locator);
    }

    public String getText(){
        return waitUnilPresentedBase().getText();
    }

    public boolean isVisble(){
        return waitUnilVisibeBase().isDisplayed();
    }
}

