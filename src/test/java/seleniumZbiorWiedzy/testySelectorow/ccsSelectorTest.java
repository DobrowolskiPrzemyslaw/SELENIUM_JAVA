package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ccsSelectorTest {

//    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
//    http://cssify.appspot.com/ //TODO z xpath na CCS


//      TODO Lepsze jest wyszukanie po id driver.findElement(By.id("clickOnMe"));
//    @Test
//    public void id_(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector("#clickOnMe"));
//    }
//
//    TODO Dobre jesli akurat zestawienie tag i id jest unikatowe
//    @Test
//    public void tag_id(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector("button#clickOnMe"));
//    }
//
//      TODO Lepsze jest wyszukanie po className driver.findElement(By.className("clickOnMe"));
//    @Test
//    public void class_(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector(".topSecret"));
//        driver.findElement(By.cssSelector("[class='topSecret']"));
//    }
//
//    TODO Dobre jesli akurat zestawienie tag i class jest unikatowe
//    @Test
//    public void tag_class(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector("p.topSecret"));          // element z tagiem o nazwie p  i klasa o nazwie topSecret
//        driver.findElement(By.cssSelector("p[class='topSecret']")); // element z tagiem o nazwie p  i klasa o nazwie topSecret
//    }
//
//      TODO Lepsze jest wyszukanie po tagName driver.findElement(By.tagName("input"));
//    @Test
//    public void tag_(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector("input"));
//    }
//
//    @Test
//    public void name_(){
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.cssSelector("[name='fname']"));
//        driver.findElement(By.cssSelector("[name='fname'],[name='fname']")); // OR
//        driver.findElement(By.cssSelector("[name='fname'][name='fname']"));  // AND
//    }

    @Test
    public void zwracanieWszystkichElementow(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("*"));                            // zwroci pierwszy element ze wszystkich elemnetow
        driver.findElement(By.cssSelector("input.klasName[name='fname']")); // tag/klasName/atrybut
        driver.close();
    }

    @Test
    public void atrybutPosiadaCiagZnakow(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("[name='fname']"));  // zwraca tylko elementy posiadajace name = 'fname'
        driver.findElement(By.cssSelector("input[name='fname']"));  // zwraca tylko inputy posiadajace name = 'fname'
        driver.findElement(By.cssSelector("input[name*='ame']"));   // zwraca tylko inputy posiadajace w name ciag znakow 'ame'
        driver.findElement(By.cssSelector("input[name^='fna']"));   // zwraca tylko inputy, dla których atrybut name rozpoczynajace sie od ciag znakow 'fna'
        driver.findElement(By.cssSelector("input[name$='me']"));    // zwraca tylko inputy, dla których atrybut name konczy sie na ciag znakow 'me'
        driver.close();
    }

    @Test
    public void dzieci_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("div ul"));               // działa jak xpath //div//ul
        driver.findElement(By.cssSelector("tbody > tr"));           // działa jak xpath //tbody/tr
        driver.findElement(By.cssSelector("li:first-child"));       // zwraca pierwsze dziecko tagu li
        driver.findElement(By.cssSelector("li:last-child"));        // zwraca ostatnie dziecko tagu li
        driver.findElement(By.cssSelector("li:nth-child(2)"));      // zwraca ente dziecko tagu li
        driver.close();
    }

    @Test
    public void sasiedzi_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("table,tr"));             // TODO NIE WIEM JAK TO DZIALA
        driver.findElement(By.cssSelector("label + form"));         // pierwsze sasiad tagu lable o tabu form
        driver.findElements(By.cssSelector("label ~ form"));        // zwraca wszystkich sasiadow lablu lable o tagu form (ZWRACA LISTE)
        driver.close();
    }

//        id
//        driver.findElement(By.cssSelector("tag-name#valueofID"));
//        driver.findElement(By.cssSelector("#valueofID"));
//        className
//        driver.findElement(By.cssSelector("tag-name.className"));
//        driver.findElement(By.cssSelector(".className"));


//        TODO attribute-value
//        driver.findElement(By.cssSelector("tag-name[attribute-name='attribute-value']"));
//        driver.findElement(By.cssSelector("[attribute-name='attribute-value']"));
//        driver.findElement(By.cssSelector("tag-name[attribute-name^='fixed-prefix-of-value']"));                      // TODO start
//        driver.findElement(By.cssSelector("tag-name[attribute-name$=’fixed-suffix’]"));                               // TODO end
//        driver.findElement(By.cssSelector("tag-name[attribute-name*=’fixed-substring-of-the-value’]"));               // TODO contains (bez spacji)
//        driver.findElement(By.cssSelector("tag-name[attribute-name~=’a white space separated value’]"));              // TODO contains (ze spacjami)
//        driver.findElement(By.cssSelector("tag-name[Attribute=’value’ i]"));                                          // TODO ignorowanie wielkosci znakow
//        driver.findElement(By.cssSelector("[Attribute=’VALUE’ I]"));                                                  // TODO ignorowanie wielkosci znakow
//        driver.findElement(By.cssSelector("css-of-context-node:not([attribute2='value2'])"));                         // TODO nieZawiera


//        TODO ids
//        driver.findElement(By.cssSelector("tag-name#valueofID#valueofID2…#valueofIDN"));
//        driver.findElement(By.cssSelector("#valueofID#valueofID2…#valueofIDN"));
//        TODO classNames
//        driver.findElement(By.cssSelector("tag-name.className1.className2….classNameN"));
//        driver.findElement(By.cssSelector(".className1.className2….classNameN"));
//        TODO attribute-values
//        driver.findElement(By.cssSelector("tag-name[a-name1='a-value1'][a-name2='a-value2'] ..[a-nameN='a-valueN']"));
//        driver.findElement(By.cssSelector("[a-name1='a-value1'][a-name2='a-value2'] ..[a-nameN='a-valueN']"));
//        TODO id i className
//        driver.findElement(By.cssSelector("tag-name.className[attribute-name='attribute-value']"));
//        driver.findElement(By.cssSelector(".className[attribute-name='attribute-value']"));


//        TODO first child
//        driver.findElement(By.cssSelector("CSS-of-Parent>Element"));
//        driver.findElement(By.cssSelector("CSS-of-Parent>*"));
//        TODO last child
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>tag-name"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element tag-name"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>*"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element *"));
//        TODO Nth child
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>tag-name:nth-of-type(N)"));                   // form input:nth-of-type(1)
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>*:nth-of-type(N)"));                          // form input:nth-of-type(3)


//        TODO first-child sibling/sasiedzi - pierwszy element listy
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>Element:first-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element Element:first-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element>Element:first-child"));


//        TODO first-last sibling/sasiedzi - ostatni element listy
//        driver.findElement(By.cssSelector("CSS-of-Context-Element<space>Element:last-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element Element:last-child"));
//        driver.findElement(By.cssSelector("CSS-of-Context-Element>Element:last-child"));


//        TODO n sibling/sasiedzi - N-ty element listy
//        driver.findElement(By.cssSelector("CSS-of-the-Siblings:nth-child(n)"));
//        driver.findElement(By.cssSelector("CSS-of-the-Siblings:nth-last-child(n)"));                                  // liczac od ostatniego


//        TODO kolejny element po tagu
//        driver.findElement(By.cssSelector("CSS-of-context-element + tag-name"));                                      // TODO dziecko
//        driver.findElement(By.cssSelector("CSS-of-context-element ~ tag-name"));                                      // TODO sasiad


//    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
//    http://cssify.appspot.com/ //TODO z xpath na CCS

}
