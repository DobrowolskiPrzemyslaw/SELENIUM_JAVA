package javaTips.programowanieObiektowe;


public class KlasaBezKonstrukotra {

    public static void main(String[] arqs){

        //wywolujac konstruktor domyslny musimy recznie przypisac wartosci do pol klas
        Punkt p = new Punkt();
        p.x = 1;
        p.y = 2;

        System.out.println("p.x: " + p.x);
        System.out.println("p.y: " + p.y);
    }
}

class Punkt{
    int x;
    int y;
}

