package cases;

import static pages.Controls.*;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotResultsFound extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        CHECH_IN_INPUT.sendText("19/01/2023");
        CHECH_OUT_INPUT.sendText("19/01/2023");
        CHECK_PEOPLE_LABEL.click();
        ADULT_INPUT.sendText("1");
        CHILD_INPUT.sendText("3");
        SEARCH_BUTTON.click();
        Assert.assertEquals(notResultsText.isVisble(), true);
        Assert.assertEquals(notResultsText.getText(), "No Results Found");
    }
}
