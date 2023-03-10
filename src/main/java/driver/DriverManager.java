package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    public static WebDriver getWebDriver(){
        return webDriver.get();
    }

    public static void createInstance(WebBrowser browserName) {
        setWebDriver(DriverFactory.createWebDriverInstance(browserName));
    }
}