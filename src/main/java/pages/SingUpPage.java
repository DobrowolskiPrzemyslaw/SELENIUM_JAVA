package pages;

import org.openqa.selenium.By;

public class SingUpPage {
    public static By FIRST_NAME_INPUT = By.xpath("//input[@placeholder='First Name']" );
    public static By LAST_NAME_INPUT = By.xpath("//input[@placeholder='Last Name']" );
    public static By MOBLIE_NUMBER_INPUT =  By.xpath("//input[@placeholder='Mobile Number']" );
    public static By EMAIL_INPUT =  By.xpath("//input[@placeholder='Email']" );
    public static By PASSWORD_INPUT =  By.xpath("//input[@placeholder='Password']" );
    public static By CONFIRM_PASSWORD_INPUT=  By.xpath("//input[@placeholder='Confirm Password']" );
    public static By CONFIRM_BUTTON =  By.xpath("//button[text()]//i" );
    public static By ALERT_TEXT = By.xpath("//h4//strong[text()]" );
    public static By EMAIL_ALREADY_EXIST_TEXT = By.xpath("//div[@class='resultsignup']" );
    public static By ALERT_TEXT_2 = By.xpath("//div//p[text()]");
}
