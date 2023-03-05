package javaTips.podstawy;

import org.testng.annotations.Test;

public class Tablice {

    @Test
    public void test() {
        /*        TABLICA JEDNO WYMIAROWA
            -----------------------------------
             tab[0] tab[1] tab[2] tab[3] tab[4]
            -----------------------------------
        */

        // W tablicach z gory musimy okreslic ich wielkosc new int[5];
        // int[] - typ tablicy
        // [] - info ze to tablica a nie pojedycza zmienna
        // tab - nazwa tablicy
        // new - rezerwacja nowego miejsca w pamieci RAM
        // int[5] - na tablice 5 elementowa od 0-4
        // Deklaracja tablicy
        int[] tab = new int[5];

        tab = new int[9];

        // Przypisywanie wartosci do poszczegolnych pozycji w tablicy
        tab[0] = 20;
        tab[1] = 7;
        tab[2] = 27;
        tab[3] = 15;
        tab[4] = 77;

        // Wypiszywanie poszczegolnych wartosci z tablicy
        // tab[0] - odwolanie sie do konkretnego miejsca w tablicy
        System.out.println(tab[0]);
        System.out.println(tab[5]);    // Wypisze 0 bo nic nie przypisalismy do tablicy
//        System.out.println(tab[10]);   // proba wypisania elementu tablicy poza zakresem WYRZUCI BLAD
    }

    @Test
    public void test2(){
        //
        int[] tab2 = {4, 14, 4, 412, 1254, 512};

        // [tab2.length-1] pozwala wypisac ostatania wartosc tablicy
        System.out.println(tab2[tab2.length-1]);


/*
        ------------------------------------
           [0][0]   |  [0][1] |   [0][2]
        ------------------------------------
        ------------------------------------
           [1][0]   |  [1][1] |   [1][2]
        ------------------------------------
        ------------------------------------
           [2][0]   |  [2][1] |   [2][2]
        ------------------------------------
        ------------------------------------
           [3][0]   |  [3][1] |   [3][2]
        ------------------------------------
*/
        // Deklaracja tablicy
        int[][] tab3 = new int[5][5];

        // Zmiana wielkosci
        tab3 = new int[4][3];

        // Przypisanie wartosci
        tab3[0][0] = 25;
        tab3[3][2] = 70;

        // Odwolanie i wypisanie na ekran
        System.out.println(tab3[3][2]);

        // Deklaracja z przypisaniem wartosci do tablicy
        int[][] tab4 =
                {
                        {4, 15, 17},
                        {5, 12, 125},
                        {651, 1256, -24},
                        {6555, 2, -2444}
                };

        // Odwolanie i wypisanie na ekran
        System.out.println(tab4[3][0]);
    }
}
