package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    public static WebDriver createWebDriverInstance(WebBrowser browserName){
        WebDriver driver;
        WebDriverWait waitDriver;
        if(browserName == WebBrowser.CHROME){
            driver = new ChromeDriver(OptionManager.getChromeOptions());
        }else{
            driver = new FirefoxDriver(OptionManager.getFireFoxOptions());
        }
        return driver;
    }
}

