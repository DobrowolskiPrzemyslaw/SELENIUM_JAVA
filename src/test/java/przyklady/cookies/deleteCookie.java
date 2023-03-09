package przyklady.cookies;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class deleteCookie extends BaseTest {
    static WebDriver driver;

    @Test
    public void deleteCookie(){
        driver = DriverManager.getWebDriver();
        try {
            driver.get("http://www.example.com");
            driver.manage().addCookie(new Cookie("test1", "cookie1"));
            Cookie cookie1 = new Cookie("test2", "cookie2");
            driver.manage().addCookie(cookie1);
            // delete a cookie with name 'test1'
            driver.manage().deleteCookieNamed("test1");
            /*
             Selenium Java bindings also provides a way to delete
             cookie by passing cookie object of current browsing context
             */
            driver.manage().deleteCookie(cookie1);
        } finally {
            driver.quit();
        }
    }

    @Test
    public void deleteAllCookie(){
        driver = DriverManager.getWebDriver();
        try {
            driver.get("http://www.example.com");
            driver.manage().addCookie(new Cookie("test1", "cookie1"));
            driver.manage().addCookie(new Cookie("test2", "cookie2"));

            // deletes all cookies
            driver.manage().deleteAllCookies();
        } finally {
            driver.quit();
        }
    }
}
