package pages;

import org.openqa.selenium.By;

public class Controls {
    //HOMEPAGE
    public static By SEARCH_HOTEL_INPUT = By.xpath("//div[@id='select2-drop']//input");
    public static By CHECH_IN_INPUT = By.xpath("//input[@class='form input-lg dpd1']");
    public static By CHECH_OUT_INPUT = By.xpath("//input[@class='form input-lg dpd2']");
    public static By ADULT_INPUT = By.xpath("//input[@id='adultInput']");
    public static By CHILD_INPUT = By.xpath("//input[@id='childInput']");
    public static By LABEL_ON_INPUT = By.xpath("//span[text()='Search by Hotel or City Name']");
    public static By LABEL_ON_INPUT3 = By.xpath("//span[text()='Search by Hotel or City Name']");
    public static By CHECK_PEOPLE_LABEL = By.xpath("//input[@id='travellersInput']");
    public static By LINK_TO_HOTELS = By.xpath("//div[text()=', United Arab Emirates']");
    public static By EXRANET_LOGIN_BUTTON = By.xpath("//a[text()='Extranet Login']");
    public static By SEARCH_BUTTON = By.xpath("//button[text()=' Search']");
    public static By MY_COUNT_BUTTON = By.xpath("(//li[@id='li_myaccount'])[2]");
    public static By SING_UP_BUTTON = By.xpath("(//a[text()='  Sign Up'])[last()]");
    public static By NAME_OF_HOTEL = By.xpath("//b[text()='Jumeirah Beach Hotel']");
    public static By NOT_RESULT_TEXT = By.xpath("//div[@class='itemscontainer']//h2");

    //SING UP PAGE
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
