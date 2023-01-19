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

        LABEL_ON_INPUT.click();
        SEARCH_HOTEL_INPUT.sendText("Dubai");
        LINK_TO_HOTELS.click();
        CHECH_IN_INPUT.sendText("19/01/2023");
        CHECH_OUT_INPUT.sendText("19/01/2023");
        CHECK_PEOPLE_LABEL.click();
        ADULT_INPUT.sendText("1");
        CHILD_INPUT.sendText("3");
        SEARCH_BUTTON.click();

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
