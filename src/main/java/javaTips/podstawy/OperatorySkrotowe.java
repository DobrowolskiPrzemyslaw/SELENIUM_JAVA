package javaTips.podstawy;

import org.testng.annotations.Test;

public class OperatorySkrotowe {

    @Test
    public void skroconyZapisOperacjiNaZmienychPrymitywnych() {
        /*
               =   przypisanie wartości
               +=
               -=
               /=
               *=
               %=
        */
        int x = 2;
        System.out.println("Przyklad 7: " + x);
        System.out.println("Przyklad 7a: " + (x += 2)); // x = x + 2 zwiększenie o 2
        System.out.println("Przyklad 8: " + (x -= 2));
        System.out.println("Przyklad 9: " + (x *= 2));
        System.out.println("Przyklad 10: " + (x /= 2));
        System.out.println("Przyklad 11: " + (x %= 2));
        System.out.println("---------------------------------------");
    }
}
