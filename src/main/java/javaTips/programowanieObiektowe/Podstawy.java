package javaTips.programowanieObiektowe;


public class Podstawy {

    public static void main(String[] arqs){

        Monitor obiektMonitor1 = new Monitor();
        obiektMonitor1.szerokosc = 50;
        obiektMonitor1.wysokosc = 50;
        obiektMonitor1.wlacz();
        obiektMonitor1.wylacz();

        Monitor obiektMonitor2 = new Monitor();
        obiektMonitor2.szerokosc = 150;
        obiektMonitor2.wysokosc = 150;
        obiektMonitor2.wlacz();
        obiektMonitor2.wylacz();
    }
}

// Dzieki klasa mozemy tworzyc obiekty - klasy to przepis, przechowuje informacje o tym co potrafi zrobic dany obiekt i jakie ma cechy/wlasciwosci
class Monitor{
    int szerokosc;
    int wysokosc;

    void wlacz(){
        System.out.println("wlaczylem monitor");
    }

    void wylacz(){
        System.out.println("wylaczylem monitor");
    }
}
