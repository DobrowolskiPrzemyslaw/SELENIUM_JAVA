package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Ids_Classes_Names_Tags_Links {
    //    http://pragmatictestlabs.com/2021/01/05/mastering-css-for-selenium-test-automation-2/
    //    http://cssify.appspot.com/
    WebDriver driver;

    @Test
    public void id(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("#clickOnMe"));         //#id
        driver.findElement(By.cssSelector("tag-name#valueofID")); //tag#id
//        driver.findElement(By.cssSelector("tag-name#valueofID#valueofID2…#valueofIDN"));
//        driver.findElement(By.cssSelector("#valueofID#valueofID2…#valueofIDN"));
    }

    @Test
    public void tag_id(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("button#clickOnMe"));
//        TODO kolejny element po tagu
//        driver.findElement(By.cssSelector("CSS-of-context-element + tag-name"));  // TODO dziecko
//        driver.findElement(By.cssSelector("CSS-of-context-element ~ tag-name"));  // TODO sasiad
    }
    @Test
    public void class_(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector(".topSecret"));
        driver.findElement(By.cssSelector("[class='topSecret']"));
//        driver.findElement(By.cssSelector("tag-name.className1.className2….classNameN"));
//        driver.findElement(By.cssSelector(".className1.className2….classNameN"));
    }

    @Test
    public void tag_class(){

        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("p.topSecret"));          // element z tagiem o nazwie p  i klasa o nazwie topSecret
        driver.findElement(By.cssSelector("p[class='topSecret']")); // element z tagiem o nazwie p  i klasa o nazwie topSecret
    }

    @Test
    public void tag(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("input"));
    }

    @Test
    public void name(){
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("[name='fname']"));
        driver.findElement(By.cssSelector("[name='fname'],[name='fname']")); // OR
        driver.findElement(By.cssSelector("[name='fname'][name='fname']"));  // AND
    }
}
