package elements;

import org.openqa.selenium.By;

public class InputTextBox extends BaseElements {

    public InputTextBox(By locator) {
        super(locator);
    }

    public void sendText(String text) {
        sendTextBase(text);
    }

    public void click(){
        clickOnElementBase();
    }
}

