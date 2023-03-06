package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PoPosiadaniu {
    WebDriver driver;

    @Test
    public void posiada_(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div[./ul]"));                                // zwraca wszystkie divy posiadające w strukturze tag ul
        driver.findElement(By.xpath("//select[./option[text()='Volvo']]"));         // zwraca wszystkie selecty posiadające w strukturze tag option z tekstem Volvo
    }
}
