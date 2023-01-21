package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends WebElementBase {

    public RadioButton(By locator){
        super(locator);
    }

    public void select() {
        WebElement radio = waitUnilVisibeBase();
        if (!radio.isSelected()) {
            radio.click();
        }
    }
}
