package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.baseTests.BaseTest;

public class PoWartosciAtrybutu extends BaseTest {
    WebDriver driver;

    @Test
    public void wartosc_atrybutu(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));                                               // zwraca wszystkie buttony, ktorych id jest rowne clickOnMe
        driver.findElement(By.xpath("//button[@id!='clickOnMe']"));                                              // zwraca wszystkie buttony, ktorych id nie jest rowne clickOnMe
        driver.findElement(By.xpath("//*[@id!='clickOnMe']"));                                                   // zwraca wszystkie elementy, ktorych id nie jest rowne clickOnMe
        driver.findElement(By.xpath("//*[contains(@name,'ame')]"));                                              // zwraca wszystkie elementy, ktorych name zawiera ciagn znakow ame
        driver.findElement(By.xpath("//button[contains(@*,'button')]"));                                         // zwraca wszystkie elementy, ktorych dowolny atrybut zawiera ciagn znakow button
        driver.findElement(By.xpath("//option[contains(text(),'Volvo')]"));                                      // zwraca wszystkie elementy, ktorych text zawiera ciagn znakow Volvo
        driver.findElement(By.xpath("//select[contains(.,'Volvo')]"));                                           // zwraca wszystkie elementy, ktorych text zawiera ciagn znakow Volvo lub zagniezdzony elemnet zawiera tekst Volvo
        driver.findElement(By.xpath("//*[starts-with(@name,'fna')]"));                                           // zwraca wszystkie elementy, ktorych name zaczyna sie ciagn znakow fna
        driver.findElement(By.xpath("//*[not(starts-with(@name,'fnas'))]"));                                     // zwraca wszystkie elementy, ktorych name nie zaczyna sie ciagm znakow fnas
        driver.findElement(By.xpath("//*[substring(@name,string-length(@name)-string-length('ame')+1)='ame']")); // to samo co //*[ends-with(@name,'ame" dla starszej wersji xpatha
    }

    @Test
    public void or(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input | //div"));                            // zwraca wszystkie inputy lub divy
        driver.findElement(By.xpath("//input | //div//a"));                         // zwraca wszystkie inputy lub divy z linkiem/tagie a
        driver.findElement(By.xpath("//input[@name='fname' or @id='fname']"));      // zwraca wszystkie inputy, ktore posiadaja name lub id rowny fname
    }

    @Test
    public void and(){
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));     // zwraca wszystkie inputy, ktore posiadaja name i id rowny fname
    }
}
