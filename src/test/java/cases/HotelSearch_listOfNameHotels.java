package cases;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.stream.Collectors;
import static pages.Controls.*;

public class HotelSearch_listOfNameHotels extends BaseTest {

    @Test
    public void sortNameOfHotels(){
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

        List list = driver.findElements(By.xpath("//h4[@class='RTL go-text-right mt0 mb4 list_title']"))
                          .stream()
                          .map(el -> el.getAttribute("textContent"))
                          .collect(Collectors.toList());

        Assert.assertEquals(NAME_OF_HOTEL.isVisble(), true);
        Assert.assertEquals(list.get(0), "Jumeirah Beach Hotel");
        Assert.assertEquals(list.get(1), "Oasis Beach Tower");
        Assert.assertEquals(list.get(2), "Rose Rayhaan Rotana");
        Assert.assertEquals(list.get(3), "Hyatt Regency Perth");
    }
}
