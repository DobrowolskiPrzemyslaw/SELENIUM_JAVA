package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class xpathSelectorTest {

//    http://pragmatictestlabs.com/wp-content/uploads/2018/05/Mastering-XPath-Cover-Image.png

//    @Test
//    public void idXpathTest(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//*[@id='clickOnMe']"));
//    }
//
//    @Test
//    public void classXpathTest(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//*[@class='topSecret']"));
//    }
//
//    @Test
//    public void tagXpathTest(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//input"));
//    }
//
//    @Test
//    public void nameXpathTest(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//*[@name='fname']"));
//    }
//
//    @Test
//    public void linkTest(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
//    }
//
//    @Test
//    public void linkTest2(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));
//    }

    @Test
    public void kolejnosc(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input[1]"));                              // zwraca wszystkie inputy, ktore nie sa zagniezdzone???
        driver.findElement(By.xpath("//input[2]"));                              // zwraca wszystkie inputy, ktore nie sa zagniezdzone???
        driver.findElement(By.xpath("(//input)[1]"));                            // zwraca wszystkie piersze inputy, które znajdują się w danej strukturze - w tym przypadku z calej strony bo nie ma struktury wczesniej
        driver.findElement(By.xpath("(//form//input)[1]"));                      // zwraca wszystkie piersze inputy, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button"));                                // zwraca wszystkie buttony ze strony
        driver.findElement(By.xpath("//button[1]"));                             // zwraca pierwszy button, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button[first()]"));                       // zwraca pierwszy buttony, które znajdują się w danej strukturze
        driver.findElement(By.xpath("//button[last()]"));                        // zwraca ostatnie buttony, które znajdują się w danej strukturze
        driver.findElement(By.xpath("(//button)[last()]"));                      // zwraca ostatni button ze strony
        driver.findElement(By.xpath("(//button)[last()-1]"));                    // zwraca przedostatni button, które znajdują się w danej strukturze
        List<WebElement> listaElementow =driver.findElements(By.xpath("//div[position()!=2]"));  // zwraca wszystkie divy bez 2 w danej strukturze
        driver.findElement(By.xpath("//li[2]"));                                                 // zwraca wszystkie li na 2 pozycji w danej strukturze
        driver.findElement(By.xpath("//li[position()=2]"));                                      // zwraca wszystkie li na 2 pozycji w danej strukturze
        listaElementow = driver.findElements(By.xpath("//li[position()>2]"));                    // zwraca wszystkie li pozniej w strukturze niz 2 pozycja
        listaElementow = driver.findElements(By.xpath("//li[position()<3]"));                    // zwraca wszystkie li wczesniej w strukturze niz 3 pozycja
        listaElementow = driver.findElements(By.xpath("//li[position()>=2]"));                   // zwraca wszystkie li pozniej w strukturze niz 1 pozycja
        listaElementow = driver.findElements(By.xpath("//li[position()<=3]"));                   // zwraca wszystkie li wczesniej w strukturze niz 4 pozycja
    }

    @Test
    public void xpathTest2(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*[@class='topSecret']"));                 // zwraca wszystkie elementy z klasa o nazwie topSecret
        driver.findElement(By.xpath("//html/body/button[@id='clickOnMe']"));     // zwraca wszystkie buttony ze sciezki //html/body/ z atrybutem @id='clickOnMe'
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));               // zwraca wszystkie buttony z atrybutem @id='clickOnMe'
        driver.findElement(By.xpath("//input[@name='fname']"));                  // zwraca wszystkie inputy z atrybutem @name='fname'
        driver.findElement(By.xpath("//p[@class='topSecret']"));                 // zwraca wszystkie paragrafy z klasa o nazwie topSecret
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));      // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));           // zwraca wszystkie linki o posiadajace text()='Visit W3Schools.com!']
    }

    @Test
    public void xpathTest3(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*"));                                     // zwraca wszystkie elementy ze strony
        driver.findElement(By.xpath("//input"));                                 // zwraca wszystkie inputy ze strony
        driver.findElement(By.xpath("//input[@name]"));                          // zwraca wszystkie inputy, które posiadają atrybut name
        driver.findElement(By.xpath("//*[@name]"));                              // zwraca wszystkie elementy, które posiadają atrybut name
    }

    @Test
    public void wartosc_atrybutu(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));                  // zwraca wszystkie buttony, ktorych id jest rowne clickOnMe
        driver.findElement(By.xpath("//button[@id!='clickOnMe']"));                 // zwraca wszystkie buttony, ktorych id nie jest rowne clickOnMe
        driver.findElement(By.xpath("//*[@id!='clickOnMe']"));                      // zwraca wszystkie elementy, ktorych id nie jest rowne clickOnMe
        driver.findElement(By.xpath("//*[contains(@name,'ame')]"));                 // zwraca wszystkie elementy, ktorych name zawiera ciagn znakow ame
        driver.findElement(By.xpath("//button[contains(@*,'button')]"));            // zwraca wszystkie elementy, ktorych dowolny atrybut zawiera ciagn znakow button
        driver.findElement(By.xpath("//option[contains(text(),'Volvo')]"));         // zwraca wszystkie elementy, ktorych text zawiera ciagn znakow Volvo
        driver.findElement(By.xpath("//select[contains(.,'Volvo')]"));              // zwraca wszystkie elementy, ktorych text zawiera ciagn znakow Volvo lub zagniezdzony elemnet zawiera tekst Volvo
        driver.findElement(By.xpath("//*[starts-with(@name,'fna')]"));              // zwraca wszystkie elementy, ktorych name zaczyna sie ciagn znakow fna
        driver.findElement(By.xpath("//*[not(starts-with(@name,'fnas'))]"));        // zwraca wszystkie elementy, ktorych name nie zaczyna sie ciagm znakow fnas
        driver.findElement(By.xpath("//*[substring(@name,string-length(@name)-string-length('ame')+1)='ame']")); // to samo co //*[ends-with(@name,'ame" dla starszej wersji xpatha
    }

    @Test
    public void rodzice(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div/.."));                                  // zwraca bezposredniego rodzica
        driver.findElement(By.xpath("//div/../.."));                               // zwraca bezposredniego rodzica rodzica
        driver.findElement(By.xpath("//div/ancestor::*"));                         // zwraca wszystkie ostatnich rodzicow tagu div
        driver.findElement(By.xpath("//ul/parent::div"));                          // zwraca pierwszego rodzica o tagu konkretnym tagu
        driver.findElement(By.xpath("//div/ancestor::body"));                      // zwraca wszystkie rodzicow o tagu konkretnym tagu
    }

    @Test
    public void dzieci(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div/child::ul"));                           // zwraca pierwsze dziecko
        driver.findElement(By.xpath("//div/ul"));                                  // zwraca pierwsze dziecko
        driver.findElements(By.xpath("//div/descendant::ul"));                      // zwraca wszystkie ostatnie dzieci tagu div o tagu  ul
        driver.findElements(By.xpath("//div/descendant::*"));                       // zwraca wszystkie ostatnie dzieci tagu div
        driver.findElements(By.xpath("//img/following::*"));                        // zwraca wszystkie dzieci/elementy wystepujace po obrazku
        driver.findElements(By.xpath("//img/preceding::*"));                        // zwraca wszystkich dzici/elementy wystepujace przed obrazkiem
    }

    @Test
    public void and_or(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//input | //div"));                           // zwraca wszystkie inputy lub divy
        driver.findElement(By.xpath("//input | //div//a"));                        // zwraca wszystkie inputy lub divy z linkiem/tagie a
        driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));    // zwraca wszystkie inputy, ktore posiadaja name i id rowny fname
        driver.findElement(By.xpath("//input[@name='fname' or @id='fname']"));     // zwraca wszystkie inputy, ktore posiadaja name lub id rowny fname
    }

    @Test
    public void posiada_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//div[./ul]"));                                  // zwraca wszystkie divy posiadające w strukturze tag ul
        driver.findElement(By.xpath("//select[./option[text()='Volvo']]"));           // zwraca wszystkie selecty posiadające w strukturze tag option z tekstem Volvo
        driver.close();
    }
}
