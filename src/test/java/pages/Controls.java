package pages;

import elements.*;
import org.openqa.selenium.By;

public class Controls {
    //HOMEPAGE
    public static InputTextBox SEARCH_HOTEL_INPUT = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
    public static InputTextBox CHECH_IN_INPUT = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
    public static InputTextBox CHECH_OUT_INPUT = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
    public static InputTextBox ADULT_INPUT = new InputTextBox(By.xpath("//input[@id='adultInput']"));
    public static InputTextBox CHILD_INPUT = new InputTextBox(By.xpath("//input[@id='childInput']"));
    public static Label LABEL_ON_INPUT = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));
    public static Label CHECK_PEOPLE_LABEL = new Label(By.xpath("//input[@id='travellersInput']"));
    public static Link LINK_TO_HOTELS = new Link(By.xpath("//div[text()=', United Arab Emirates']"));
    public static Button SEARCH_BUTTON = new Button(By.xpath("//button[text()=' Search']"));
    public static Button MY_COUNT_BUTTON = new Button(By.xpath("(//li[@id='li_myaccount'])[2]"));
    public static Button SING_UP_BUTTON = new Button(By.xpath("(//a[text()='  Sign Up'])[last()]"));
    public static Text NAME_OF_HOTEL = new Text(By.xpath("//b[text()='Jumeirah Beach Hotel']"));
    public static Text NOT_RESULT_TEXT = new Text(By.xpath("//div[@class='itemscontainer']//h2"));

    //SING UP PAGE
    public static InputTextBox FIRST_NAME_INPUT = new InputTextBox(By.xpath("//input[@placeholder='First Name']"));
    public static InputTextBox LAST_NAME_INPUT = new InputTextBox(By.xpath("//input[@placeholder='Last Name']"));
    public static InputTextBox MOBLIE_NUMBER_INPUT = new InputTextBox(By.xpath("//input[@placeholder='Mobile Number']"));
    public static InputTextBox EMAIL_INPUT = new InputTextBox(By.xpath("//input[@placeholder='Email']"));
    public static InputTextBox PASSWORD_INPUT = new InputTextBox(By.xpath("//input[@placeholder='Password']"));
    public static InputTextBox CONFIRM_PASSWORD_INPUT= new InputTextBox(By.xpath("//input[@placeholder='Confirm Password']"));
    public static InputTextBox CONFIRM_BUTTON = new InputTextBox(By.xpath("//button[text()]//i"));
    public static Text TEXT_ALERT = new Text(By.xpath("//h4//strong[text()]"));
    public static Text EMAIL_ALREADY_EXIST_TEXT = new Text(By.xpath("//div[@class='resultsignup']"));
    public static Text TEXT_ALERT_2 = new Text(By.xpath("//div//p[text()]"));
}
