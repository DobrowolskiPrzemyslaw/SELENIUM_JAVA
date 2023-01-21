package testCases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetTitleTest_withXmlParameters extends BaseTest {

    @Test
    @Parameters({"path","excetedTitle","excetedUlr"})
    public void getTitle(String path, String title, String url){
        driver.get(path);
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }
}