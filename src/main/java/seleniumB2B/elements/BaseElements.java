package seleniumB2B.elements;

import seleniumB2B.driver.DriverManager;
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

    // Metody wyszukujące i zwracające WebElementy (ale juz po wykonaniu zakładanej operacji na danym elemencie)

    protected WebElement waitUnilVisibeBase(){ // czeka, aż element będzie widoczny
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitUntilClickableBase(){ // czeka, aż element będzie klikalny
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitUnilPresentedBase(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Metody do wpisywania
    protected void sendTextBase(String text){
        waitUnilVisibeBase().clear(); // Wyczyść domyślnie wpisany tekst (jeśli taki będzie wpisany)
        waitUnilVisibeBase().sendKeys(text); // Wpisz podany (text)
    }

    // Metody do wpisywania
    protected void sendTextBase2(String text){
        waitUnilVisibeBase().sendKeys(text); // Wpisz podany (text)
    }

    // Metoda do klikania na danym element
    protected void clickOnElementBase(){
        waitUnilVisibeBase().click(); // Kliknij na dany element
    }

    // Metoda która będzie zwracala selekta
    protected Select getSelectBase(){
        return new Select(waitUnilPresentedBase());
    }

    // Metoda do wybierania przez widzalny tekst
    protected void selectByVisibleTextBase (String visibleText){
        getSelectBase().selectByVisibleText(visibleText); // pobieramy danego selekta a nastepnie wybieram dany tekst (ze strony)
    }

    // Metoda do wybierania przez widzalny tekst
    protected void selectByIndexBase (int index){
        getSelectBase().selectByIndex(index); // pobieramy danego selekta a nastepnie wybieram dany index (ze strony)
    }

    // Metoda do wybierania przez widzalny tekst
    protected void selectByValueBase (String value){
        getSelectBase().selectByValue(value); // pobieramy danego selekta a nastepnie wybieram dane value (ze strony)
    }

    // Metoda sprawdzająca czy dany element jest zaznaczony (checkbox)
    protected boolean isSelectedBase (){
        return waitUnilVisibeBase().isSelected();
    }

    // Metoda przełacza do nowej ramki
    protected  void switchToFrameBase(){
        driver.switchTo().frame(waitUnilPresentedBase()); // Przełącz na ramke o indexie 0
    }

    // Metoda przełacza do domyślej ramki
    // Żeby można było wywołać taką metodę z po odwołaniu do klasy (BaseElements), metoda ta musi być statyczna
    // Driver też w takim razie musi być statyczny, a więc dostępny po odwołaniu do klasy (BaseElements)
    public void switchToDefaultBase(){ // zeby metoda dziala Webdriver rowniez musi być statyczny - skasowaliśmy static podaczas odpalania testów z .xml
        driver.switchTo().defaultContent();
    }
}
