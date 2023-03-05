package seleniumB2B.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager { // tworzymy publiczną (dostępną wszędzie) klase DriverManger

    // private - odwołać się do obiektu o nazwie webDriver można tylko w tej klasie DriverManger
    // static - istnieje zawsze, do życia nie potrzebuje obiektów
    // final - zabezpiecza przed możliwością zmiany/nadpisania wartości
    // ThreadLocal<WebDriver> - wątek lokalny zwracający obietky klasy <WebDriver>
    // new ThreadLocal<>() // <> - brak obiektu, () -brak parametru
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    // metoda służąca do pobierania drivera
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // static - istnieje zawsze, do życia nie potrzebuje obiektów (możemy się do niej odwałać również poprzez nazwę klasy w której jest zimplementowana)
    // webDriver - nazwa obiektu
    public static WebDriver getDriver(){
        return webDriver.get();
    }


    // metoda służąca do wysyłania drivera
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // static - istnieje zawsze, do życia nie potrzebuje obiektów (możemy się do niej odwałać również poprzez nazwę klasy w której jest zimplementowana)
    // webDriver - nazwa obiektu
    // (driver) - nazwa parametru dla obiektu
    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }


    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // static - istnieje zawsze, do życia nie potrzebuje obiektów (możemy się do niej odwałać również poprzez nazwę klasy w której jest zimplementowana)
    // void - oznacza, że metoda nic nie zwraca (zamiast tego mogłoby być string, int, boolean - wówczas w ciele metody musiałoby pojawić się słowo return (i nazwa zmiennej danego typu))
    public static void createInstance(String browserName) {
        setWebDriver(DriverFactory.createWebDriverInstance(browserName)); // metoda ustawia nowego WebDriver
    }
}

/*
public class DriverFactory {

    public static WebDriver createWebDriverInstance(String browserName){
        WebDriver driver = null; // początkowe ustawienie obiektu WebDriver o nazwie driver na null (pozwala to zablokować test do czasu podanie odpowieniego parametru browserName)

        if(browserName.equalsIgnoreCase("Chrome")){
            if (System.getProperty("webdriver.chrome.driver") == null) {
                String chromePath = "C:\\_Selenium\\2020.11.06_Projekt_B2B\\src\\main\\resources\\drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePath );
                driver = new ChromeDriver();
            }
        }
        else if(browserName.equalsIgnoreCase("Opera")){
            if (System.getProperty("webdriver.opera.driver") == null) {
                String operaPath = "C:\\_Selenium\\2020.11.06_Projekt_B2B\\src\\main\\resources\\drivers\\operadriver.exe";
                System.setProperty("webdriver.opera.driver", operaPath);
                driver = new OperaDriver();
            }
        }
        else if(browserName.equalsIgnoreCase("Firefox")){
            if (System.getProperty("webdriver.gecko.driver") == null) {
                String firefoxPath = "C:\\_Selenium\\2020.11.06_Projekt_B2B\\src\\main\\resources\\drivers\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                driver = new FirefoxDriver();
            }
        }
        return driver; // metoda createWebDriverInstance zwraca WebDriver driver w zależności od podanego parametru browserName
    }
}

*/