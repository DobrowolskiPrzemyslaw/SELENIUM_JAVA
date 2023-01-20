package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertTest extends BaseTest {

    @Test
    public void getCurrentUrl(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("PHPTRAVELS | Travel Tec", driver.getTitle());
        softAssert.assertEquals("http://www.kurs-selenium.pl/demo", driver.getCurrentUrl());
        // softAsserty nie zwracają błędów trzeba byłoby logować
    }
}
