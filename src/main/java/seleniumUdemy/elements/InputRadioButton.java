package seleniumUdemy.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputRadioButton extends BaseElements{

    // Konstruktor dla obiektu klasy Button
    public InputRadioButton(By locator){
        super(locator); // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    public void selectRadioButton() {
        WebElement radio = waitUnilVisibeBase();
        if (!radio.isSelected()) {
            radio.click();
        }
    }
}
