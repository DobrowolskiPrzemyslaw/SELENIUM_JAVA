package seleniumB2B.elements;

import org.openqa.selenium.By;

public class Notice  extends BaseElements{

    // Konstruktor dla klasy (By locator - gdyż adres ścieżki do danego obiektu będzie przesłany)
    public Notice(By locator){
        super(locator);
    }

    // metoda pobierająca tekct notifikacji
    public String getTextNotice(){
        return waitUnilPresentedBase().getText();
    }

    // metoda sprawdzajaca widoczność tekstu
    public boolean isVisble(){
        return waitUnilVisibeBase().isDisplayed();
    }

}

