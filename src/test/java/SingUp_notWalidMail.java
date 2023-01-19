import elements.Button;
import elements.InputTextBox;
import elements.Text;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUp_notWalidMail extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Button myCountButton = new Button(By.xpath("(//li[@id='li_myaccount'])[2]"));
        Button singUpButton = new Button(By.xpath("(//a[text()='  Sign Up'])[last()]"));
        InputTextBox firstName = new InputTextBox(By.xpath("//input[@placeholder='First Name']"));
        InputTextBox lastName = new InputTextBox(By.xpath("//input[@placeholder='Last Name']"));
        InputTextBox mobileNumber = new InputTextBox(By.xpath("//input[@placeholder='Mobile Number']"));
        InputTextBox email = new InputTextBox(By.xpath("//input[@placeholder='Email']"));
        InputTextBox password = new InputTextBox(By.xpath("//input[@placeholder='Password']"));
        InputTextBox confirmPassword = new InputTextBox(By.xpath("//input[@placeholder='Confirm Password']"));
        InputTextBox confirmButton = new InputTextBox(By.xpath("//button[text()]//i"));
        Text textAlert = new Text(By.xpath("//div//p[text()]"));

        myCountButton.clickOnElement();
        singUpButton.clickOnElement();
        firstName.sendText("Adam");
        lastName.sendText("Nowak");
        mobileNumber.sendText("884 555 666");
        String characters = "~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random( 10, characters);
        email.sendText(pwd+"@wp.pl");
        password.sendText(pwd);
        confirmPassword.sendText(pwd);
        confirmButton.clickOnElement();

        Assert.assertEquals(textAlert.getText(), " The Email field must contain a valid email address. ");
    }
}
