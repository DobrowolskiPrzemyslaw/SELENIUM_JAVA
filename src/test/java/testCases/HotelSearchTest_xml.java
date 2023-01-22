package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import methods.WebDriverWithMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static pages.Homepage.*;

public class HotelSearchTest_xml extends BaseTest {
    WebDriverWithMethods webDriverWithMethods = new WebDriverWithMethods();

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        webDriverWithMethods.click(LABEL_ON_INPUT);
        webDriverWithMethods.sendText(SEARCH_HOTEL_INPUT, "Dubai");
        webDriverWithMethods.click(LINK_TO_HOTELS);
        webDriverWithMethods.sendText(CHECH_IN_INPUT, "19/01/2023");
        webDriverWithMethods.sendText(CHECH_OUT_INPUT, "19/01/2023");
        webDriverWithMethods.click(CHECK_PEOPLE_LABEL);
        webDriverWithMethods.sendText(ADULT_INPUT, "1");
        webDriverWithMethods.sendText(CHILD_INPUT, "3");
        webDriverWithMethods.click(SEARCH_BUTTON);
        webDriverWithMethods.isVisble(NAME_OF_HOTEL);

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");
    }

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        webDriverWithMethods.click(LABEL_ON_INPUT);
        webDriverWithMethods.sendText(SEARCH_HOTEL_INPUT, "Dubai");
        webDriverWithMethods.click(LINK_TO_HOTELS);
        webDriverWithMethods.sendText(CHECH_IN_INPUT, "19/01/2023");
        webDriverWithMethods.sendText(CHECH_OUT_INPUT, "19/01/2023");
        webDriverWithMethods.click(CHECK_PEOPLE_LABEL);
        webDriverWithMethods.sendText(ADULT_INPUT, "1");
        webDriverWithMethods.sendText(CHILD_INPUT, "3");
        webDriverWithMethods.click(SEARCH_BUTTON);

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
        webDriverWithMethods.click(LABEL_ON_INPUT);
        webDriverWithMethods.sendText(SEARCH_HOTEL_INPUT, "Dubai");
        webDriverWithMethods.click(LINK_TO_HOTELS);
        webDriverWithMethods.sendText(CHECH_IN_INPUT, "19/01/2023");
        webDriverWithMethods.sendText(CHECH_OUT_INPUT, "19/01/2023");
        webDriverWithMethods.click(CHECK_PEOPLE_LABEL);
        webDriverWithMethods.sendText(ADULT_INPUT, "1");
        webDriverWithMethods.sendText(CHILD_INPUT, "3");
        webDriverWithMethods.click(SEARCH_BUTTON);

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

        webDriverWithMethods.sendText(CHECH_IN_INPUT, "19/01/2023");
        webDriverWithMethods.sendText(CHECH_OUT_INPUT, "19/01/2023");
        webDriverWithMethods.click(CHECK_PEOPLE_LABEL);
        webDriverWithMethods.sendText(ADULT_INPUT, "1");
        webDriverWithMethods.sendText(CHILD_INPUT, "3");
        webDriverWithMethods.click(SEARCH_BUTTON);
        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");
    }
}
