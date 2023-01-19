package elements;

import org.openqa.selenium.By;

public class Notice extends BaseElements{

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

