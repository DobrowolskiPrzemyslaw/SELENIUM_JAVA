package pages;

import elements.*;
import org.openqa.selenium.By;

public class Controls {
    //HOMEPAGE
    public static InputTextBox searchInputHotel = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
    public static InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
    public static InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
    public static InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@id='travellersInput']"));
    public static InputTextBox adultInput = new InputTextBox(By.xpath("//input[@id='adultInput']"));
    public static InputTextBox childInput = new InputTextBox(By.xpath("//input[@id='childInput']"));
    public static Label labelOnInput = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));
    public static Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));
    public static Button searchButton = new Button(By.xpath("//button[text()=' Search']"));
    public static Button MY_COUNT_BUTTON = new Button(By.xpath("(//li[@id='li_myaccount'])[2]"));
    public static Button SING_UP_BUTTON = new Button(By.xpath("(//a[text()='  Sign Up'])[last()]"));
    public static Text NAME_OF_HOTEL = new Text(By.xpath("//b[text()='Jumeirah Beach Hotel']"));
    public static Text notResultsText = new Text(By.xpath("//div[@class='itemscontainer']//h2"));

    //SING UP PAGE
    public static InputTextBox firstName = new InputTextBox(By.xpath("//input[@placeholder='First Name']"));
    public static InputTextBox lastName = new InputTextBox(By.xpath("//input[@placeholder='Last Name']"));
    public static InputTextBox mobileNumber = new InputTextBox(By.xpath("//input[@placeholder='Mobile Number']"));
    public static InputTextBox email = new InputTextBox(By.xpath("//input[@placeholder='Email']"));
    public static InputTextBox password = new InputTextBox(By.xpath("//input[@placeholder='Password']"));
    public static InputTextBox confirmPassword = new InputTextBox(By.xpath("//input[@placeholder='Confirm Password']"));
    public static InputTextBox confirmButton = new InputTextBox(By.xpath("//button[text()]//i"));
    public static Text text = new Text(By.xpath("//h4//strong[text()]"));
    public static Text EMAIL_ALREADY_EXIST_TEXT = new Text(By.xpath("//div[@class='resultsignup']"));
    public static Text textAlert2 = new Text(By.xpath("//div//p[text()]"));
}
