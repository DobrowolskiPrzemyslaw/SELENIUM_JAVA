package javaTips.programowanieObiektowe;


public class KlasaZKonstrukotrem {

    public static void main(String[] arqs){

        //wywolujac konstruktor domyslny musimy recznie przypisac wartosci do pol klas lub bazowac na wartosciach domyslny z konstruktora domyslnego
        Punkt2 p = new Punkt2();
        p.x = 1;
        p.y = 2;

        System.out.println("p.x: " + p.x);
        System.out.println("p.y: " + p.y);

        //przypisanie wartosci pol klas nastepuje podczas tworzenia obiektow - to nam daja konstruktory
        Punkt2 p2 = new Punkt2(5,3);
        System.out.println("p.x: " + p2.x);
        System.out.println("p.y: " + p2.y);
    }
}

class Punkt2{

    //konstruktor domyslny
    Punkt2(){
        x = 20;
        y = 20;
    }

    //konstruktor niedomyslny
    Punkt2(int pierwszy){
        x = pierwszy;
        y = 20;
    }

    //konstruktor niedomyslny
    Punkt2(int x, int y){
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}

