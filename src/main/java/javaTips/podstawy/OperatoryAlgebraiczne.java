package javaTips.podstawy;

import org.testng.annotations.Test;

public class OperatoryAlgebraiczne {

    @Test
    public void algebraiczne() {
        /*
          OPERATOR - to znaki służące do operowania na zmiennych

           OPERATORY ARYTMETYCZNE
               +   dodawanie liczb oraz łączenie string'ów
               -   odejmowanie
               *   mnożenie
               /   dzielenie
               %   reszta z dzielenia (dzielenie modulo)
        */
        System.out.println("-------OPERATORY ARYTMETYCZNE-------");
        System.out.println("Przyklad 1: " + (1 + 2));
        System.out.println("Przyklad 2: " + (1 - 2));
        System.out.println("Przyklad 3: " + (1 * 2));
        System.out.println("Przyklad 4: " + (1 / 2));
        System.out.println("Przyklad 4a: " + (1 / 2.0));
        System.out.println("Przyklad 4b: " + ((double) 1 / 2));
        System.out.println("Przyklad 4c: " + (1 / (double) 2));
        System.out.println("Przyklad 5: " + (4 % 2));                   // jesli parzysta przez 2 to 0, jesli nieparzysta przez 2 to 1
        System.out.println("Przyklad 5a: " + (5 % 2));                  // jesli parzysta przez 2 to 0, jesli nieparzysta przez 2 to 1
        System.out.println("Przyklad 6: " + 1 + 2);                     // UWAGA NA PLAPKE
        System.out.println("---------------------------------------");
    }
}
