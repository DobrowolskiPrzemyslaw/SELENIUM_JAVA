
import elements.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Label labelOnInput = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));
        InputTextBox searchInputHotel = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
        InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
        InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
        InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@id='travellersInput']"));
        InputTextBox adultInput = new InputTextBox(By.xpath("//input[@id='adultInput']"));
        InputTextBox childInput = new InputTextBox(By.xpath("//input[@id='childInput']"));
        Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));
        Button searchButton = new Button(By.xpath("//button[text()=' Search']"));
        Text nameOfHotel = new Text(By.xpath("//b[text()='Jumeirah Beach Hotel']"));

        labelOnInput.clickOnElement();
        searchInputHotel.sendText("Dubai");
        lintToHotels.clickOnLink();
        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.clickOnElement();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.clickOnElement();
        nameOfHotel.getText();
        nameOfHotel.isVisble();
        Assert.assertEquals(nameOfHotel.getText(), "Jumeirah Beach Hotel");
        Assert.assertEquals(nameOfHotel.isVisble(), true);
    }
}
