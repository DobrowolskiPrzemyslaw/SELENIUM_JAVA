package cases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import static pages.Controls.*;

public class HotelSearch extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        LABEL_ON_INPUT.click();
        SEARCH_HOTEL_INPUT.sendText("Dubai");
        LINK_TO_HOTELS.click();
        CHECH_IN_INPUT.sendText("19/01/2023");
        CHECH_OUT_INPUT.sendText("19/01/2023");
        CHECK_PEOPLE_LABEL.click();
        ADULT_INPUT.sendText("1");
        CHILD_INPUT.sendText("3");
        SEARCH_BUTTON.click();

        Assert.assertEquals(NAME_OF_HOTEL.isVisble(), true);
        Assert.assertEquals(NAME_OF_HOTEL.getText(), "Jumeirah Beach Hotel");
    }
}
