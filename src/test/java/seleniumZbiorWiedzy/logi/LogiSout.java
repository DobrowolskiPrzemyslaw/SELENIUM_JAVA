package seleniumZbiorWiedzy.logi;

import org.testng.annotations.Test;

// Od najniszego do najwyzszego priorytetuÓ
public class LogiSout {

    @Test(priority = 2)
    public void test(){
        System.out.println("To jest Test1 - mam priorytet 2");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("To jest Test2 - mam priorytet 0");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("To jest Test3 - mam priorytet 1");
    }

    @Test(priority = 3)
    public void test4(){
        System.out.println("To jest Test4 - mam priorytet 3");
    }

    @Test(priority = 5)
    public void test5(){
        System.out.println("To jest Test5 - mam priorytet 5");
    }

    @Test(priority = 1)
    public void test6(){
        System.out.println("To jest Test6 - mam priorytet 1");
    }
}
