import base.BaseTest;
import org.apache.commons.lang.RandomStringUtils;
import static pages.SingUpPage.*;
import static pages.Homepage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUp extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        myCountButton.clickOnElement();
        singUpButton.clickOnElement();
        firstName.sendText("Adam");
        lastName.sendText("Nowak");
        mobileNumber.sendText("884 555 666");
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pwd = RandomStringUtils.random( 10, characters);
        email.sendText(pwd+"@wp.pl");
        password.sendText(pwd);
        confirmPassword.sendText(pwd);
        confirmButton.clickOnElement();

        Assert.assertEquals(text.getText(), "Nothing Booked Yet");
    }
}
