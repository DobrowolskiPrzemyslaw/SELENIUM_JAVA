//import base.BaseTest;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import static pages.Homepage.*;
//import static pages.SingUpPage.*;
//
//public class SingUp_emailAlreadyExists extends BaseTest {
//
//    @Test
//    public void sortNameOfHotels(){
//        driver.get("http://www.kurs-selenium.pl/demo/");
//
//        myCountButton.clickOnElement();
//        singUpButton.clickOnElement();
//        firstName.sendText("Adam");
//        lastName.sendText("Nowak");
//        mobileNumber.sendText("884 555 666");
//        email.sendText("wp@wp.pl");
//        password.sendText("asdadaffafaq2345ty5t54t34tf");
//        confirmPassword.sendText("asdadaffafaq2345ty5t54t34tf");
//        confirmButton.clickOnElement();
//
//        Assert.assertEquals(textAlert.getText(), " Email Already Exists. ");
//    }
//}
