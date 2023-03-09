package seleniumB2B.shopify;

import org.testng.Assert;
import framework.selenium.helper.ExcelReader;
import seleniumB2B.baseTests.BaseTestDlaTestowzXml;
import framework.selenium.pages.shopify.HomePage;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

public class ShopifyTestZXml extends BaseTestDlaTestowzXml {

    @Test
    @Parameters({"Item2"})
    public void shopifyFirstTest(String item) throws InterruptedException {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage();
        String actualError = page
                .searchItem(item)
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
    }

    @Test
    @Parameters({"Item2"})
    public void shopifyRownolegle(String item) throws InterruptedException {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage();
        String actualError = page
                .searchItem(item)
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
    }

    @Test
    @Parameters({"Item2"})
    public void shopifyRownolegle2(String item) throws InterruptedException {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage();
        String actualError = page
                .searchItem(item)
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
    }

    @Test
    @Parameters({"Item"})
    public void shopifyFirstTest2(String item) {
        Reporter.log("Zaczynam test shopifyFirstTest2");
        Reporter.log("Tworze HomePage");
        HomePage page2 = new HomePage();
        Reporter.log("Wyszukuje produkt o nazwie: " + item);
        page2.searchItem(item);
    }

    @Test(dataProvider = "getData")
    public void shopifyFirstTest3(String item) {
        HomePage page2 = new HomePage();
        page2.searchItem(item);
    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = null;
        try {
            data = ExcelReader.readExcelFile4("src//main//resources//Dane.xls");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }



    //Do jednoczesnego odpalania kilku testów z excela
    @Test(dataProvider = "getData2")
    public void shopifyFirstTest4(String item) {
        HomePage page2 = new HomePage();
        page2.searchItem(item);
    }

    // parallel = true - do jednoczesnego odpalania testów z excela // dodatkowa konfiguracja w .xml data-provider-thread-count="3"
    @DataProvider(parallel = true)
    public Object[][] getData2() {
        Object[][] data = null;
        try {
            data = ExcelReader.readExcelFile4("src//main//resources//Dane.xls");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
