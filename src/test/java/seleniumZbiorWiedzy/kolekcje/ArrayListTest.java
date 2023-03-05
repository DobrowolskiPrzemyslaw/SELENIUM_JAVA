package seleniumZbiorWiedzy.kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public  class ArrayListTest {

    @Test
    public void test(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));
        System.out.println("Wielkosc listy" + cars.size());

        List<String> sortedList = cars.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        cars.clear();
        System.out.println("Lista po czyszczeniu" + cars);
        System.out.println("Wielkosc listy" + cars.size());
    }

    @Test
    public void petlaPoLiscie() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    @Test
    public void petlaPoLiscie2() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars) {
            System.out.println(i);
        }
    }

    @Test
    public void petlaPoLiscie3() {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }

    @Test
    public void sortowanieListy() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
