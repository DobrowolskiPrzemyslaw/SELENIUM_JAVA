package javaTips.kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Listy {

    @Test
    public void list() {
        List<String> lista = new ArrayList<>();
        lista.add("Pawel");
        lista.add("Adam");
        lista.add("Ania");
        lista.add("Mateusz");
        lista.add("Michal");

        System.out.println(lista.get(0));
        System.out.println(lista.indexOf("Adam"));
        System.out.println(lista.lastIndexOf("Adam"));
        System.out.println(lista.contains("Adam"));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());

        List<String> newlista = new ArrayList<>();
        newlista.add("Mateusz");
        lista.addAll(newlista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String elemet : lista) {
            System.out.println(elemet);
        }
    }

    @Test
    public void list2() {
        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);
        listaInt.add(12);
        listaInt.add(13);
        listaInt.add(11);
        listaInt.add(14);

        System.out.println(listaInt.get(0));
        System.out.println(listaInt.indexOf(12));
        System.out.println(listaInt.lastIndexOf(12));
        System.out.println(listaInt.contains(14));
        System.out.println(listaInt.size());
        System.out.println(listaInt.isEmpty());
    }
}
