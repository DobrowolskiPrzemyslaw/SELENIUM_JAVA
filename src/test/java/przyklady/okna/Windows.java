package przyklady.okna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Windows {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void pobranieOkna(){
        driver.getWindowHandle();
    }

    @Test
    public void switchingWindowsOrTabs(){
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(By.linkText("new window")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(titleIs("Selenium documentation"));
    }

    @Test
    public void closeWindowOrTab(){
        //Close the tab or window
        driver.close();
        // or all windows
        driver.quit();

        //Switch back to the old tab or window
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }
}
