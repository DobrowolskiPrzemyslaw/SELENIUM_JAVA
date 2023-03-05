package seleniumB2B.elements;

import org.openqa.selenium.By;

public class IFrameElement extends BaseElements{

    // Konstruktor dla obiektu klasy Button
    public IFrameElement(By locator){
        super(locator); // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    public void switchToFrame(){
        switchToDefaultBase();
        switchToFrameBase();
    }
}