package seleniumZbiorWiedzy.testNG;

import org.testng.annotations.Test;

public class GrupyTestow {

    @Test(dependsOnGroups = {"firstGruop","scoundGroup"}, priority = 1)
    public void test5(){
        System.out.println("To jest Test5 - wykonam sie po wykonaniu grupy testow");
    }

    @Test(groups = {"firstGruop"})
    public void test(){
        System.out.println("To jest Test1 - jestem z firstGruop");
    }

    @Test(groups = {"firstGruop"})
    public void test2(){
        System.out.println("To jest Test2 - jestem z firstGruop");
    }

    @Test(groups = {"scoundGroup"})
    public void test3(){
        System.out.println("To jest Test3 - jestem z scoundGroup");
    }

    @Test(groups = {"scoundGroup"})
    public void test4(){
        System.out.println("To jest Test4 - jestem z scoundGroup");
    }

    @Test(priority = 2)
    public void test6(){
        System.out.println("To jest Test5 - mam priorytet 2");
    }
}
