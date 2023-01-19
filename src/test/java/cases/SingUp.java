package cases;

import base.BaseTest;
import org.apache.commons.lang.RandomStringUtils;
import static pages.Controls.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUp extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        FIRST_NAME_INPUT.sendText("Adam");
        LAST_NAME_INPUT.sendText("Nowak");
        MOBLIE_NUMBER_INPUT.sendText("884 555 666");
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pwd = RandomStringUtils.random( 10, characters);
        EMAIL_INPUT.sendText(pwd+"@wp.pl");
        PASSWORD_INPUT.sendText(pwd);
        CONFIRM_PASSWORD_INPUT.sendText(pwd);
        CONFIRM_BUTTON.click();

        Assert.assertEquals(TEXT_ALERT.getText(), "Nothing Booked Yet");
    }
}
