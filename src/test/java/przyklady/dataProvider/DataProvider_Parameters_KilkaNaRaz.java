package przyklady.dataProvider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Parameters_KilkaNaRaz extends BaseTest {

    @Test(dataProvider = "data")
    public void getTitle(String path, String title, String url){
        driver.get(path);
        Assert.assertEquals(title, driver.getTitle());
    }

    // parallel na true pozwoli na odpalenie powyzszego testu 3x rownolegle jesli go puscimy przez plik .xml
    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider(){
        return new Object[][] {
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"},
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"},
                {"http://www.kurs-selenium.pl/demo/","PHPTRAVELS | Travel Technology Partner","http://www.kurs-selenium.pl/demo/"}};
    }
}