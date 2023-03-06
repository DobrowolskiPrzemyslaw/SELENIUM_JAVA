package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

import java.util.List;

public class ListaElementow extends BaseTest {
    WebDriver driver;

    @Test
    public void zwrotListy(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        List<WebElement> listaElementow = driver.findElements(By.xpath("//*"));          // zwraca wszystkie elementy ze strony
        listaElementow = driver.findElements(By.xpath("//input[@name]"));                // zwraca wszystkie inputy, które posiadają atrybut name
        listaElementow = driver.findElements(By.xpath("//*[@name]"));                    // zwraca wszystkie elementy, które posiadają atrybut name
    }
}
