package framework.selenium.elements;

import framework.selenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseElements {
    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    By locator;

    protected BaseElements(By locator) {
        this.locator = locator;
    }

    protected WebElement waitUnilVisibeBase(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitUntilClickableBase(){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitUnilPresentedBase(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void sendTextBase(String text){
        waitUnilVisibeBase().clear();
        waitUnilVisibeBase().sendKeys(text);
    }

    protected void sendTextBase2(String text){
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

    protected void selectByIndexBase (int index){
        getSelectBase().selectByIndex(index);
    }

    protected void selectByValueBase (String value){
        getSelectBase().selectByValue(value);
    }

    protected boolean isSelectedBase (){
        return waitUnilVisibeBase().isSelected();
    }

    protected  void switchToFrameBase(){
        driver.switchTo().frame(waitUnilPresentedBase());
    }

    public void switchToDefaultBase(){
        driver.switchTo().defaultContent();
    }
}
