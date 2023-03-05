package seleniumB2B.shopify;

import seleniumB2B.helper.ExcelReader;
import seleniumB2B.baseTests.BaseTestZXml;
import seleniumB2B.pages.shopify.HomePage;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ShopifyTestZXml extends BaseTestZXml {

    @Test // tworzymy pierwszy test
    @Parameters({"Item"})
    // tych parametrów może być więcej, zostaną przekazane do metody zgodnie zkolejnością wpisania // podajemy nazwy parametrów z .xml
    public void shopifyFirstTest(String item) {
        Reporter.log("Zaczynam test shopifyFirstTest");
        String expectedText = "Your payment details couldn’t be verified. Check your card details and try again.";
        HomePage page = new HomePage(); // Stworzenie nowego obiektu klasy HomePage
        // String actualError = bo ostatnia metoda .getErrorMessage(); zwraca stringa z wiadomości
        String actualError = page                                                                                                           // pisanie kolejnych metod po kropce jest możliwe dzieki temu, ze poszczegolne metody zwracja obiekt HomePage (return HomePage)
                .searchItem(item)                                                                                                           // Odwolanie sie do obiektu i wywolanie metody szukajacej (metoda musi miec juz zlokalizowany odopwiedni input)
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

    //    // Dla ShopifyTests1 i ShopifyTests3
//    @Test
//    @Parameters({"Item2"}) // tych parametrów może być więcej, zostaną przekazane do metody zgodnie zkolejnością wpisania // podajemy nazwy parametrów z .xml
//    public void shopifyFirstTest2(String item) {
//        Reporter.log("Zaczynam test shopifyFirstTest2");
//        Reporter.log("Tworze HomePage");
//        HomePage page2 = new HomePage();
//        Reporter.log("Wyszukuje produkt o nazwie: " + item);
//        page2.searchItem(item);
//    }
//



    //Do odpalania testów o parametrach z excela jeden po drugim // bez (parallel = true) // parallel = true - do jednoczesnego odpalania testów z excela
    @Test(dataProvider = "getData")

    public void shopifyFirstTest2(String item) {
        HomePage page2 = new HomePage();
        page2.searchItem(item);
    }
    // dadajemy dataProvidera = "nazwaMetody"
    @DataProvider
    public Object[][] getData() {
        Object[][] data = null; // tablica na poczatku ma byc pusta
        try {
            data = ExcelReader.readExcelFile4(new File("src//main//resources//Dane.xls")); // odczytywanie wskazanego pliku
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;






//    //Do jednoczesnego odpalania kilku testów z excela
//    @Test(dataProvider = "getData")
//    public void shopifyFirstTest2(String item) {
//        HomePage page2 = new HomePage();
//        page2.searchItem(item);
//    }
//    // dadajemy dataProvidera = "nazwaMetody"
//    // parallel = true - do jednoczesnego odpalania testów z excela // dodatkowa konfiguracja w .xml data-provider-thread-count="3"
//    @DataProvider(parallel = true)
//    public Object[][] getData() {
//        Object[][] data = null; // tablica na poczatku ma byc pusta
//        try {
//            data = ExcelReader.readExcelFile4(new File("src//main//resources//Dane.xls")); // odczytywanie wskazanego pliku
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return data;


//    // DataProvider z metodą z kursu B2B
//    @DataProvider
//    public Object [][] getData(){
//        return ExcelHelper.readExcelFile5("src/main/resources/Zeszyt2.xlsx", "Arkusz1", 1 );
//    }



    }
}
