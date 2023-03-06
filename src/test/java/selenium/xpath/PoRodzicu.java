package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

public class PoRodzicu extends BaseTest {
    WebDriver driver;

    @Test
    public void doRodzica(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div/.."));                        // zwraca bezposredniego rodzica
        driver.findElement(By.xpath("//div/../.."));                     // zwraca bezposredniego rodzica rodzica
        driver.findElement(By.xpath("//div/ancestor::*"));               // zwraca wszystkie ostatnich rodzicow tagu div
        driver.findElement(By.xpath("//ul/parent::div"));                // zwraca pierwszego rodzica o tagu konkretnym tagu
        driver.findElement(By.xpath("//div/ancestor::body"));            // zwraca wszystkie rodzicow o tagu konkretnym tagu
    }
}
