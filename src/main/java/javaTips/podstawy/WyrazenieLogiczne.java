package javaTips.podstawy;

import org.testng.annotations.Test;

public class WyrazenieLogiczne {

    @Test
    public void wyrazenieLogiczne() {
        int n = 5;
        String czyParzysta =  n%2 == 0 ? "parzysta" : "nieparzyta";
        System.out.println(czyParzysta);
    }
}
