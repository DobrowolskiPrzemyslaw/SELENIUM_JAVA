package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Homepage;

import java.util.List;
import java.util.stream.Collectors;
import static pages.Homepage.*;

public class HotelSearchTest extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Homepage.setCity("Dubai");
        Homepage.setData("19/01/2023","19/01/2023");
        Homepage.setAdults("1");
        Homepage.setChildren("3");
        Homepage.clickSearchCityButton();
        webDriverWithMethods.isVisble(NAME_OF_HOTEL);

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");
    }

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Homepage.setCity("Dubai");
        Homepage.setData("19/01/2023","19/01/2023");
        Homepage.setAdults("1");
        Homepage.setChildren("3");
        Homepage.clickSearchCityButton();

        List<WebElement> list = driver.findElements(By.xpath("//h4[@class='RTL go-text-right mt0 mb4 list_title']"));
        List<String> sortedList = SeleniumHelper.sortOfList(list);
        sortedList.forEach(System.out::println);

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(sortedList.get(0), "Hyatt Regency Perth");
        Assert.assertEquals(sortedList.get(1), "Jumeirah Beach Hotel");
        Assert.assertEquals(sortedList.get(2), "Oasis Beach Tower");
        Assert.assertEquals(sortedList.get(3), "Rose Rayhaan Rotana");
    }

    @Test
    public void withoutSortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Homepage.setCity("Dubai");
        Homepage.setData("19/01/2023","19/01/2023");
        Homepage.setAdults("1");
        Homepage.setChildren("3");
        Homepage.clickSearchCityButton();

        List list = driver.findElements(By.xpath("//h4[@class='RTL go-text-right mt0 mb4 list_title']"))
                .stream()
                .map(el -> el.getAttribute("textContent"))
                .collect(Collectors.toList());

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(list.get(0), "Jumeirah Beach Hotel");
        Assert.assertEquals(list.get(1), "Oasis Beach Tower");
        Assert.assertEquals(list.get(2), "Rose Rayhaan Rotana");
        Assert.assertEquals(list.get(3), "Hyatt Regency Perth");
    }

    @Test
    public void searchHotel_not_found(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Homepage.setData("19/01/2023","19/01/2023");
        Homepage.setAdults("1");
        Homepage.setChildren("3");
        Homepage.clickSearchCityButton();
        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");
    }
}
