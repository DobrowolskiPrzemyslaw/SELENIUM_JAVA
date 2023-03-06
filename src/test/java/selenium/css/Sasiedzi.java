package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sasiedzi {
    //    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
    //    http://cssify.appspot.com/
    WebDriver driver;

    @Test
    public void sasiedzi_(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("table,tr"));                               // TODO NIE WIEM JAK TO DZIALA
        driver.findElement(By.cssSelector("label + form"));                           // pierwsze sasiad tagu lable o tabu form
        driver.findElements(By.cssSelector("label ~ form"));                          // zwraca wszystkich sasiadow lablu lable o tagu form (ZWRACA LISTE)
//        driver.findElement(By.cssSelector("CSS-of-the-Siblings:nth-child(n)"));
//        driver.findElement(By.cssSelector("CSS-of-the-Siblings:nth-last-child(n)")); // liczac od ostatniego
//        TODO first-child sibling/sasiedzi - pierwszy element listy
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>Element:first-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element Element:first-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element>Element:first-child"));
//        TODO first-last sibling/sasiedzi - ostatni element listy
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>Element:last-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element Element:last-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element>Element:last-child"));
    }
}
