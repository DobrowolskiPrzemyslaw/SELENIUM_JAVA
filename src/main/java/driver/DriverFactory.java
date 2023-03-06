package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createWebDriverInstance(WebBrowser browserName){
        WebDriver driver = null;
        if(browserName == WebBrowser.CHROME){
            driver = new ChromeDriver(OptionManager.getChromeOptions());
        }else if(browserName == WebBrowser.FIREFOX){
            driver = new FirefoxDriver(OptionManager.getFireFoxOptions());
        }
        return driver;
    }
}

