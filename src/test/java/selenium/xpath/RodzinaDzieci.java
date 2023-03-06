package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

import java.util.List;

public class RodzinaDzieci extends BaseTest {
    WebDriver driver;

    @Test
    public void rodzice(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div/.."));                        // zwraca bezposredniego rodzica
        driver.findElement(By.xpath("//div/../.."));                     // zwraca bezposredniego rodzica rodzica
        driver.findElement(By.xpath("//div/ancestor::*"));               // zwraca wszystkie ostatnich rodzicow tagu div
        driver.findElement(By.xpath("//ul/parent::div"));                // zwraca pierwszego rodzica o tagu konkretnym tagu
        driver.findElement(By.xpath("//div/ancestor::body"));            // zwraca wszystkie rodzicow o tagu konkretnym tagu
    }

    @Test
    public void dzieci(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div/child::ul"));                 // zwraca pierwsze dziecko
        driver.findElement(By.xpath("//div/ul"));                        // zwraca pierwsze dziecko
        driver.findElement(By.xpath("//div/descendant::ul"));            // zwraca wszystkie ostatnie dzieci tagu div o tagu  ul
        driver.findElement(By.xpath("//div/descendant::*"));             // zwraca wszystkie ostatnie dzieci tagu div
        driver.findElement(By.xpath("//img/following::*"));              // zwraca wszystkie dzieci/elementy wystepujace po obrazku
        driver.findElement(By.xpath("//img/preceding::*"));              // zwraca wszystkich dzici/elementy wystepujace przed obrazkiem
    }
}
