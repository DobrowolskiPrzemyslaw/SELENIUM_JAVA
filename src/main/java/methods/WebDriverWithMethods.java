package methods;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebDriverWithMethods {
    WebDriver driver = DriverManager.getWebDriver();
    WebDriverWait waitDriver = new WebDriverWait(driver, Duration.ofSeconds(10));

    public WebDriverWithMethods() {
    }

    protected WebElement waitUnilVisibe(By locator){
        return waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitUntilClickable(By locator){
        return waitDriver.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitUnilPresented(By locator){
        return waitDriver.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void sendText(By locator, String text){
        waitUnilVisibe(locator).clear();
        waitUnilVisibe(locator).sendKeys(text);
    }

    public void click(By locator){
        waitUnilVisibe(locator).click();
    }

    public boolean isVisble(By locator){
        return waitUnilVisibe(locator).isDisplayed();
    }

    public String getText(By locator){
        return waitUnilVisibe(locator).getText();
    }



}
