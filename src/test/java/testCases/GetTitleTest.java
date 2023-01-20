package testCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetTitleTest extends BaseTest {

    @Test
    public void getTitle(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
        Assert.assertEquals("http://www.kurs-selenium.pl/demo/", driver.getCurrentUrl());
    }
}
