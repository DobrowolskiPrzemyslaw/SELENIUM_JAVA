package methods;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebDriverWithMethods {
    WebDriver driver = DriverManager.getWebDriver();
    WebDriverWait waitDriver = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);

    private WebElement waitUnilVisibe(By locator){
        return waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitUntilClickable(By locator){
        return waitDriver.until(ExpectedConditions.elementToBeClickable(locator));
    }

    private WebElement waitUnilPresented(By locator){
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

    public void clear(By locator){
        waitUnilVisibe(locator).clear();
    }

    public void moveTo(By locator){
        waitUnilPresented(locator);
        WebElement target = driver.findElement(locator);
        actions.moveToElement(target).perform();
    }

    public void offSetFromElement(By locator){
        waitUnilPresented(locator);
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element, 8, 0).perform();
    }

//    Selenium 4.2
//    public void write(By locator){
//        waitUnilPresented(locator);
//        WebElement inputArea = driver.findElement(locator);
//        actions.setActivePointer(PointerInput.Kind.PEN, "default pen")
//                .moveToElement(inputArea)
//                .clickAndHold()
//                .moveByOffset(2, 2)
//                .release()
//                .perform();
//    }
}
