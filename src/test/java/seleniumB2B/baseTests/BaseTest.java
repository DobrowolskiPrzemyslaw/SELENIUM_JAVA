package seleniumB2B.baseTests;

import seleniumB2B.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {   // podajem nazwy parametrów jakie będzie obsługiwał kod javy
        DriverManager.createInstance("chrome");     // odwołanie do klasy DriverManager, wywołanie statycznej metody .createInstance przyjmującej parametr ("chrome") - dodajemy nazwę przeglądarki
        WebDriver driver = DriverManager.getDriver();          // przypisz pobranego drivera do zmiennej
        driver.manage().window().maximize();                   // zwiększ okno przeglądarki do maksymalnego
        driver.get("https://simpletheme.myshopify.com/");      // otwórz stronę url jako parametr z pliku .xml "env" = "url" = https://simpletheme.myshopify.com/
    }

    @AfterMethod
    public void tearDown() {

        // Thread.sleep musi miec obsluzony wyjatek
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        DriverManager.getDriver().quit(); // Odwołanie do klasy DriverManger, pobranie z niej drivera, zamknięcie przegladarki
    }
}
