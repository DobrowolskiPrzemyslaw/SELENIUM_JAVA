package javaTips.streems;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoardGame {

    // https://www.samouczekprogramisty.pl/strumienie-w-jezyku-java/

    public final String name;
    public final double rating;
    public final BigDecimal price;
    public final int minPlayers;
    public final int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) throws FileNotFoundException {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public static void main(String[] args) throws FileNotFoundException {

        // List of games
        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        System.out.println("------------------------------------------------------------------------------------------");
        for (BoardGame game : games) {
            if (game.maxPlayers > 4) {
                if (game.rating > 8) {
                    if (new BigDecimal(150).compareTo(game.price) > 0) {
                        System.out.println(game.name.toUpperCase());
                    }
                }
            }
        }

        System.out.println("------------------------------------------------------------------------------------------");
        games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------------------------");
        long wielkosc = games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .count();
        System.out.println(wielkosc);

        System.out.println("------------------------------------------------------------------------------------------");
        List lista = games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(lista.get(0));
        System.out.println(lista.size());
    }

//    filter – zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true,
//    map – każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu,
//    peek – pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami,
//    limit – zwraca strumień ograniczony do zadanej liczby elementów, pozostałe są ignorowane.

//    forEach – wykonuje zadaną operację dla każdego elementu,
//    count – zwraca liczbę elementów w strumieniu,
//    allMatch – zwraca flagę informującą czy wszystkie elementy spełniają warunek. Przestaje sprawdzać na pierwszym elemencie, który tego warunku nie spełnia,
//    collect – pozwala na utworzenie nowego typu na podstawie elementów strumienia. Przy pomocy tej metody można na przykład utworzyć listę. Klasa Collectors zawiera sporo gotowych implementacji.
}