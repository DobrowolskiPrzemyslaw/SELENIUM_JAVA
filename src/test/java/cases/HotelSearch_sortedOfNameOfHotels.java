package cases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Controls.*;
import java.util.List;

public class HotelSearch_sortedOfNameOfHotels extends BaseTest {

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

        List<WebElement> list = driver.findElements(By.xpath("//h4[@class='RTL go-text-right mt0 mb4 list_title']"));
        List<String> sortedList = SeleniumHelper.sortOfList(list);
        sortedList.forEach(System.out::println);

        Assert.assertEquals(NAME_OF_HOTEL.isVisble(), true);
        Assert.assertEquals(sortedList.get(0), "Hyatt Regency Perth");
        Assert.assertEquals(sortedList.get(1), "Jumeirah Beach Hotel");
        Assert.assertEquals(sortedList.get(2), "Oasis Beach Tower");
        Assert.assertEquals(sortedList.get(3), "Rose Rayhaan Rotana");
    }
}
