package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnorowanieTestow{

    @Test
    public void test(){
        System.out.println("To jest Test");
    }

    @Test
    @Ignore
    public void test2(){
        System.out.println("To jest Test2");
    }

    @Test
    @Ignore
    public void test3(){
        System.out.println("To jest Test3");
    }
}
