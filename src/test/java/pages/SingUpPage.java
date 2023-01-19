package pages;

import elements.*;
import org.openqa.selenium.By;

public class SingUpPage {
    public static InputTextBox firstName = new InputTextBox(By.xpath("//input[@placeholder='First Name']"));
    public static InputTextBox lastName = new InputTextBox(By.xpath("//input[@placeholder='Last Name']"));
    public static InputTextBox mobileNumber = new InputTextBox(By.xpath("//input[@placeholder='Mobile Number']"));
    public static InputTextBox email = new InputTextBox(By.xpath("//input[@placeholder='Email']"));
    public static InputTextBox password = new InputTextBox(By.xpath("//input[@placeholder='Password']"));
    public static InputTextBox confirmPassword = new InputTextBox(By.xpath("//input[@placeholder='Confirm Password']"));
    public static InputTextBox confirmButton = new InputTextBox(By.xpath("//button[text()]//i"));

    public static Text text = new Text(By.xpath("//h4//strong[text()]"));
    public static Text textAlert = new Text(By.xpath("//div[@class='resultsignup']"));
    public static Text textAlert2 = new Text(By.xpath("//div//p[text()]"));
}
