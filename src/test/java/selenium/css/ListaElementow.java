package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ListaElementow {
    //    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
    //    http://cssify.appspot.com/
    WebDriver driver;

    @Test
    public void zwracanieWszystkichElementow(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("*"));                            // zwroci pierwszy element ze wszystkich elemnetow
        driver.findElement(By.cssSelector("input.klasName[name='fname']")); // tag/klasName/atrybut
    }
}
