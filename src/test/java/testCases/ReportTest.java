package testCases;

import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.Homepage.*;

public class ReportTest extends BaseTest {

    @Test
    public void test(){
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
        driver.get("http://www.kurs-selenium.pl/demo/");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
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
        test.log(Status.PASS, "Udalo sie wyszukac hotel");

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");

        test.log(Status.PASS, "Zamkniecie strony z hotelami");
    }

    @Test
    public void test2(){
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
        driver.get("http://www.kurs-selenium.pl/demo/");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
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
        test.log(Status.PASS, "Udalo sie wyszukac hotel");

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");

        test.log(Status.PASS, "Zamkniecie strony z hotelami");
    }

    @Test
    public void test3(){
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
        driver.get("http://www.kurs-selenium.pl/demo/");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
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
        test.log(Status.PASS, "Udalo sie wyszukac hotel");

        Assert.assertEquals(webDriverWithMethods.isVisble(NAME_OF_HOTEL), true);
        Assert.assertEquals(webDriverWithMethods.getText(NAME_OF_HOTEL), "Jumeirah Beach Hotel");

        test.log(Status.PASS, "Zamkniecie strony z hotelami");
    }
}
