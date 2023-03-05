package seleniumB2B.helper;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ExcelReader {

    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xlsx
    public static void readExcelFile() throws IOException {

        InputStream inputStream = new FileInputStream(new File("src/test/resources/files/Dane.xlsx")); // Zczytuje zawartosc danego pliku
        XSSFWorkbook wordbook = new XSSFWorkbook(inputStream); // pobrana zawartosc pliku zapisujem w obiecie klasy XSSFWorkbook
        Sheet sheet = wordbook.getSheetAt(0); // Dzieki temu bedziemy mogli odniesc sie do konkretenej strony
        Iterator<Row> iterator = sheet.rowIterator(); // pozwala na przechodzic miedzy wszystkimi wierszami // sheet.rowIterator(); -zczytuje wiersze ze strony

        while (iterator.hasNext()) { //iterator.hasNext() - petla bedzie wykonywana dopoki mamy jakies wiersze z zawartoscia
            Row row = iterator.next(); // towrzymy obiekt klasy Row i przypisujemy do niego iterator.next() pozwalający na czytanie zawartosci poszczegolnych wierszy
            Iterator<Cell> cellIterator = row.cellIterator(); // row.cellIterator() - zczytuje zawartosc komorek z wierszy
            while (cellIterator.hasNext()) { //cellIterator.hasNext() - petla bedzie wykonywana dopoki mamy jakies komorki z zawartoscia
                Cell cell = cellIterator.next(); // towrzymy obiekt klasy Cell i przypisujemy do niego cellIterator.next() pozwalający na czytanie poszczegolnych komorek
                if (cell.getCellType().equals(CellType.STRING)) { // sprawdza czy typ komorek w exeleu jest typu tekstowego
                    System.out.println(cell.getStringCellValue()); // wypisuje tylko zawartosc typu tekstowego
                } else if (cell.getCellType().equals(CellType.NUMERIC)) { // sprawdza czy typ komorek jest numeryczny
                    System.out.println(cell.getNumericCellValue()); // wypisuje zawartosc typu numerycznego
                }

            }
        }
    }

    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xls
    public static void readExcelFile2() throws IOException {

        InputStream inputStream = new FileInputStream(new File("src/test/resources/files/Dane.xls")); // Zczytuje zawartosc danego pliku
        HSSFWorkbook wordbook = new HSSFWorkbook(inputStream); // pobrana zawartosc pliku zapisujem w obiecie klasy XSSFWorkbook
        Sheet sheet = wordbook.getSheetAt(0); // Dzieki temu bedziemy mogli odniesc sie do konkretenej strony
        Iterator<Row> iterator = sheet.rowIterator(); // pozwala na przechodzic miedzy wszystkimi wierszami // sheet.rowIterator(); -zczytuje wiersze ze strony

        while (iterator.hasNext()) { //iterator.hasNext() - petla bedzie wykonywana dopoki mamy jakies wiersze z zawartoscia
            Row row = iterator.next(); // towrzymy obiekt klasy Row i przypisujemy do niego iterator.next() pozwalający na czytanie zawartosci poszczegolnych wierszy
            Iterator<Cell> cellIterator = row.cellIterator(); // row.cellIterator() - zczytuje zawartosc komorek z wierszy
            while (cellIterator.hasNext()) { //cellIterator.hasNext() - petla bedzie wykonywana dopoki mamy jakies komorki z zawartoscia
                Cell cell = cellIterator.next(); // towrzymy obiekt klasy Cell i przypisujemy do niego cellIterator.next() pozwalający na czytanie poszczegolnych komorek
                if (cell.getCellType().equals(CellType.STRING)) { // sprawdza czy typ komorek w exeleu jest typu tekstowego
                    System.out.println(cell.getStringCellValue()); // wypisuje tylko zawartosc typu tekstowego
                } else if (cell.getCellType().equals(CellType.NUMERIC)) { // sprawdza czy typ komorek jest numeryczny
                    System.out.println(cell.getNumericCellValue()); // wypisuje zawartosc typu numerycznego
                }

            }
        }
    }
    // metoda powstala tylko aby sprawdzic czy metoda do czytania exela dziala
    public static void main (String[]args) throws IOException {
        readExcelFile2();
    }


    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xlsx (dla @DataProvider)
    public static Object[][] readExcelFile3(File file) throws IOException { //Object[][] - bedzie zwaracana tablica dwuwymiarowa abysmy mogli uzyc jej w naszym @DataProviderze

        InputStream inputStream = new FileInputStream(file); // (file) - dzieki teme bedziemy mogli przekazywac dowolny plik // Zczytuje zawartosc danego pliku
        XSSFWorkbook wordbook = new XSSFWorkbook(inputStream); // pobrana zawartosc pliku zapisujem w obiecie klasy XSSFWorkbook
        Sheet sheet = wordbook.getSheetAt(0); // Dzieki temu bedziemy mogli odniesc sie do konkretenej strony
        // aby zadeklarowac tablice musimy znac jej wielkosc - w tym celu pobieramy:
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers]; // deklarujemy nowa tablice o dokladnej wielkoscie [rowNumbers][colNumbers]

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1); // i+1 bo popijamy pierwszy wiersz (niepotrzebne headery)
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue(); // pobiera
            }
        }
        return data;
    }

    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xls (dla @DataProvider)
    public static Object[][] readExcelFile4(File file) throws IOException { //Object[][] - bedzie zwaracana tablica dwuwymiarowa abysmy mogli uzyc jej w naszym @DataProviderze

        InputStream inputStream = new FileInputStream(file); // (file) - dzieki teme bedziemy mogli przekazywac dowolny plik // Zczytuje zawartosc danego pliku
        HSSFWorkbook wordbook = new HSSFWorkbook(inputStream); // pobrana zawartosc pliku zapisujem w obiecie klasy XSSFWorkbook
        Sheet sheet = wordbook.getSheetAt(0); // Dzieki temu bedziemy mogli odniesc sie do konkretenej strony
        // aby zadeklarowac tablice musimy znac jej wielkosc - w tym celu pobieramy:
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers]; // deklarujemy nowa tablice o dokladnej wielkoscie [rowNumbers][colNumbers]

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1); // i+1 bo popijamy pierwszy wiersz (niepotrzebne headery)
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue(); // pobiera
            }
        }
        return data;
    }

    // Metoda z kursu
    public static String[][] readExcelFile5(String excelFilePath, String sheetName, int totalCols) {
        File file = new File(excelFilePath);
        String[][] tabArry = null;
        try {
            OPCPackage opcPackage = OPCPackage.open(file.getAbsolutePath());
            Workbook wb = WorkbookFactory.create(opcPackage);
            Sheet sheet = wb.getSheet(sheetName);
            int totalRows = sheet.getLastRowNum()+1;
            tabArry = new String[totalRows][totalCols];
            for (int i = 0; i < totalRows; i++) {
                Row row = sheet.getRow(i);
                String data = null;
                for (int j = 0; j < totalCols; j++) {
                    Cell cell = row.getCell(j);
                    if (cell == null) {
                        continue;
                    }
                    data = cell.getStringCellValue();
                    tabArry[i][j] = data;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tabArry;
    }

}
