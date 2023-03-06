package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class WyborZListy {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByIndex(0);
        cars.selectByValue("saab");
        cars.selectByVisibleText("Audi");

        // Poniższy kod pozwoli na wypisanie wyszystkich tekstow znajdujacych się w selectcie - wmiare odporyn na zmiany w kodze
        List<WebElement> optionsList = cars.getOptions();
        for(WebElement option: optionsList){
            System.out.println(option.getText());
        }
    }
}
