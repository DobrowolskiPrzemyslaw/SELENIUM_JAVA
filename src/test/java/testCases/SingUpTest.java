package testCases;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Homepage.*;
import static pages.SingUpPage.*;

public class SingUpTest extends BaseTest {

    @Test
    public void singUp_withoutData(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        webDriverWithMethods.click(MY_COUNT_BUTTON);
        webDriverWithMethods.click(SING_UP_BUTTON);
        webDriverWithMethods.click(CONFIRM_BUTTON);

        Assert.assertEquals(webDriverWithMethods.isVisble(ALERT_TEXT_2), true);
    }

    @Test
    public void singUp_validMailAddress(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        webDriverWithMethods.click(MY_COUNT_BUTTON);
        webDriverWithMethods.click(SING_UP_BUTTON);
        webDriverWithMethods.sendText(FIRST_NAME_INPUT, "Adam");
        webDriverWithMethods.sendText(LAST_NAME_INPUT, "Nowak");
        webDriverWithMethods.sendText(MOBLIE_NUMBER_INPUT, "884 555 666");
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pwd = RandomStringUtils.random( 10, characters);
        webDriverWithMethods.sendText(EMAIL_INPUT,pwd+"@wp.pl");
        webDriverWithMethods.sendText(PASSWORD_INPUT,pwd);
        webDriverWithMethods.sendText(CONFIRM_PASSWORD_INPUT,pwd);
        webDriverWithMethods.click(CONFIRM_BUTTON);

        Assert.assertEquals(webDriverWithMethods.getText(ALERT_TEXT), "Nothing Booked Yet");
    }

    @Test
    public void singUp_invalidMailAddress(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        webDriverWithMethods.click(MY_COUNT_BUTTON);
        webDriverWithMethods.click(SING_UP_BUTTON);
        webDriverWithMethods.sendText(FIRST_NAME_INPUT, "Adam");
        webDriverWithMethods.sendText(LAST_NAME_INPUT, "Nowak");
        webDriverWithMethods.sendText(MOBLIE_NUMBER_INPUT, "884 555 666");
        webDriverWithMethods.sendText(EMAIL_INPUT, "wp@wp.pl");
        webDriverWithMethods.sendText(PASSWORD_INPUT, "asdadaffafaq2345ty5t54t34tf");
        webDriverWithMethods.sendText(CONFIRM_PASSWORD_INPUT, "asdadaffafaq2345ty5t54t34tf");
        webDriverWithMethods.click(CONFIRM_BUTTON);

        Assert.assertEquals(webDriverWithMethods.getText(EMAIL_ALREADY_EXIST_TEXT), "Email Already Exists.");
    }

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        webDriverWithMethods.click(MY_COUNT_BUTTON);
        webDriverWithMethods.click(SING_UP_BUTTON);
        webDriverWithMethods.sendText(FIRST_NAME_INPUT, "Adam");
        webDriverWithMethods.sendText(LAST_NAME_INPUT, "Nowak");
        webDriverWithMethods.sendText(MOBLIE_NUMBER_INPUT, "884 555 666");
        String characters = "~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random( 10, characters);
        webDriverWithMethods.sendText(EMAIL_INPUT,pwd+"@wp.pl");
        webDriverWithMethods.sendText(PASSWORD_INPUT,pwd);
        webDriverWithMethods.sendText(CONFIRM_PASSWORD_INPUT,pwd);
        webDriverWithMethods.click(CONFIRM_BUTTON);

        Assert.assertEquals(webDriverWithMethods.getText(ALERT_TEXT_2), "The Email field must contain a valid email address.");
    }
}
