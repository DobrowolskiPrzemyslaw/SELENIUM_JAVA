package selenium.shadowDOM;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

import java.util.concurrent.TimeUnit;

public class ShadowDOM extends BaseTest {

//    https://www.youtube.com/watch?v=bpzyjNZ0jaw
//    https://titusfortner.com/2021/11/22/shadow-dom-selenium.html
    WebDriver driver;

    @Test
    public void shadowDom(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");

        WebElement shadowHost = driver.findElement(By.tagName("book-app"));                              // Szukamy webelementu
        SearchContext shadowRoot = shadowHost.getShadowRoot();                                           // Wyciagamy z niego szukany kontent
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("app-header"));                 // Szukamy elementu juz w wyciagnietym kontencie
        WebElement apptoolbar = shadowContent.findElement(By.cssSelector("app-toolbar.toolbar-bottom")); // Szukamy kolejnych elementow zagniezdzonych w webelementach
        WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));      // Szukamy kolejnych elementow zagniezdzonych w webelementach
        WebElement lastElement = bookinputdecorator.findElement(By.cssSelector("input#input"));          // Szukamy kolejnych elementow zagniezdzonych w webelementach
        lastElement.sendKeys("Testing");                                                      // Wykonanie akcji na webelemencie
    }

    // z uzyciem JavascriptExecutor
    @Test
    public void shadowDom2(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");

        WebElement shadowHost =  driver.findElement(By.tagName("book-app"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement shadowContent  = shadowRoot.findElement(By.cssSelector("app-header"));
        WebElement apptoolbar = shadowContent.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
        WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));
        bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
    }

    //Selenium 4.1+
    @Test
    public void recommendedCode() {
        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
    }
}