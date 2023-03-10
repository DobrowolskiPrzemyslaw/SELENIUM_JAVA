package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class GetTitleTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(GetTitleTest.class);

    @Test(description = "Opis testu")
    public void getTitle(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        SeleniumHelper.assertWithLogInfo(logger,"PHPTRAVELS | Travel Technology Partner", driver.getTitle());
        SeleniumHelper.assertWithLogInfo(logger,"http://www.kurs-selenium.pl/demo/", driver.getCurrentUrl());
    }
}
