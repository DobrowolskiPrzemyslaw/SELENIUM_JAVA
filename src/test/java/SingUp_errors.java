import elements.Button;
import elements.InputTextBox;
import elements.Text;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUp_errors extends BaseTest {

    @Test
    public void sortNameOfHotels(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Button myCountButton = new Button(By.xpath("(//li[@id='li_myaccount'])[2]"));
        Button singUpButton = new Button(By.xpath("(//a[text()='  Sign Up'])[last()]"));
        InputTextBox confirmButton = new InputTextBox(By.xpath("//button[text()]//i"));
        Text textAlert = new Text(By.xpath("//div//p[text()]"));

        myCountButton.clickOnElement();
        singUpButton.clickOnElement();
        confirmButton.clickOnElement();

        Assert.assertEquals(textAlert.isVisble(), true);
    }
}
