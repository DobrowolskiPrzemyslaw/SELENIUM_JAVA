package rozmowyRekrutacyjne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrzygotowanieDoRozmowyRekrutacyjnej {
    WebDriver driver;

    @Test
    public void odpalenieFireFox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void maksymalizacjaOknaPrzegladarki() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void odpalenieKonkretnejStrony() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
    }

    @Test
    public void dodanieOczekwaczaNaElementy() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void klikanieWelementPojawiajacySiePoPewnymCzasie() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clickOnMe"))).click();   // kliknie odrazu jak będzie widoczny

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))).click();  // kliknie odrazu jak będzie widoczny
    }

    @Test
    public void pobranieTekstuNiewidocznegoElementu() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clickOnMe"))).click();   // kliknie odrazu jak będzie widoczny

        String wartoscAtrybutuValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))).getText();
        System.out.println(wartoscAtrybutuValue);
    }
}
