package seleniumB2B.elements;

import org.openqa.selenium.By;

public class Link extends BaseElements{

        public Link(By locator){
            super(locator);
        }

        public void clickOnLink(){
            clickOnElementBase();
        }
}
