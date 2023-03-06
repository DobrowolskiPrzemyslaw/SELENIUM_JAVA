package selenium.dedykowaneMetody;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.DriverManager;

public class Id {

//    1. po ID jeśli jest unikatowe i nie jest automatycznie generowane - dedykowane metody
//    2. po NAME jeśli jest unikatowe - dedykowane metody
//    3. po LINKU - dedykowane metody
//    4 . selektory CSS

//    xpathy (kiedy xpath jest niezastąpiony?)
//     - po tekscie
//     - po posiadanym webElemencie o teksie
//     - w css nie mozna odwolac sie do rodzica

    @Test
    public void test(){
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.id("clickOnMe"));               // <input id="clickOnMe"></input>
    }
}