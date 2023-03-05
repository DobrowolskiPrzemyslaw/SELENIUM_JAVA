package seleniumUdemy.elements;

import org.openqa.selenium.By;

public class Button extends BaseElements{

    // Konstruktor dla obiektu klasy Button
    public Button(By locator){
        super(locator); // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    public void clickOnElement(){
        clickOnElementBase();
    }
}
