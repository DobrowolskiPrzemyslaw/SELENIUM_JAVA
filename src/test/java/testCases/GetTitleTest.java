package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class GetTitleTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(GetTitleTest.class);

    @Test
    public void getTitle(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        SeleniumHelper.assertWithLog(logger,"PHPTRAVELS | Travel Technology Partner", driver.getTitle());
        SeleniumHelper.assertWithLog(logger,"http://www.kurs-selenium.pl/demo/", driver.getCurrentUrl());
    }
}
