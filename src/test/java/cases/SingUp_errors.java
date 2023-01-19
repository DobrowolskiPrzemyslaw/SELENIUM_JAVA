package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;

public class SingUp_errors extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        CONFIRM_BUTTON.click();

        Assert.assertEquals(TEXT_ALERT_2.isVisble(), true);
    }
}
