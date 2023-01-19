package pages;

import elements.*;
import org.openqa.selenium.By;

public class Homepage {
    public static InputTextBox searchInputHotel = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
    public static InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
    public static InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
    public static InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@id='travellersInput']"));
    public static InputTextBox adultInput = new InputTextBox(By.xpath("//input[@id='adultInput']"));
    public static InputTextBox childInput = new InputTextBox(By.xpath("//input[@id='childInput']"));

    public static Label labelOnInput = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));

    public static Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));

    public static Button searchButton = new Button(By.xpath("//button[text()=' Search']"));
    public static Button myCountButton = new Button(By.xpath("(//li[@id='li_myaccount'])[2]"));
    public static Button singUpButton = new Button(By.xpath("(//a[text()='  Sign Up'])[last()]"));

    public static Text nameOfHotel = new Text(By.xpath("//b[text()='Jumeirah Beach Hotel']"));
    public static Text notResultsText = new Text(By.xpath("//div[@class='itemscontainer']//h2"));
}
