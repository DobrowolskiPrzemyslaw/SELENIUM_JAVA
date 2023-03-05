package seleniumZbiorWiedzy.kolekcje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortowanieList {
    WebDriver driver;

    // sortowanie a-z - rosnaco
    @Test
    public void test(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        List<String> sortedList = cars.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    // sortowanie z do a - malejaco
    @Test
    public void test2(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        List<String> sortedList = cars.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    @Test
    public void sortowanieListy() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }

    @Test
    public void sortowanieListy2() {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }

    @Test
    public void sortowanieListy3() {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers, Collections.reverseOrder());  // Sort myNumbers od najwiekszej

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }

    @Test
    public void test5(){
        // Pierwsze zadanie
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dlanauczyciela.pl");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dln-toolbar__unlogged > a:nth-child(1)"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-form-login-email"))).sendKeys("StudentNE@wp.pl");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-form-login-password"))).sendKeys("NowaEra2019");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-form-login-submit"))).click();

        String paraText = driver.findElement(By.xpath("//span[@class='ne-toolbar-menu-item__link']//div[contains(.,'Moje konto')]/..")).getText();
        Assert.assertEquals(paraText, "Moje konto");

        // Drugie zadanie
        driver.get("https://moja.nowaera.pl/panel/serwisy");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='service__description--title'])[1]")));
        List<WebElement> listaNazwSerwisow = driver.findElements(By.xpath("//div[@class='service__description--title']"));
        ArrayList<String> slist = new ArrayList<String>();
        for (int i=1;i<=listaNazwSerwisow.size();i++) {
            String nazwa = driver.findElement(By.xpath("(//div[@class='service__description--title'])["+i+"]")).getText();
            slist.add(nazwa);
        }

        List<String> sortedList = slist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        driver.close();
    }
}
