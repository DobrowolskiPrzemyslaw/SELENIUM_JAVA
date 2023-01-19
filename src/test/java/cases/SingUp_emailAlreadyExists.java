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
        firstName.sendText("Adam");
        lastName.sendText("Nowak");
        mobileNumber.sendText("884 555 666");
        email.sendText("wp@wp.pl");
        password.sendText("asdadaffafaq2345ty5t54t34tf");
        confirmPassword.sendText("asdadaffafaq2345ty5t54t34tf");
        confirmButton.click();

        Assert.assertEquals(EMAIL_ALREADY_EXIST_TEXT.getText(), " Email Already Exists. ");
    }
}
