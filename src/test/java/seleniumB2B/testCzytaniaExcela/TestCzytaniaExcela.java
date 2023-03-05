package seleniumB2B.testCzytaniaExcela;

import seleniumB2B.helper.ExcelReader;

import java.io.File;
import java.io.IOException;

public class TestCzytaniaExcela {
        // metoda powstala tylko aby sprawdzic czy metoda do czytania exela dziala
    public static void main (String[]args) throws IOException {
        Object[][] data = ExcelReader.readExcelFile4(new File("src//main//resources//Dane.xls")); // odczytywanie wskazanego pliku
        System.out.println(data[0][0]); // mozliwosco odwolania do poszczegolnych komorek pliku
        System.out.println(data[1][0]); // mozliwosco odwolania do poszczegolnych komorek pliku
        System.out.println(data[2][0]); // mozliwosco odwolania do poszczegolnych komorek pliku
    }
}
