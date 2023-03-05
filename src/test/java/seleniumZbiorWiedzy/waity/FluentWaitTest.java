package seleniumZbiorWiedzy.waity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

//Brak domyslnie ignorowanych wyjatkow
//Brak dlugosci timeouta
//Wszystkie ignoracje dla wyjatkow musimy dodac taka informacje do waita
public class FluentWaitTest {
    WebDriver driver;

    @Test
    public void jakImplicityWait() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver);                          //tworzymy waita
        wait.ignoring(NoSuchElementException.class)                                     //ignorowanie wyjatku musi byc dodane
            .withTimeout(Duration.ofSeconds(10))                                        //timeout jak dla ExplicityWaita
            .pollingEvery(Duration.ofSeconds(1));                                       //mozemy okreslic po jakim czasie bedzie sprawdzamy warunek

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))); //okreslany na jaki warunek bedzie dany wait oczekiwal
        driver.close();
    }

    // FluentWait domyslnie nie ignoruje wyjatek NoSuchElementException, trzeba mu go wskazac
    @Test
    public void test6() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.close();
    }

    // FluentWait domyslnie nie ignoruje wyjatek NoSuchElementException, trzeba mu go wskazac
    // nie okreslilismy timeout dla FluenWaita i wywala wyjatek TimeoutException
    @Test
    public void test7() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.close();
    }

    // FluentWait domyslnie nie ignoruje wyjatek NoSuchElementException, trzeba mu go wskazac
    // Dodanie wyjatku TimeoutException.class do ignorowanych nie pomoglo
    @Test
    public void test8() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class, TimeoutException.class);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.close();
    }

    // FluentWait domyslnie nie ignoruje wyjatek NoSuchElementException, trzeba mu go wskazac
    // wait.ignoring(NoSuchElementException.class); - trzeba zadeklarowac wyjatki, ktore beda ignorowane
    // wait.withTimeout(Duration.ofSeconds(10)); - trzeba zadeklarowac timeout
    // tak zadeklarowany FluentWait dziala jak explicityWait w test5 i implicitlyWait w tescie 4
    // nie dosc, ze dzialamy punktowo to jeszcze bardzo konkretnie
    @Test
    public void test9() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.close();
    }

    // Specjalnie zepsuty test - sprawdzenie jak Selenium infomuje nas o przyczynie nie powodzenia
    // Caused by: org.openqa.selenium.NoSuchElementException: - prawdziwa przyczyna naszego niepowodzenia
    @Test
    public void test10() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("pa")));
        driver.close();
    }

    // wait.pollingEvery(Duration.ofSeconds(1)); - dodanie warunku co jaki czas strona bedzie odpytywana
    // FluentWait pozwala na wlasne okreslenie ignorowanych wyjatkow
    // FluentWait pozwala na dodanie wlasnego warunku co jaki czas strona bedzie odpytywana
    // wait.withTimeout(Duration.ofSeconds(10)); - to jest dostepne w explicityWait(webDriverWait) i w implicitlyWait(webDriver)
    @Test
    public void test11() {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.withTimeout(Duration.ofSeconds(10));
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.close();
    }
}
