package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

import java.util.List;

public class Id_Class_Name_Tag_Link extends BaseTest {
    WebDriver driver;

    @Test
    public void idXpathTest(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*[@id='clickOnMe']"));
    }

    @Test
    public void classXpathTest(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*[@class='topSecret']"));
    }

    @Test
    public void nameXpathTest(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*[@name='fname']"));
    }

    @Test
    public void tagXpathTest(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input"));
    }

    @Test
    public void linkTest() {
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));        // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));             // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
    }
}
