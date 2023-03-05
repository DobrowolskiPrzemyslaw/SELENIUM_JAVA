package seleniumUdemy.elements;

import org.openqa.selenium.By;

public class InputCheckbox extends BaseElements{

    // Konstruktor dla obiektu klasy Button
    public InputCheckbox(By locator){
        super(locator); // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    // metoda sprawdza czy checkbox jest zaznaczony
    public boolean isChecked(){
        return isSelectedBase();
    }

    // metoda odznacza zaznaczony checkbox
    public void uncheckbox(){
        if (isSelectedBase())
           clickOnElementBase();
    }

    // metoda zaznacza odznaczony checkbox
    public void checkbox() {
        if(!isSelectedBase())
            clickOnElementBase();
    }

    // taka metoda była w kursie - dzieki temu z poziomu test u mogół odwoływac się do elementów (chodziło o sprawdzenie poprawności dzialania, nie rezultat)
    public void checkUncheckCheckbox(boolean check) {
        if (check) {
            if (!isSelectedBase())
                clickOnElementBase();
        } else {
            if (isSelectedBase())
                clickOnElementBase();
        }
    }
}