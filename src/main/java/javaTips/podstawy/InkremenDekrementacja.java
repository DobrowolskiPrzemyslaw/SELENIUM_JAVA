package javaTips.podstawy;

import org.testng.annotations.Test;

public class InkremenDekrementacja {

    @Test
    public void inkrementacja_dekrementacja(){
        /*
               ++   inkrementacja - powiększ o 1
               --   dekrementacja - zmniejsz o 1

               y++ - POST INKREMENTACJA
               y-- - POST dekrementacja

               ++y - PRE INKREMENTACJA
               --y - PRE dekrementacja
         */
        int a = 5;
        int b = 5;
//        y++ - POST INKREMENTACJA - najpierw wypisz potem zwieksz
        System.out.println("Przyklad 12: " + a++);
        System.out.println("Przyklad 13: " + a);
//        ++y - PRE INKREMENTACJA - najpierw zwieksz potem wypisz
        System.out.println("Przyklad 14: " + ++a);
        System.out.println("Przyklad 15: " + a);
        //        --y - PRE INKREMENTACJA - najpierw zwieksz potem wypisz
        System.out.println("Przyklad 16: " + --b);
        System.out.println("Przyklad 17: " + b);
        //        y-- - PRE INKREMENTACJA - najpierw zwieksz potem wypisz
        System.out.println("Przyklad 18: " + b--);
        System.out.println("Przyklad 19: " + b);
        System.out.println("---------------------------------------");
    }
}
