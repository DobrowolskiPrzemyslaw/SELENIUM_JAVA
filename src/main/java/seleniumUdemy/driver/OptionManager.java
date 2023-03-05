package seleniumUdemy.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaOptions;

public class OptionManager {
//    http://pragmatictestlabs.com/2018/01/30/cross-browser-testing-selenium/

    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();                // stwórz nowy obiekt o nazwie options
        options.addArguments("--disable-notifications");            // odwołanie się do obiektu options i wywołanie metody wyłączające widoczność powiadomień
//        options.addArguments("headless");
//        options.addExtensions(new File("/path/to/extension.crx"));// pozwala na dodanie rozszerzenia do przegladarki
//        options.addArguments("start-maximized");
        return options;
    }

    public static OperaOptions getOperaOptions(){
        OperaOptions options = new OperaOptions();
        options.addArguments("--disable-notifications");
        return options;
    }

    public static FirefoxOptions getFireFoxOptions(){
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();                // stwórz nowy obiekt o nazwie profile
        profile.setPreference("dow.webnotifications.enabled", false); // odwołanie się do obiektu profile i zmiana wyłączenie powiadomień dla danego profilu
        options.setCapability(FirefoxDriver.PROFILE, profile);        // odwołanie się do obiektu options i ustawienie zmodyfikowanego profilu na domyślny
        return options;
    }
}
