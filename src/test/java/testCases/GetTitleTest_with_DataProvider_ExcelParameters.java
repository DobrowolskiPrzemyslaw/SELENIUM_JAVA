package testCases;

import base.BaseTest;
import helper.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GetTitleTest_with_DataProvider_ExcelParameters extends BaseTest {

    @Test(dataProvider = "data")
    public void getTitle(String path, String title, String url){
        driver.get(path);
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    // w Excelu trzeba kasować puste aktywne wiersze i kolumny
    @DataProvider(name = "data")
    public Object[][] dataProvider()  throws IOException {
        return ExcelReader.readExcelFile_dataProvider_xls("src/main/resources/files/getTitleData.xls");
    }
}