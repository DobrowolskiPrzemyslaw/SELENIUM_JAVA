package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetTitleTest_getProperty extends BaseTest {

    private static final Logger logger = LogManager.getLogger(GetTitleTest_getProperty.class);

    @Test
    public void getTitle() throws IOException  {
        String url = SeleniumHelper.loadProperties("browser.url");
        driver.get(url);

        SeleniumHelper.assertWithLogInfo(logger,"PHPTRAVELS | Travel Technology Partner", driver.getTitle());
        SeleniumHelper.assertWithLogInfo(logger,"http://www.kurs-selenium.pl/demo/", driver.getCurrentUrl());
    }
}
