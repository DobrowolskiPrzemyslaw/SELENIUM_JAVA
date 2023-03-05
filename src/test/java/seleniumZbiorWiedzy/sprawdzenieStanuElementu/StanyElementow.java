package seleniumZbiorWiedzy.sprawdzenieStanuElementu;

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
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(czyIstniej2(By.tagName("p")));
        System.out.println(czyIstniej2(By.id("topSecret")));

        System.out.println(czyIstniej3(By.tagName("p")));
        System.out.println(czyIstniej3(By.id("topSecret")));
    }

    @Test
    public void czyWidoczny(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());      //FALSE JESLI element jest ukryty
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed()); //TRUE JESLI element nie jest ukryty
    }

    // do sprawdzenia klikalnosci elementu
    // do sprawdzeniea mozliwosci wpisania czegos w pole tesktowe lub input
    @Test
    public void czyEdytowalnyKlikalny(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());   //TRUE JESLI element jest np. klikalny/ nie jest wyszarzony
    }

    @Test
    public void czyZaznaczony(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());   //FALSE JESLI element nie jest zaznaczony
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());   //TRUE JESLI element jest zaznaczony
    }

    public boolean czyIstniej2(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

    // dla listy elementow
    public boolean czyIstniej3(By locator){
        return driver.findElements(locator).size() > 0 ;
    }

}
