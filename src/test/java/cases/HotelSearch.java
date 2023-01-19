package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import static pages.Controls.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");

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
