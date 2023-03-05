package seleniumB2B.shopify;

import seleniumB2B.baseTests.BaseTest;
import seleniumB2B.pages.shopify.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShopifyTest extends BaseTest {

    @Test // tworzymy pierwszy test
    public void shopifyFirstTest() {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage(); // Stworzenie nowego obiektu klasy HomePage
        // String actualError = bo ostatnia metoda .getErrorMessage(); zwraca stringa z wiadomości
        String actualError = page                                                                                                           // pisanie kolejnych metod po kropce jest możliwe dzieki temu, ze poszczegolne metody zwracja obiekt HomePage (return HomePage)
                .searchItem("Boot")                                                                                                           // Odwolanie sie do obiektu i wywolanie metody szukajacej (metoda musi miec juz zlokalizowany odopwiedni input)
                .clickOnItemLink()                                                                                                          // Klika w konkretny link
                .changeColor("Rust")                                                                                                        // pisanie kolejnych metod po kropce jest możliwe dzieki temu, ze poszczegolne metody zwracja obiekt HomePage (return HomePage)
                .changeSize("11")                                                                                                           // Odwolanie sie do obiektu i wywolanie metody szukajacej (metoda musi miec juz zlokalizowany odopwiedni input)
                .clickOnBuyButton()                                                                                                         // Klika w konkretny link
                .fillInContactForm("przeme@wp.pl", false, "Przemyslaw", "Kowalski", "Targowa 5/39",
                        "09-500", "Warszawa", "888-442-444", true, "Poland")
                .shipping()
                .fillInPaymentInformation("4108", "6526", "1018", "1217", "Danica Killough", "12", "2024", "846")
                .getErrorMessage();

//        Assert.assertEquals(actualError, expectedText);
    }
}
