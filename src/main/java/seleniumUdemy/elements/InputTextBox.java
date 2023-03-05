package seleniumUdemy.elements;

import org.openqa.selenium.By;

// InputTextBox dziedziczy po klasie BaseElements - czyli po odwołaniu do tej klasy będziemy mogli korzystać z wszystkich metod klasy BaseElements (o ile nie są prywatne)
public class InputTextBox extends BaseElements {

    // Konstruktor dla obiektu klasy InputTextBox
    public InputTextBox(By locator){        // locator to przekazana sciezka do webElementu
        super(locator);                     // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    public void sendText(String text){      // void bo metoda nic nie zwraca, tylko coś wpisuje
        sendTextBase(text);                 // prześli (text) podany jako parametr
    }

    public void sendText2(String text){     // void bo metoda nic nie zwraca, tylko coś wpisuje
        sendTextBase2(text);                // prześli (text) podany jako parametr
    }


}
