package elements;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseElements {
    WebDriver driver = DriverManager.getDriver();
    WebDriverWait waitDriver = new WebDriverWait(driver, Duration.ofSeconds(10));
    By locator;

    protected BaseElements(By locator) {
        this.locator = locator;
    }

    protected WebElement waitUnilVisibeBase(){
        return waitDriver.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitUntilClickableBase(){
        return waitDriver.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitUnilPresentedBase(){
        return waitDriver.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void sendTextBase(String text){
        waitUnilVisibeBase().clear();
        waitUnilVisibeBase().sendKeys(text);
    }

    protected void clickOnElementBase(){
        waitUnilVisibeBase().click();
    }

    protected Select getSelectBase(){
        return new Select(waitUnilPresentedBase());
    }

    protected void selectByVisibleTextBase (String visibleText){
        getSelectBase().selectByVisibleText(visibleText);
    }

    protected boolean isSelectedBase (){
        return waitUnilVisibeBase().isSelected();
    }

    protected  void switchToFrameBase(){
        driver.switchTo().frame(waitUnilPresentedBase());
    }

    protected void switchToDefaultBase(){
        driver.switchTo().defaultContent();
    }
}
