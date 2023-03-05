package seleniumUdemy.elements;

import org.openqa.selenium.By;

// oddzielna klasa dla linku gdyż w przypadu linku może być tu znacznie więcej metod niż dla przycisku
public class Link extends BaseElements{

        // Konstruktor dla klasy (By locator - gdyż adres ścieżki do danego obiektu będzie przesłany)
        public Link(By locator){
            super(locator);
        }

        // Tworzymy metode, która będzie klikała
        public void clickOnLink(){
            clickOnElementBase(); // metoda do klikania
        }
}
