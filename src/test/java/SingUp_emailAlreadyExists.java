import elements.Button;
import elements.InputTextBox;
import elements.Text;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUp_emailAlreadyExists extends BaseTest {

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
        Text textAlert = new Text(By.xpath("//div[@class='resultsignup']"));

        myCountButton.clickOnElement();
        singUpButton.clickOnElement();
        firstName.sendText("Adam");
        lastName.sendText("Nowak");
        mobileNumber.sendText("884 555 666");
        email.sendText("wp@wp.pl");
        password.sendText("asdadaffafaq2345ty5t54t34tf");
        confirmPassword.sendText("asdadaffafaq2345ty5t54t34tf");
        confirmButton.clickOnElement();

        Assert.assertEquals(textAlert.getText(), " Email Already Exists. ");
    }
}
