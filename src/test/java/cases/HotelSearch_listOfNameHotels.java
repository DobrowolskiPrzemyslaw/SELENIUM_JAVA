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

        labelOnInput.click();
        searchInputHotel.sendText("Dubai");
        lintToHotels.click();
        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.click();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.click();

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
