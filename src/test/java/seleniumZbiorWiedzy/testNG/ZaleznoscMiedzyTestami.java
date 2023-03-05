package seleniumZbiorWiedzy.testNG;

import org.testng.annotations.Test;

public class ZaleznoscMiedzyTestami {

    @Test(dependsOnMethods = {"test2"})
    public void test1(){
        System.out.println("To jest Test1 - wykonam sie po wykonaniu test2");
    }

    @Test
    public void test2(){
        System.out.println("To jest Test2 - wykonam sie pierwszy");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test3(){
        System.out.println("To jest Test3 - wykonam sie po wykonaniu test1");
    }
}
