package seleniumZbiorWiedzy.waity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class PageTimeout {
    WebDriver driver;

    // oczekiwanie na wczytanie całej strony tez wydaję się bez sensu bo może niepotrzebnie wydłużać test
    @Test
    public void oczekiwanieNaWczytanieCalejStrony(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
    }
}
