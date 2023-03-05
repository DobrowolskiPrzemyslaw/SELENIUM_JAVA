package seleniumUdemy.elements;

import org.openqa.selenium.By;

//
public class SelectBox extends BaseElements{

    // Konstruktor dla klasy (By locator - gdyż adres ścieżki do danego obiektu będzie przesłany)
    public SelectBox(By locator){
        super(locator);
    }

    // Tworzymy metode, która będzie wybierala z opcji selekta
    public void clickOnLink(){
        clickOnElementBase(); // metoda do klikania
    }

    public void selectByVisibleText(String text){
        selectByVisibleTextBase(text);
    }
}
