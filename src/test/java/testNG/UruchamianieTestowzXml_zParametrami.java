package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UruchamianieTestowzXml_zParametrami {

    @Test
    @Parameters({"par","par2"})
    public void test(String par, String par2){
        System.out.println("To jest Test z parametrem " + par + " i " + par2);
    }
}
