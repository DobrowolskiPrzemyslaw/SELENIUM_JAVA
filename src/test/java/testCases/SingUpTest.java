package testCases;

import base.BaseTest;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;

public class SingUpTest extends BaseTest {

    @Test
    public void singUp_withoutData(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        CONFIRM_BUTTON.click();

        Assert.assertEquals(TEXT_ALERT_2.isVisble(), true);
    }

    @Test
    public void singUp_validMailAddress(){
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

    @Test
    public void singUp_invalidMailAddress(){
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

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        FIRST_NAME_INPUT.sendText("Adam");
        LAST_NAME_INPUT.sendText("Nowak");
        MOBLIE_NUMBER_INPUT.sendText("884 555 666");
        String characters = "~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random( 10, characters);
        EMAIL_INPUT.sendText(pwd+"@wp.pl");
        PASSWORD_INPUT.sendText(pwd);
        CONFIRM_PASSWORD_INPUT.sendText(pwd);
        CONFIRM_BUTTON.click();

        Assert.assertEquals(TEXT_ALERT_2.getText(), "The Email field must contain a valid email address.");
    }
}
