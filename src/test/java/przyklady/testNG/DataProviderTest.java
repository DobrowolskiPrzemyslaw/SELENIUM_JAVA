package przyklady.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void test(String val){
        System.out.println(val);
    }

    @Test(dataProvider = "data2")
    public void test2(String val, String number){
        System.out.println(val + number);
        System.out.println(val);
        System.out.println(number);
    }

    @Test(dataProvider = "data3")
    public void test3(String username, String password){
        System.out.println("Test logowania");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Test(dataProvider = "data4")
    public void test4(String username, String password){
        System.out.println("Test logowania");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {{"I am test 1"},{"I am test 2"},{"I am test 3"}};
    }

    @DataProvider(name = "data2")
    public Object[][] dataProvider2(){
        return new Object[][] {{"I am test"," 111"},{"I am test"," 222"},{"I am test"," 333"}};
    }

    @DataProvider(name = "data3")
    public Object[][] dataProvider3(){
        return new Object[][] {{"Adam","poprawne haslo"},{"Jarek"," poprawne haslo"},{"Krystian"," poprawne haslo"}};
    }

    @DataProvider(name = "data4")
    public Object[][] dataProvider4(){
        return new Object[][] {{"Adam","bledne haslo"},{"Jarek"," bledne haslo"},{"Krystian"," bledne haslo"}};
    }
}
