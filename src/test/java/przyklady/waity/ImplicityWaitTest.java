package przyklady.waity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

//implicitlyWait jest spoko jesli element istnieje, ale nie jest widoczny na stronie i tylko musimy poczekac jak sie pojawi na stronie
//ten timeout jest przywiązywany do wszystkich elementow testu, które wyszukujemy!!! - nie zawsze jest to dobre rozwiazanie
//nie sprawdzi się jesli chcemy oczekiwac np. na klikaloność elementu (element jest widoczny, ale nie klikalny)
//nie wydluza testow, ale jest malo elastyczny bo element moze byc caly czas widoczny, ale np. nie klikalny
//Konczy test tak szybko jak pojawi sie nie widoczny element na stronie - to spoko
//Pojedyncze wywolania implicitlyWait odnosi sie do wszystkich elementow na stronie - wystarczy go raz wywolac
//implicitlyWait co jakis czas odpytuje strone w ciagu zadanego przez nas czasu, jesli znajdzie element to idzie dalej
//Niejawne limity czasu powinny być używane, gdy webdriver jest szybszy niż czas ładowania elementów do DOM.
public class ImplicityWaitTest {
    WebDriver driver;

    @Test
    public void implicityTest() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }

    @Test
    public void implicityTest2() {
        String pathDriver = "F:\\PROGRAMOWANIE\\_Selenium\\Selenium\\src\\main\\resources\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }
}
