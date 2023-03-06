package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dzieci {
    //    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
    //    http://cssify.appspot.com/
    WebDriver driver;

    @Test
    public void dzieci_(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("div ul"));               // działa jak xpath //div//ul
        driver.findElement(By.cssSelector("tbody > tr"));           // działa jak xpath //tbody/tr
        driver.findElement(By.cssSelector("li:first-child"));       // zwraca pierwsze dziecko tagu li
        driver.findElement(By.cssSelector("li:last-child"));        // zwraca ostatnie dziecko tagu li
        driver.findElement(By.cssSelector("li:nth-child(2)"));      // zwraca ente dziecko tagu li
//        TODO first child
//        driver.findElement(By.cssSelector("CSS-of-Parent>Element"));
//        driver.findElement(By.cssSelector("CSS-of-Parent>*"));
//        TODO last child
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>tag-name"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element tag-name"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>*"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element *"));
//        TODO Nth child
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>tag-name:nth-of-type(N)"));  // form input:nth-of-type(1)
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>*:nth-of-type(N)"));         // form input:nth-of-type(3)
    }
}
