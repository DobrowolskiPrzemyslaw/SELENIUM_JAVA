package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

public class PoOr_And extends BaseTest {
    WebDriver driver;

    @Test
    public void or(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input | //div"));                            // zwraca wszystkie inputy lub divy
        driver.findElement(By.xpath("//input | //div//a"));                         // zwraca wszystkie inputy lub divy z linkiem/tagie a
        driver.findElement(By.xpath("//input[@name='fname' or @id='fname']"));      // zwraca wszystkie inputy, ktore posiadaja name lub id rowny fname
    }

    @Test
    public void and(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));     // zwraca wszystkie inputy, ktore posiadaja name i id rowny fname
    }
}
