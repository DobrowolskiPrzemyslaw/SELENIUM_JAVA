package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;

public class SingUp_errors extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        myCountButton.clickOnElement();
        singUpButton.clickOnElement();
        confirmButton.clickOnElement();

        Assert.assertEquals(textAlert2.isVisble(), true);
    }
}
