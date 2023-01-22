package testCases;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;

import java.util.List;
import java.util.stream.Collectors;

import static pages.Homepage.*;

public class HotelSearch_StreamTest extends BaseTest {

    @Test
    public void withoutSortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Homepage.setCity("Dubai");
        Homepage.setData("19/01/2023","19/01/2023");
        Homepage.setAdults("1");
        Homepage.setChildren("3");
        Homepage.clickSearchCityButton();
        List list = Homepage.getListOfHotelName(driver);

        Assert.assertEquals(Homepage.isVisible(NAME_OF_HOTEL), true);
        Assert.assertEquals(list.get(0), "Jumeirah Beach Hotel");
        Assert.assertEquals(list.get(1), "Oasis Beach Tower");
        Assert.assertEquals(list.get(2), "Rose Rayhaan Rotana");
        Assert.assertEquals(list.get(3), "Hyatt Regency Perth");
    }
}
