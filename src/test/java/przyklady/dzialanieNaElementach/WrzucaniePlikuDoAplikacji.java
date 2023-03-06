package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WrzucaniePlikuDoAplikacji {

    @Test
    public void upload(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\przem\\OneDrive\\Dokumenty\\newFile.txt");
    }
}
