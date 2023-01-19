package cases;

import static pages.Controls.*;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotResultsFound extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");

        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.click();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.click();
        Assert.assertEquals(notResultsText.isVisble(), true);
        Assert.assertEquals(notResultsText.getText(), "No Results Found");
    }
}
