
import elements.InputTextBox;
import elements.Link;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        InputTextBox searchInputHotel = new InputTextBox(By.xpath("//span[text()='Search by Hotel or City Name']"));
        Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));

        searchInputHotel.sendText("Dubai");
//        lintToHotels.clickOnLink();
    }
}
