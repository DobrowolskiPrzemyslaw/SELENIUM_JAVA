package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends BaseElements{

    public RadioButton(By locator){
        super(locator);
    }

    public void selectRadioButton() {
        WebElement radio = waitUnilVisibeBase();
        if (!radio.isSelected()) {
            radio.click();
        }
    }
}
