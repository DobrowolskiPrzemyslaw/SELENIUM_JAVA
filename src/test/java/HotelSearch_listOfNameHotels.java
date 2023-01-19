import elements.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class HotelSearch_listOfNameHotels extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Label labelOnInput = new Label(By.xpath("//span[text()='Search by Hotel or City Name']"));
        InputTextBox searchInputHotel = new InputTextBox(By.xpath("//div[@id='select2-drop']//input"));
        InputTextBox checkIn = new InputTextBox(By.xpath("//input[@class='form input-lg dpd1']"));
        InputTextBox checkOut = new InputTextBox(By.xpath("//input[@class='form input-lg dpd2']"));
        InputTextBox checkPeople = new InputTextBox(By.xpath("//input[@id='travellersInput']"));
        InputTextBox adultInput = new InputTextBox(By.xpath("//input[@id='adultInput']"));
        InputTextBox childInput = new InputTextBox(By.xpath("//input[@id='childInput']"));
        Link lintToHotels = new Link(By.xpath("//div[text()=', United Arab Emirates']"));
        Button searchButton = new Button(By.xpath("//button[text()=' Search']"));
        Text nameOfHotel = new Text(By.xpath("//b[text()='Jumeirah Beach Hotel']"));

        labelOnInput.clickOnElement();
        searchInputHotel.sendText("Dubai");
        lintToHotels.clickOnLink();
        checkIn.sendText("19/01/2023");
        checkOut.sendText("19/01/2023");
        checkPeople.clickOnElement();
        adultInput.sendText("1");
        childInput.sendText("3");
        searchButton.clickOnElement();
        nameOfHotel.isVisble();

        List list = driver.findElements(By.xpath("//h4[@class='RTL go-text-right mt0 mb4 list_title']"))
                          .stream()
                          .map(el -> el.getAttribute("textContent"))
                          .collect(Collectors.toList());

        Assert.assertEquals(list.get(0), "Jumeirah Beach Hotel");
        Assert.assertEquals(list.get(1), "Oasis Beach Tower");
        Assert.assertEquals(list.get(2), "Rose Rayhaan Rotana");
        Assert.assertEquals(list.get(3), "Hyatt Regency Perth");
    }
}
