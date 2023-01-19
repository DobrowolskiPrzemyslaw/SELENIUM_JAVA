package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;

public class SingUp_emailAlreadyExists extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        FIRST_NAME_INPUT.sendText("Adam");
        LAST_NAME_INPUT.sendText("Nowak");
        MOBLIE_NUMBER_INPUT.sendText("884 555 666");
        EMAIL_INPUT.sendText("wp@wp.pl");
        PASSWORD_INPUT.sendText("asdadaffafaq2345ty5t54t34tf");
        CONFIRM_PASSWORD_INPUT.sendText("asdadaffafaq2345ty5t54t34tf");
        CONFIRM_BUTTON.click();

        Assert.assertEquals(EMAIL_ALREADY_EXIST_TEXT.getText(), " Email Already Exists. ");
    }
}
