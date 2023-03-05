package seleniumZbiorWiedzy.testNG;

import org.testng.annotations.*;

public class BaseTest {

// https://www.tutorialspoint.com/testng/testng_basic_annotations.htm -

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Jestem w BeforeSuite - Metoda z adnotacjami zostanie uruchomiona tylko raz przed uruchomieniem wszystkich testów w tym pakiecie.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Jestem w BeforeTest - Metoda z adnotacjami zostanie uruchomiona przed uruchomieniem jakiejkolwiek metody testowej należącej do klas wewnątrz znacznika <test>.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Jestem w BeforeClass - Metoda z adnotacjami zostanie uruchomiona tylko raz przed wywołaniem pierwszej metody testowej w bieżącej klasie.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Jestem w BeforeMethod - Opisana metoda zostanie uruchomiona przed każdą metodą testową.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Jestem w AfterMethod - Opisana metoda zostanie uruchomiona po każdej metodzie testowej.");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Jestem w AfterClass - Metoda z adnotacjami zostanie uruchomiona tylko raz po uruchomieniu wszystkich metod testowych w bieżącej klasie.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Jestem w AfterTest - Metoda z adnotacjami zostanie uruchomiona po uruchomieniu wszystkich metod testowych należących do klas wewnątrz znacznika <test>..");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Jestem w AfterSuite - Metoda z adnotacjami zostanie uruchomiona tylko raz po zakończeniu wszystkich testów w tym pakiecie.");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Jestem w BeforeMethod - Ta metoda zostanie wykonana, zanim zostanie wspomniana jakakolwiek metoda testowa z określonej grupy.");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("Jestem w BeforeMethod - Ta metoda zostanie wykonana po wykonaniu ostatniej metody testowej z określonej grupy.");
    }


    @Test
    public void test(){
        System.out.println("To jest Test");
    }

    @Test
    public void test2(){
        System.out.println("To jest Test2");
    }

}
