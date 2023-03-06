package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;
import java.util.List;

public class PoKolejnosci extends BaseTest {
    WebDriver driver;

    @Test
    public void kolejnosc(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input[1]"));                     // zwraca wszystkie inputy, ktore nie sa zagniezdzone???
        driver.findElement(By.xpath("//input[2]"));                     // zwraca wszystkie inputy, ktore nie sa zagniezdzone???
        driver.findElement(By.xpath("(//input)[1]"));                   // zwraca wszystkie piersze inputy, które znajdują się w danej strukturze - w tym przypadku z calej strony bo nie ma struktury wczesniej
        driver.findElement(By.xpath("(//form//input)[1]"));             // zwraca wszystkie piersze inputy, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button"));                       // zwraca wszystkie buttony ze strony
        driver.findElement(By.xpath("//button[1]"));                    // zwraca pierwszy button, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button[first()]"));              // zwraca pierwszy buttony, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button[last()]"));               // zwraca ostatnie buttony, które znajdują się w danej strukturze
        driver.findElement(By.xpath("(//button)[last()]"));             // zwraca ostatni button ze strony
        driver.findElement(By.xpath("(//button)[last()-1]"));           // zwraca przedostatni button, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//li[2]"));                        // zwraca wszystkie li na 2 pozycji w danej strukturze
        driver.findElement(By.xpath("//li[position()=2]"));             // zwraca wszystkie li na 2 pozycji w danej strukturze
        driver.findElements(By.xpath("//div[position()!=2]"));          // zwraca wszystkie divy bez 2 w danej strukturze
        driver.findElements(By.xpath("//li[position()>2]"));            // zwraca wszystkie li pozniej w strukturze niz 2 pozycja
        driver.findElements(By.xpath("//li[position()<3]"));            // zwraca wszystkie li wczesniej w strukturze niz 3 pozycja
        driver.findElements(By.xpath("//li[position()>=2]"));           // zwraca wszystkie li pozniej w strukturze niz 1 pozycja
        driver.findElements(By.xpath("//li[position()<=3]"));           // zwraca wszystkie li wczesniej w strukturze niz 4 pozycja
    }
}
