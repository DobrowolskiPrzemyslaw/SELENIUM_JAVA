package elements;

import org.openqa.selenium.By;

public class Input extends WebelementBase {

    public Input(By locator) {
        super(locator);
    }

    public void sendText(String text) {
        sendTextBase(text);
    }

    public void click(){
        clickOnElementBase();
    }
}

