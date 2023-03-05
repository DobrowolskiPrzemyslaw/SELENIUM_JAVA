package javaTips.podstawy;

import org.testng.annotations.Test;

public class ZmiennePrymitywne {

    @Test
    public void liczby_calkowite(){
        byte b = 1;
        short c = 12;
        int a = 123;
        long d = 1234L;

        int x = 10;
        int y = 6;
        int z;
        z = x + y;
        System.out.println(z);
    }

    @Test
    public void znaki(){
        char znak = 'A';
    }

    @Test
    public void zmiennoprzecinkowe() {
        float f4 = 4.67f;
        double d5 = 53.6435;
    }

    @Test
    public void stale_zmienne_finalne() {
        final double PI = 3.14;
        final double LICZBA_PI = 3.14;
//        LICZBA_PI = 12; //Nie mozna nadpisac zmiennej
    }

    @Test
    public void rzutowanieZmiennych() {
        int i1 = 5, i2 = 2;
        System.out.println("Przyklad 1: " + i1 / i2);          //ucina koncowke bez zaokraglania
        System.out.println("Przyklad 2: " + (double) i1 / i2);
        System.out.println("Przyklad 3: " +  i1 / (double)i2);
    }

    @Test
    public void rzutowanieZmiennych_2() {
        int i1 = 5, i2 = 2;
        double d1 = 12, d2 = 15;
        System.out.println("Przyklad 4: " + 1 / 5);
        System.out.println("Przyklad 5: " + 1.0 / 5);
        System.out.println("Przyklad 6: " + (double)1 / 5);
        System.out.println("Przyklad 7: " + d1/ i2);
        System.out.println("Przyklad 8: " + d2/ i2);
    }
}
