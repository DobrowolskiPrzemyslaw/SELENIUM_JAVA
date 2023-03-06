package seleniumB2B.testCzytaniaExcela;

import framework.selenium.helper.ExcelReader;
import java.io.File;
import java.io.IOException;

public class TestCzytaniaExcela {
    public static void main (String[]args) throws IOException {
        Object[][] data = ExcelReader.readExcelFile4(new File("src/main/resources/files/DaneGBP.xls"));
        System.out.println(data[0][0]);
        System.out.println(data[1][0]);
        System.out.println(data[2][0]);
    }
}
