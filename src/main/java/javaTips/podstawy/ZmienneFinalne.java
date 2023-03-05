package javaTips.podstawy;

import org.testng.annotations.Test;

public class ZmienneFinalne {

    @Test
    public void liczby_calkowite(){
        final byte B = 1;
        final short C = 12;
        final int A = 123;
        final long D = 1234L;
        final char znak = 'A';
        final float f4 = 4.67f;
        final double LICZBA_PI = 3.14;
//        LICZBA_PI = 12; //Nie mozna nadpisac zmiennej
    }
}
