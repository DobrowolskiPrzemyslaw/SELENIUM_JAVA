package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PoTekscie {
    WebDriver driver;

    @Test
    public void inne(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));        // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));             // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
        driver.findElement(By.xpath("//option[contains(text(),'Volvo')]"));        // zwraca wszystkie elementy, ktorych text zawiera ciagn znakow Volvo
    }
}
