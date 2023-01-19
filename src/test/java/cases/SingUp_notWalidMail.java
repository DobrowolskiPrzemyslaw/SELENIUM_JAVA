package cases;

import base.BaseTest;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;

public class SingUp_notWalidMail extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        firstName.sendText("Adam");
        lastName.sendText("Nowak");
        mobileNumber.sendText("884 555 666");
        String characters = "~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random( 10, characters);
        email.sendText(pwd+"@wp.pl");
        password.sendText(pwd);
        confirmPassword.sendText(pwd);
        confirmButton.click();

        Assert.assertEquals(textAlert2.getText(), "The Email field must contain a valid email address.");
    }
}
