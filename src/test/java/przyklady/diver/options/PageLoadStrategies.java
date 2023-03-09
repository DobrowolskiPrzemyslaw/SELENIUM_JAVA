package przyklady.diver.options;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategies {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL); //Used by default by browser and Selenium WebDriver. Waits for all the resources to be downloaded.
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);   //WebDriver is not blocked at all. Execution continues without any wait as soon as the initial page is loaded.
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);  //Resources like images and CSS might still be loading, but DOM is accessible and ready to interact.
        WebDriver driver = new ChromeDriver(chromeOptions);
        try {
            driver.get("https://google.com");
        } finally {
            driver.quit();
        }
    }
}
