package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import static pages.Controls.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        labelOnInput.click();
        searchInputHotel.sendText("Dubai");
        lintToHotels.click();
        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.click();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.click();

        Assert.assertEquals(NAME_OF_HOTEL.isVisble(), true);
        Assert.assertEquals(NAME_OF_HOTEL.getText(), "Jumeirah Beach Hotel");
    }
}
