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

        InputStream inputStream = new FileInputStream(new File("src/test/resources/files/Dane.xlsx"));
        XSSFWorkbook wordbook = new XSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.rowIterator();

        while (iterator.hasNext()) {
            Row row = iterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getCellType().equals(CellType.STRING)) {
                    System.out.println(cell.getStringCellValue());
                } else if (cell.getCellType().equals(CellType.NUMERIC)) {
                    System.out.println(cell.getNumericCellValue());
                }

            }
        }
    }

    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xls
    public static void readExcelFile2() throws IOException {

        InputStream inputStream = new FileInputStream(new File("src/test/resources/files/Dane.xls"));
        HSSFWorkbook wordbook = new HSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.rowIterator();

        while (iterator.hasNext()) {
            Row row = iterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getCellType().equals(CellType.STRING)) {
                    System.out.println(cell.getStringCellValue());
                } else if (cell.getCellType().equals(CellType.NUMERIC)) {
                    System.out.println(cell.getNumericCellValue());
                }

            }
        }
    }

    // metoda powstala tylko aby sprawdzic czy metoda do czytania exela dziala
    public static void main (String[]args) throws IOException {
        readExcelFile2();
    }


    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xlsx (dla @DataProvider)
    public static Object[][] readExcelFile3(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wordbook = new XSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers];

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue();
            }
        }
        return data;
    }

    // Tworzymy metodę umożliwiajaca czytanie plikow Execla - dla plików .xls (dla @DataProvider)
    public static Object[][] readExcelFile4(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wordbook = new HSSFWorkbook(inputStream);
        Sheet sheet = wordbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        int colNumbers = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNumbers][colNumbers];

        for (int i = 0; i <rowNumbers; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j<row.getLastCellNum(); j++) {
                data[i][j] = row.getCell(j).getStringCellValue();
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
