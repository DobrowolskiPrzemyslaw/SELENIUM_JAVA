package seleniumB2B.baseTests;

import seleniumB2B.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestZXml {

    @BeforeMethod
    @Parameters({"browserName", "env"})               // tych parametrów może być więcej, zostaną przekazane do metody zgodnie zkolejnością wpisania // podajemy nazwy parametrów z .xml
    public void setUp(String browser, String url) {   // podajem nazwy parametrów jakie będzie obsługiwał kod javy
//        DriverManager.createInstance(browser);        // odwołanie do klasy DriverManager, wywołanie statycznej metody .createInstance(browser)
        DriverManager.createInstance("chrome");     // odwołanie do klasy DriverManager, wywołanie statycznej metody .createInstance przyjmującej parametr ("chrome") - dodajemy nazwę przeglądarki
        WebDriver driver = DriverManager.getDriver(); // przypisz pobranego drivera do zmiennej
        driver.manage().window().maximize();          // zwiększ okno przeglądarki do maksymalnego
        driver.get(url);                              // otwórz stronę url jako parametr z pliku .xml "env" = "url" = https://simpletheme.myshopify.com/
    }

    @AfterMethod
    public void tearDown() {

        // Thread.sleep musi miec obsluzony wyjatek
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        DriverManager.getDriver().quit(); // Odwołanie do klasy DriverManger, pobranie z niej drivera, zamknięcie przegladarki
    }
}
