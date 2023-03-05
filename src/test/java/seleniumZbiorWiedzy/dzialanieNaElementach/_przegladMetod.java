package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class _przegladMetod {

    // http://pragmatictestlabs.com/2018/06/28/selenium-webdriver-commands/

    @Test
    public void otwarcieKonkretenjeStrony(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");

        String BASE_URL= "http://demosite.pragmatictestlabs.com";
        driver.navigate().to(BASE_URL);

        driver.close();
    }

    @Test
    public void zamknieciePrzegladarki(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.close();   // zamyka pojedyncze okno, na ktory aktualnie pracuje
        driver.quit();    // zamyka wszystkie otwarte okna
    }

    @Test
    public void odswiezeniePrzegladarki(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.navigate().refresh();

        driver.get(driver.getCurrentUrl());

        driver.findElement(By.id("txtUsername")).sendKeys(Keys.F5);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F5);
        driver.close();
    }

    @Test
    public void screenShot() throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));
        driver.close();
    }
}
