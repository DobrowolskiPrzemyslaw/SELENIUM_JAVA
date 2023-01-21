package testCases;

import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import helper.SeleniumHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import static pages.Controls.*;
import static pages.Controls.NAME_OF_HOTEL;

public class ReportTestZScreenShotem extends BaseTest {

    @Test
    public void test() throws IOException {
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");

        driver.get("http://www.kurs-selenium.pl/demo/");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
        LABEL_ON_INPUT.click();
        SEARCH_HOTEL_INPUT.sendText("Dubai");
        LINK_TO_HOTELS.click();
        CHECH_IN_INPUT.sendText("19/01/2023");
        CHECH_OUT_INPUT.sendText("19/01/2023");
        CHECK_PEOPLE_LABEL.click();
        ADULT_INPUT.sendText("1");
        CHILD_INPUT.sendText("3");
        SEARCH_BUTTON.click();
        NAME_OF_HOTEL.isVisble();
        test.log(Status.PASS, "Udalo sie wyszukac hotel");

        test.log(Status.PASS, "Screenshot", SeleniumHelper.makeRaportSreenshot());
        Assert.assertEquals(NAME_OF_HOTEL.isVisble(), true);
        Assert.assertEquals(NAME_OF_HOTEL.getText(), "Jumeirah Beach Hotel");

        test.log(Status.PASS, "Zamkniecie strony z hotelami");
    }
}
