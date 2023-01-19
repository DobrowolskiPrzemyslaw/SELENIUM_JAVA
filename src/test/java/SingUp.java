import elements.*;
import helper.SeleniumHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class SingUp extends BaseTest {

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
        Text text = new Text(By.xpath("//h4//strong[text()]"));

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

        Assert.assertEquals(text.getText(), "Nothing Booked Yet ");
    }
}
