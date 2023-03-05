package seleniumB2B.shopify;

import org.testng.Assert;
import seleniumB2B.baseTests.BaseTest;
import seleniumB2B.pages.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShopifyTest extends BaseTest {

    @Test
    public void shopifyFirstTest() {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage();
        String actualError = page
                .searchItem("Boot")
                .clickOnItemLink()
                .changeColor("Rust")
                .changeSize("11")
                .clickOnBuyButton()
                .fillInContactForm("przeme@wp.pl", false, "Przemyslaw", "Kowalski",
                        "Targowa 5/39", "09-500", "Warszawa", "888-442-444",
                        true, "Poland")
                .shipping()
                .fillInPaymentInformation("4108", "6526", "1018", "1217",
                        "Danica Killough", "12", "2024", "846")
                .getErrorMessage();

        Assert.assertEquals(actualError, expectedText);
    }
}
