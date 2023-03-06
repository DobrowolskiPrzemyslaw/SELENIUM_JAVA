package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class ObslugaNowegoOkna {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentWindow = driver.getWindowHandle();                   // pobieramy aktualną nazwę okna i zapisujemy do zmiennej
        driver.findElement(By.id("newPage")).click();                          // klikniecie w link po zapisaniu webElementu do zmiennej

        Set<String> nazwyOkien = driver.getWindowHandles();
        for(String windowName: nazwyOkien){
            if(!windowName.equals(currentWindow)){
                driver.switchTo().window(windowName);
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//div[.='Zgadzam się']")).click();
                driver.findElement(By.name("q")).sendKeys("Selenium test"); // klikniecie w link po zapisaniu webElementu do zmiennej
            }
        }
        driver.switchTo().window(currentWindow);                               // powrot do pierwotnego okna
        driver.findElement(By.name("fname")).sendKeys("Przemek");
    }
}
