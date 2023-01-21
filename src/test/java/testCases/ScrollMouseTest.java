package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import static pages.Controls.EXRANET_LOGIN_BUTTON;

public class ScrollMouseTest extends BaseTest {

    @Test
    public void scrollTest(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        EXRANET_LOGIN_BUTTON.moveTo();
    }
}
