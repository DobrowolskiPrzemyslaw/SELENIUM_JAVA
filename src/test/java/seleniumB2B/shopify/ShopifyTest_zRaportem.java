package seleniumB2B.shopify;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import framework.selenium.pages.shopify.HomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import seleniumB2B.baseTests.BaseTest;

public class ShopifyTest_zRaportem extends BaseTest {

    @Test
    public void shopifyFirstTest() throws InterruptedException {
        ExtentTest test = extentReporters.createTest("shopifyFirstTest", "Testy Shopify");
        test.log(Status.PASS, "Rozpoczecie testu");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage();
        String actualError = page
                .searchItem("Boot")
                .clickOnItemLink()
                .changeColor("Rust")
                .changeSize("11")
                .clickOnBuyButton()
                .fillInContactForm("przeme@wp.pl", "Przemyslaw", "Kowalski",
                        "Finture","Targowa 5/39", "09-500", "Warszawa",
                        "888-442-444", true, "Poland")
                .shipping()
                .fillInPaymentInformation("4108", "6526", "1018", "1217",
                        "Danica Killough", "12", "2024", "846")
                .getErrorMessage();
        Assert.assertEquals(actualError, expectedText);
        test.log(Status.PASS, "Zakonczenie testu");
    }
}
