package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createWebDriverInstance(String browserName){
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver(OptionManager.getChromeOptions());
        }
        else if(browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver(OptionManager.getFireFoxOptions());
        }
        return driver;
    }
}

