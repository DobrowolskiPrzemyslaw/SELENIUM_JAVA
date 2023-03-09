package przyklady.waity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

// Konczy test tak szybko jak pojawi sie nie widoczny element na stronie - to spoko
// explicityWait co jakis czas odpytuje strone w ciagu zadanego przez nas czasu, jesli znajdzie element to idzie dalej
// explicityWait pozwala definowac nam inne warunki niz tylko czy element jest widoczny na stronie
// explicityWait mozemy uzywac dla specyficznych przypadkow i tylko dla nich
// explicityWait nie oddnosi sie do wszystkich obiektow na stronie tak jak implicitlyWait
// WebDriverWait domyslnie ignoruje wyjatek NoSuchElementException
public class ExplicitWaitTest {
    WebDriver driver;

    @Test
    public void czekajaAzElementBedzieWidzialny() {
        String pathDriver = "F:\\PROGRAMOWANIE\\_Selenium\\Selenium\\src\\main\\resources\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))).click();
        driver.close();
    }

    @Test
    public void czekajaAzElementBedzieWidzialny2() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))).click();
        driver.close();
    }

    @Test
    public void czekajaAzElementBedzieKlikalny() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p"))).click();
        driver.close();
    }

    @Test
    public void czekajaAzElementBedzieZaznaczony() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("p")));
        driver.close();
    }

    @Test
    public void czekajaAzRamkaBedzieDostepna() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("p")));
        driver.close();
    }

    @Test
    public void czekanieNaAlert() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.close();
    }

    @Test
    public void gdyBedzieWidoczny() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clickOnMe"))).click();
    }

    @Test
    public void gdyBedzieKlikalny() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("clickOnMe"))).click();
    }
}
