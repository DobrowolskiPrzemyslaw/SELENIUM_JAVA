package seleniumB2B.elements;

import org.openqa.selenium.By;

public class SelectBox extends BaseElements{

    public SelectBox(By locator){
        super(locator);
    }

    public void clickOnLink(){
        clickOnElementBase();
    }

    public void selectByVisibleText(String text){
        selectByVisibleTextBase(text);
    }
}
