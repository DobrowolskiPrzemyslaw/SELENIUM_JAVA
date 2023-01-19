
import elements.InputTextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        InputTextBox searchInputHotel = new InputTextBox(By.xpath("//span[text()='Search by Hotel or City Name']"));
        searchInputHotel.sendText("Dubai");

        final By searchedHotel = By.xpath("//div[text()=', United Arab Emirates']");

    }
}
