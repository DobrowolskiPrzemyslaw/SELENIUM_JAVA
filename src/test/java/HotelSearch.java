
import elements.Button;
import elements.InputTextBox;
import elements.Label;
import elements.Link;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Label labelOnInput = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));
        InputTextBox searchInputHotel = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
        InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
        InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
        InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@class='form form-control input-lg collapsed']"));
        Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));
        Button searchButton = new Button(By.xpath("//button[text()=' Search']"));

        labelOnInput.clickOnElement();
        searchInputHotel.sendText("Dubai");
        lintToHotels.clickOnLink();
        searchButton.clickOnElement();
        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.c
    }
}
