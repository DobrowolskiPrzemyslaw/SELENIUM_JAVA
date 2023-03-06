package framework.selenium.base.driver;

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
//        else if(browserName.equalsIgnoreCase("Opera")){
//            if(System.getProperty("webdriver.opera.driver") == null) {
//                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//operadriver.exe");
//                System.setProperty("webdriver.opera.driver", iDriver.getAbsolutePath());
//            }
//            driver = new OperaDriver(OptionManager.getOperaOptions());
//        }
//        else if(browserName.equalsIgnoreCase("Firefox")) {
//            if(System.getProperty("webdriver.gecko.driver") == null) {
//                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//geckodriver.exe");
//                System.setProperty("webdriver.gecko.driver", iDriver.getAbsolutePath());
//            }
//            driver = new FirefoxDriver(OptionManager.getFireFoxOptions());
//        }
//        else if(browserName.equalsIgnoreCase("ie")) {
//            if(System.getProperty("webdriver.ie.driver") == null) {
//                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//IEDriverServer.exe");
//                System.setProperty("webdriver.ie.driver", iDriver.getAbsolutePath());
//            }
//            driver = new InternetExplorerDriver();
//        }
//        else if(browserName.equalsIgnoreCase("edge")) {
//            if(System.getProperty("webdriver.edge.driver") == null) {
//                File iDriver = new File(System.getProperty("user.dir") + "//src//main//resources//webdrivers//msedgedriver.exe");
//                System.setProperty("webdriver.edge.driver", iDriver.getAbsolutePath());
//            }
//            driver = new EdgeDriver();
//        }
        return driver;
    }
}

