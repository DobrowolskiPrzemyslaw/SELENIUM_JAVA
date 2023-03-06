package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.Dimension;

public class ManiuplacjaWielkosciaOknaPrzegladarki {

    // http://pragmatictestlabs.com/2018/06/28/selenium-webdriver-commands/

    // Najlepsza opcja dla Dockera i odpalania zdalnego
    @Test
    public void konkretnaWielkoscOknaPrzegladarki(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(2000, 1200));
        driver.close();
    }

    @Test
    public void maksymalnaWielkoscOkna(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void pelenEkran(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.close();
    }

    @Test
    public void przesuniecieOknaPrzegladarkiWokresloneMiejsce() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setPosition(new Point(50,200));
        driver.close();
    }
}
