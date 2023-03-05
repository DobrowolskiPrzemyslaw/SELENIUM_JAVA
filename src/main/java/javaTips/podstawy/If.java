package javaTips.podstawy;

import org.testng.annotations.Test;

public class If {

    @Test
    public void if_przyklad() {
        int a = 1;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a != b);
        if (true) {
            System.out.println("Wykonam sie bo true");
        }
    }

    @Test
    public void if_przyklad2() {
        if (1==1) {
            System.out.println("Wykonam sie bo true");
        }
    }

    @Test
    public void if_przyklad3() {
        if (false) {
            System.out.println("Nie wykonam sie bo false");
        }
    }

    @Test
    public void if_przyklad4() {
        if (1==2) {
            System.out.println("Nie wykonam sie bo false");
        }
    }

    @Test
    public void if_przyklad5() {
        if(!(1==1)){
            System.out.println("Nie wykonam sie bo false");
        }
    }

    @Test
    public void if_przyklad6() {
        if(!(1==1)){
            System.out.println("Nie wykonam sie bo false");
        }else{
            System.out.println("Wykonam sie bo poprzednie sie nie wykonalo");
        }
    }

    @Test
    public void if_przyklad7() {
        if(!(1==1)){
            System.out.println("Nie wykonam sie bo false");
        }else if(1==1) {
            System.out.println("Wykonam sie bo true i poprzednie sie nie wykonalo");
        }else {
            System.out.println("Nie wykonam sie bo poprzednie sie wykonalo");
        }
    }

    @Test
    public void if_przyklad8() {
        if(1==1){
            System.out.println("Wykonam sie bo true");
        }else if(2==2) {
            System.out.println("Nie wykonam sie mimo true bo poprzednie sie nie wykonalo");
        }else {
            System.out.println("Nie wykonam sie bo poprzednie sie wykonalo");
        }
    }

    @Test
    public void if_przyklad9() {
        if(1==1 && 2==2) {
            System.out.println("Wykonam sie bo oba true");
        }
    }

    @Test
    public void if_przyklad10() {
        if(1==1 || 2<=1 || 1==3) {
            System.out.println("Wykonam sie bo przynajmniej jedno true");
        }
    }

    @Test
    public void wyrazenieLogiczne() {
        int n = 5;
        String czyParzysta =  n%2 == 0 ? "parzysta" : "nieparzyta";
        System.out.println(czyParzysta);
    }

    @Test
    public void wyrazenieLogiczne2() {
        int n = 5;
        String czyParzysta =  n%2 == 0 ? "parzysta" : "nieparzyta";
        System.out.println("wypisz cos bez sensu");
    }
}
