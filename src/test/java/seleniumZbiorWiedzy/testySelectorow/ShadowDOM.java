package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShadowDOM {

//    https://www.youtube.com/watch?v=bpzyjNZ0jaw
//    https://titusfortner.com/2021/11/22/shadow-dom-selenium.html

    @Test
    public void shadowDom(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        WebElement shadowHost = driver.findElement(By.tagName("book-app"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("app-header"));

        WebElement apptoolbar = shadowContent.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
        WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));

        bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
//        driver.close();
    }

    @Test
    public void shadowDom2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        WebElement shadowHost =  driver.findElement(By.tagName("book-app"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement shadowContent  = shadowRoot.findElement(By.cssSelector("app-header"));

        WebElement apptoolbar = shadowContent.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
        WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));

        bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
//        driver.close();
    }

    //Selenium 4.1+
    @Test
    public void recommendedCode() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
    }
}
