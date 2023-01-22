package testCases;

import base.BaseTest;
import helper.SeleniumHelper;
import methods.WebDriverWithMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static pages.Homepage.*;
import static pages.SingUpPage.ALERT_TEXT_2;
import static pages.SingUpPage.CONFIRM_BUTTON;

public class ScreenshotTest extends BaseTest {
    WebDriverWithMethods webDriverWithMethods = new WebDriverWithMethods();

    @Test
    public void screenshot() throws IOException {
        driver.get("http://www.kurs-selenium.pl/demo/");
        webDriverWithMethods.click(MY_COUNT_BUTTON);
        webDriverWithMethods.click(SING_UP_BUTTON);
        webDriverWithMethods.click(CONFIRM_BUTTON);

        Assert.assertEquals(webDriverWithMethods.isVisble(ALERT_TEXT_2), true);
        SeleniumHelper.takeScreenshot();
    }
}
