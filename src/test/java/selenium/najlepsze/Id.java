package selenium.najlepsze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Id {
    WebDriver driver;
    @Test
    public void id_(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By buttonId = By.id("clickOnMe");
        driver.findElement(buttonId);
        driver.findElement(By.id("clickOnMe"));               // <input id="clickOnMe"></input>
    }
}