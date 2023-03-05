package javaTips.podstawy;

import org.testng.annotations.Test;

public class Petle {
    String[] kursyProgramowania =
            {
                    "Java",
                    "Java Aplikacje",
                    "Java Strumienie",
                    "Java Aspekty Zaawansowane",
                    "Java Android",
                    "C#",
                    "C# Tworzenie Aplikacji",
                    "C# LINQ",
                    "Pascal"
            };

    int i = 0;

    @Test //Petla WHILE - gdy nie wiem ile razy ma sie wykonac petla
    public void while_() {
        while (i < kursyProgramowania.length) {
            System.out.println("Petala WHILE: " + kursyProgramowania[i]);
            i++;
        }
    }

    @Test //Petla DO WHILE - gdy petla ma sie wykonac minimum raz
    public void do_While() {
        i = 0;
        do {
            System.out.println("Petala DO WHILE: " + kursyProgramowania[i]);
            i++;
        } while (i < kursyProgramowania.length);
    }

    @Test //Petla FOR - gdy wiem ile razy ma sie wykonac petla
    public void for_() {
        for(int k = 0;k < kursyProgramowania.length;k++){
            System.out.println("Petala FOR: " +kursyProgramowania[k]);
        }
    }

    @Test //Petla FOR - gdy wiem ile razy ma sie wykonac petla
    public void for_In_For() {
        for(int i = 1;i <= 10;i++){
            for(int k = 1;k <= 10;k++){
                System.out.print(i*k);
            }
            System.out.println("");
        }
    }

    @Test //BREAK - przerywa dzialanie petli (wyrzuci wszytko co bylo przed ta iteracja
    public void for_Break() {
        for(int n = 0;n < 10;n++){
            if(n==4)
                break;
            System.out.println("BREAK: " + n);
        }
    }

    @Test //CONTINUE - wywala pojedyncza dana iteracje
    public void for_Continue() {
        for(int n = 0;n < 10;n++){
            if(n==4)
                continue;
            System.out.println("CONTINUE: "+ n);
        }
    }

    @Test //FOREACH - dla przejescia po zbiorze (wielkosc zbioru moze sie zmieniac)
    public void foreach_() {
        for(String nazwaKursu: kursyProgramowania){
            System.out.println("Petala FOREACH: " + nazwaKursu);
        }
    }
}
