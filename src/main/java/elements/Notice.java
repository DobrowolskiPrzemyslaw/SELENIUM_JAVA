package elements;

import org.openqa.selenium.By;

public class Notice extends WebelementBase {

    public Notice(By locator){
        super(locator);
    }

    public String getText(){
        return waitUnilPresentedBase().getText();
    }

    public boolean isVisble(){
        return waitUnilVisibeBase().isDisplayed();
    }
}

