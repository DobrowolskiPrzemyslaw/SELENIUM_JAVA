package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static pages.Controls.*;

public class ScreenshotTest extends BaseTest {

    @Test
    public void screenshot() throws IOException {
        driver.get("http://www.kurs-selenium.pl/demo/");

        MY_COUNT_BUTTON.click();
        SING_UP_BUTTON.click();
        CONFIRM_BUTTON.click();

        Assert.assertEquals(TEXT_ALERT_2.isVisble(), true);
        SeleniumHelper.takeScreenShot();
    }
}
