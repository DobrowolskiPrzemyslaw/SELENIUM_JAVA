package testCases;

import base.BaseTest;
import helper.ListenersTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {ListenersTest.class})
public class ListenerTest extends BaseTest {

    @Test
    public void succesTest(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
        Assert.assertEquals("http://www.kurs-selenium.pl/demo/", driver.getCurrentUrl());
    }

    @Test
    public void failureTest(){
        driver.get("http://www.kurs-selenium.pl/demo/");
        Assert.assertEquals("PHPTRAVELS | Travel Technology ", driver.getTitle());
        Assert.assertEquals("http://www.kurs-selenium.pl", driver.getCurrentUrl());
    }
}
