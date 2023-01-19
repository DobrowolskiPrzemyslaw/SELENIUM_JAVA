import elements.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotResultsFound extends BaseTest {

    @Test
    public void searchHotel(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
        InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
        InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@id='travellersInput']"));
        InputTextBox adultInput = new InputTextBox(By.xpath("//input[@id='adultInput']"));
        InputTextBox childInput = new InputTextBox(By.xpath("//input[@id='childInput']"));
        Button searchButton = new Button(By.xpath("//button[text()=' Search']"));
        Text notResultsText = new Text(By.xpath("//div[@class='itemscontainer']//h2"));

        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.clickOnElement();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.clickOnElement();
        Assert.assertEquals(notResultsText.isVisble(), true);
        Assert.assertEquals(notResultsText.getText(), "No Results Found");
    }
}
