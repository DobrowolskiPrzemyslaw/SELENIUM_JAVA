package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PoWartosciAtrybutu {
    //    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
    //    http://cssify.appspot.com/
    WebDriver driver;

    @Test
    public void atrybutPosiadaCiagZnakow(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("[name='fname']"));             // zwraca tylko elementy posiadajace name = 'fname'
        driver.findElement(By.cssSelector("input[name='fname']"));        // zwraca tylko inputy POSIADAJACE name = 'fname'
        driver.findElement(By.cssSelector("input[name*='ame']"));         // zwraca tylko inputy POSIADAJACE w name ciag znakow 'ame'
        driver.findElement(By.cssSelector("input[name^='fna']"));         // zwraca tylko inputy, dla których atrybut name ROZPOCZYNAJA sie od ciag znakow 'fna'
        driver.findElement(By.cssSelector("input[name$='me']"));          // zwraca tylko inputy, dla których atrybut name KONICZA sie na ciag znakow 'me'
//        driver.findElement(By.cssSelector("tag-name[attribute-name~=’a white space separated value’]"));              // TODO contains (ze spacjami)
//        driver.findElement(By.cssSelector("tag-name[Attribute=’value’ i]"));                                          // TODO ignorowanie wielkosci znakow
//        driver.findElement(By.cssSelector("[Attribute=’VALUE’ I]"));                                                  // TODO ignorowanie wielkosci znakow
//        driver.findElement(By.cssSelector("css-of-context-node:not([attribute2='value2'])"));                         // TODO nieZawiera
//        driver.findElement(By.cssSelector("tag-name[a-name1='a-value1'][a-name2='a-value2'] ..[a-nameN='a-valueN']"));
//        driver.findElement(By.cssSelector("[a-name1='a-value1'][a-name2='a-value2'] ..[a-nameN='a-valueN']"));
    }
}
