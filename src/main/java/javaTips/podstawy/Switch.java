package javaTips.podstawy;

import org.testng.annotations.Test;

public class Switch {

    @Test
    public void pswitch_1() {
        // nie mozemy tu porownywac Stringa, double
        int x =3;
        switch (x){
            case 0: System.out.println("Wykonam sie bo x jest rowny 0");
            case 1: System.out.println("Wykonam sie bo x jest rowny 1 lub nie postawiles breaka debilu");
            case 2: System.out.println("Wykonam sie bo x jest rowny 2 lub nie postawiles breaka debilu");
            case 3: System.out.println("Wykonam sie bo x jest rowny 3 lub nie postawiles breaka debilu");
            case 4: System.out.println("Wykonam sie bo x jest rowny 4 lub nie postawiles breaka debilu");
            case 5: System.out.println("Wykonam sie bo x jest rowny 5 lub nie postawiles breaka debilu");
            default:  System.out.println("Wykonam sie bo x jest nie jest rowny powzszym przypadka lub nie postawiles breaka debilu");
        }
    }

    @Test
    public void pswitch_2() {
        int x =3;
        switch (x){
            case 0: System.out.println("Wykonam sie bo x jest rowny 0");
                break;
            case 1: System.out.println("Wykonam sie bo x jest rowny 1 lub nie postawiles breaka debilu");
                break;
            case 2: System.out.println("Wykonam sie bo x jest rowny 2 lub nie postawiles breaka debilu");
                break;
            case 3: System.out.println("Wykonam sie bo x jest rowny 3 lub nie postawiles breaka debilu");
                break;
            case 4: System.out.println("Wykonam sie bo x jest rowny 4 lub nie postawiles breaka debilu");
                break;
            case 5: System.out.println("Wykonam sie bo x jest rowny 5 lub nie postawiles breaka debilu");
                break;
            default:  System.out.println("Wykonam sie bo x jest nie jest rowny powzszym przypadka lub nie postawiles breaka debilu");
        }
    }

    @Test
    public void pswitch_3() {
        int x ='+';
        switch (x){
            case '!': System.out.println("Wykonam sie bo x jest rowny !");
                break;
            case '?': System.out.println("Wykonam sie bo x jest rowny ? lub nie postawiles breaka debilu");
                break;
            case '+': System.out.println("Wykonam sie bo x jest rowny + lub nie postawiles breaka debilu");
                break;
            case '-': System.out.println("Wykonam sie bo x jest rowny - lub nie postawiles breaka debilu");
                break;
            case '*': System.out.println("Wykonam sie bo x jest rowny * lub nie postawiles breaka debilu");
                break;
            case '/': System.out.println("Wykonam sie bo x jest rowny / lub nie postawiles breaka debilu");
                break;
            default:  System.out.println("Wykonam sie bo x jest nie jest rowny powzszym przypadka lub nie postawiles breaka debilu");
        }
    }

    @Test
    public void pswitch_4() {
        int x =3; // nie mozemy tu porownywac Stringa, double
//        double x =3.1; // nie mozemy tu porownywac Stringa, double
//        String x ="3.1"; // nie mozemy tu porownywac Stringa, double
        switch (x){
            case 0: System.out.println("Wykonam sie bo x jest rowny 0");
                break;
            case 1: System.out.println("Wykonam sie bo x jest rowny 1 lub nie postawiles breaka debilu");
                break;
            case 2: System.out.println("Wykonam sie bo x jest rowny 2 lub nie postawiles breaka debilu");
                break;
            case 3: System.out.println("Wykonam sie bo x jest rowny 3 lub nie postawiles breaka debilu");
                break;
            case 4: System.out.println("Wykonam sie bo x jest rowny 4 lub nie postawiles breaka debilu");
                break;
            case 5: System.out.println("Wykonam sie bo x jest rowny 5 lub nie postawiles breaka debilu");
                break;
            default:  System.out.println("Wykonam sie bo x jest nie jest rowny powzszym przypadka lub nie postawiles breaka debilu");
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
