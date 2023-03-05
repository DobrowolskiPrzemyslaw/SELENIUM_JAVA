package seleniumB2B.helper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class SeleniumHelper {

    // Deklaracja obiektów - dzięki temu będzie mozna się do nich odwoływać w każdej z poniższych metodach i konstruktorach
    private WebDriver driver;

    // Konstruktor klasy SeleniumHelper
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // SeleniumHelper - nazwa konstruktora
    // (WebDriver driver) - (typParametru nazwaParametru)
    public SeleniumHelper(WebDriver driver){
        this.driver = driver; // dzięki temu wszystie metody wywołane na obiektach tej klasy będą korzystały z aktualnie ustawionego drivera
    }


    // metoda służąca do poczekania na pojawienie się danego elementu - skraca czas testu (metoda gdy korzystamy z lokarotów)
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // void - info tym, że metoda nic nie zwraca (zamiast tego mogłobybyć void, String, int, boolean lub np. Webdriver - klasa zwracanego obiektu itd.)
    // waitForElementToBeDisplayed - nazwa metody
    // (By locator) - (typParametru nazwaParametru)
    public void waitForElementToBeDisplayed(By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(driver); // stworzenie obiektu klasy FluentWait

        // konfiguracja metody
        wait.withTimeout(Duration.ofSeconds(15L)) // określenie ile czasu test będzie czakał na pojedyńczą akcje
                .pollingEvery(Duration.ofMillis(1000)) // sprawdzanie stany naszego elementu co 1 sekunde
                .ignoring(NoSuchElementException.class); // określenie jaki wyjątek będziemy ignorować
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



    // metoda służąca do poczekania na pojawienie się danego elementu - skraca czas testu (metoda gdy korzystamy z WebElementów)
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // void - info tym, że metoda nic nie zwraca (zamiast tego mogłobybyć void, String, int, boolean lub np. Webdriver - klasa zwracanego obiektu itd.)
    // waitForElementToBeDisplayed - nazwa metody
    // (WebElement element) - (typParametru nazwaParametru)
    public void waitForElementToBeDisplayed(WebElement element){
        FluentWait<WebDriver> wait = new FluentWait<>(driver); // stworzenie obiektu klasy FluentWait

        // konfiguracja metody
        wait.withTimeout(Duration.ofSeconds(15L)) // określenie ile czasu test będzie czakał na pojedyńczą akcje
                .pollingEvery(Duration.ofMillis(1000)) // sprawdzanie stany naszego elementu co 1 sekunde
                .ignoring(NoSuchElementException.class); // określenie jaki wyjątek będziemy ignorować
        wait.until(ExpectedConditions.visibilityOf(element));
    }



    // metoda służąca do poczekania na pojawienie się danego elementu - skraca czas testu
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // void - info tym, że metoda nic nie zwraca (zamiast tego mogłobybyć void, String, int, boolean lub np. Webdriver - klasa zwracanego obiektu itd.)
    // waitForListOfWebElements - nazwa metody
    // (List<WebElement> elementList) - (typParametru nazwaParametru)
    public void waitForListOfWebElements (List<WebElement> elementList){
        FluentWait<WebDriver> wait = new FluentWait<>(driver); // stworzenie obiektu klasy FluentWait

        // konfiguracja metody
        wait.withTimeout(Duration.ofSeconds(15L)) // określenie ile czasu test będzie czakał na pojedyńczą akcje
                .pollingEvery(Duration.ofMillis(1000)) // sprawdzanie stany naszego elementu co 1 sekunde
                .ignoring(NoSuchElementException.class); // określenie jaki wyjątek będziemy ignorować
        wait.until(driver1 -> elementList.size()>0); // wprowadzenie warunku
    }



    // metoda służąca do robienia screenshotów
    // public - metoda dostępna publicznie (można się do niej odwołać z każdego miejsca)
    // static - pozwala na wywołanie metody po odwołaniu się do klasy (SeleniumHelper), nie jest potrzebny obiekt danej klasy
    // String - info tym co zwaraca metoda, String - obiekt klasy String (zamiast tego mogłobybyć void, String, int, boolean itd.)
    // takeScreenShot - nazwa metody
    // (WebDriver driver) - (typParametru nazwaParametru)
    // throws IOException - informacja o obsłudze wyjątku
    public static String takeScreenShot(WebDriver driver) throws IOException {
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver; // Tworzym obiekt klasy TakesScreenshot i przypisujemy go do naszego drivera, dzięki temu obiekt takeScreenShot będzie mógł korzystać z metod obiektu driver
        // Tworzymy nowy screenshot
        // takeScreenShot - odwołanie do obiektu (korzystającego z metod drivera) i wywołąnie metody .getScreenshotAs(OutputType.FILE); pobierającej obraz ekranu
        File screenshotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src//test//resources//screens//name " + LocalTime.now().getNano() + ".png"); // tworzenie pliku do, którego przypiszemy screenshota
        Files.copy(screenshotFile.toPath(), destinationFile.toPath()); // przypisanie screenshota do stworzonego pliku
        return destinationFile.getAbsolutePath(); // zwrócenie ścieżki do pliku pod którym jest zapisany screenshot
    }

    public void czekaj(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
