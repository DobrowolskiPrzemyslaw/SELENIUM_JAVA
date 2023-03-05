package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PobieranieTytuluIAdresuStrony {

    @Test
    public void howerTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
