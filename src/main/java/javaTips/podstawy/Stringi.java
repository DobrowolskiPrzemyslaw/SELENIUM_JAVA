package javaTips.podstawy;

import org.testng.annotations.Test;

public class Stringi {

    @Test
    public void string_(){
        String imie = "Arek";
        String nazwisko = "Włodarczyk";
        System.out.println(imie + " " + nazwisko);
        String daneOsobowe = imie + " " + nazwisko;

        System.out.println("Przyklad 1: " +daneOsobowe);
    }

    @Test
    public void string_2(){
        String imie3 = "Wiola";
        String Imie3 = "Wiola";
        System.out.println(imie3 == Imie3); // Porównanie stringów jest uproszczone
    }

    @Test
    public void string_3(){
        String imie3 = "Wiola";
        String Imie3 = "Wiola";
        Imie3 = "Arek";
        System.out.println(imie3 == Imie3); // Porównanie stringów jest uproszczone
        System.out.println("Przyklad 2: " +imie3);
        System.out.println("Przyklad 3: " +Imie3);
    }
}
