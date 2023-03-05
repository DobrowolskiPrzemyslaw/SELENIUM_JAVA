package seleniumUdemy.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class DriverFactory {

    // metoda pozwoli wywoływać wybraną przeglądarke zapomocą wpisanego parametru
    // public - pozwoli skorzystanie z metody po odwołaniu się do obiektu klasy WebDriver
    // static - pozwala na wywołanie metody po odwołaniu się do klasy (DriverFactory), nie jest potrzebny obiekt danej klasy
    // WebDriver - typ zwracanego obiektu
    // createWebDriverInstance - nazwa metody
    // (String browserName) - (typParametru nazwaParametru) - w tym przpadku przesyłamy nazwe przeglądarki
    public static WebDriver createWebDriverInstance(String browserName){
        // WebDriver - typ zwracanego obiektu
        // driver - nazwa obiektu
        // null - żadna przeglądarka nie będzie przypisana do obiektu driver
        WebDriver driver = null;

        // .equalsIgnoreCase("Chrome") sprawdza String bez wielkości znaków
        // (browserName.equalsIgnoreCase("chrome") - porównuje przekazaną nazwę parametru z ("chrome") nie zwracając uwagi na znaki
        // (System.getProperty("webdriver.chrome.driver") == null)) - sprawdzamy czy do "webdriver.chrome.driver" jest przypisana ścieżka do driver
        if(browserName.equalsIgnoreCase("Chrome")){
            // File iDriver = new File("ścieżka pliku") - stworzenie nowego pliku o nazwie iDriver
            // ("ścieżka pliku") - musi odpowiadać lokalizacji naszego drivera
            // (System.getProperty("user.dir") - popiera ścieżke do katalogu głównego projektu (stabilność projektu po skopiowaniu, odpaleniu na innym komputerze)
            // "//src//test//resources//drivers//chromedriver.exe" - pozastała część, która nie ulegnie zmianie po skopiowaniu
            if(System.getProperty("webdriver.chrome.driver") == null) { // sprawdzamy czy ścieżka do "webdriver.chrome.driver" jest ustawiona, jeśli jest null - to nie jest, wówaczas ją ustawiamy
                // System.getProperty("user.dir") + "\src\main\resources\drivers\chromedriver.exe" - zamiast tego można pobrać path absolutny dla danego drivera, ale taki kod jest lepszy gdyż jest odporny na ewentualną zmiane miejsca pliku źródłowego
                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//chromedriver.exe"); // tworzymy nowy plik o nazwie iDriver // (System.getProperty("user.dir") - popiera ścieżke do katalogu głównego projektu i dodajemy do niej pozostałą ścieżke niezbędą do zlokalizowania pliku
                System.setProperty("webdriver.chrome.driver", iDriver.getAbsolutePath()); // skoro "webdriver.chrome.driver") == null to teraz pora na ustwienie
            }
            // driver = new ChromeDriver(); - taki zapis pozwoli na korzystanie przez obiekt driver ze wszystkich dostępnych metod dla obiektu klasy ChromeDriver()
            // OptionManager.getChromeOption() - odwołanie się do nazwy klasy OptionManager, a następnie wywołąnie STATYCZNEJ metody pozwalającej na blokowanie powiadomień w przeglądarce
            driver = new ChromeDriver(OptionManager.getChromeOptions()); // OptionManager.getChromeOption() - Blokuje wyświetlanie potwierdzeń
        }
        else if(browserName.equalsIgnoreCase("Opera")){
            if(System.getProperty("webdriver.opera.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//operadriver.exe");
                System.setProperty("webdriver.opera.driver", iDriver.getAbsolutePath());
            }
            driver = new OperaDriver(OptionManager.getOperaOptions());
        }
        else if(browserName.equalsIgnoreCase("Firefox")) {
            if(System.getProperty("webdriver.gecko.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", iDriver.getAbsolutePath());
            }
            driver = new FirefoxDriver(OptionManager.getFireFoxOptions());
        }
        else if(browserName.equalsIgnoreCase("ie")) {
            if(System.getProperty("webdriver.ie.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver", iDriver.getAbsolutePath());
            }
            driver = new InternetExplorerDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")) {
            if(System.getProperty("webdriver.edge.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", iDriver.getAbsolutePath());
            }
            driver = new EdgeDriver();
        }
        return driver; // zwrócenie obiektu o nazwie driver typu WebDriver
    }
}

