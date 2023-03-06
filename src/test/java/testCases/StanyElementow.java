package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StanyElementow {

    WebDriver driver;

    // paragraf jest w strukturze ale jest ukryty
    @Test
    public void czyIstnieje(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(czyIstniej2(By.tagName("p")));
        System.out.println(czyIstniej2(By.id("topSecret")));
        System.out.println(czyIstniej(By.tagName("p")));
        System.out.println(czyIstniej(By.id("topSecret")));
    }

    @Test
    public void czyWidoczny(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());      //FALSE JESLI element jest ukryty
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed()); //TRUE JESLI element nie jest ukryty
    }

    // do sprawdzenia klikalnosci elementu
    // do sprawdzeniea mozliwosci wpisania czegos w pole tesktowe lub input
    @Test
    public void czyEdytowalnyKlikalny(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());   //TRUE JESLI element jest np. klikalny/ nie jest wyszarzony
    }

    @Test
    public void czyZaznaczony(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());   //FALSE JESLI element nie jest zaznaczony
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());   //TRUE JESLI element jest zaznaczony
    }

    public boolean czyIstniej(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

    // dla listy elementow
    public boolean czyIstniej2(By locator){
        return driver.findElements(locator).size() > 0 ;
    }

}
