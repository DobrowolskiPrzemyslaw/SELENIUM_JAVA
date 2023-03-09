package przyklady.dataProvider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Parameters extends BaseTest {

    @Test(dataProvider = "data")
    public void getTitle(String path, String title, String url){
        driver.get(path);
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"},
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"},
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"}};
    }
}