package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverFactory {
    public static WebDriver createWebDriverInstance(String browserName){
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("Chrome")){
            if(System.getProperty("webdriver.chrome.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/webdrivers/chromedriver");
                System.setProperty("webdriver.chrome.driver", iDriver.getAbsolutePath());
            }
            driver = new ChromeDriver(OptionManager.getChromeOptions());
        }
        return driver;
    }
}

