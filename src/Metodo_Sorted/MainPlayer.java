package Metodo_Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;


public class MainPlayer {
    public static void main(String[] args) {
        List<Player> records = Arrays.asList(
                new Player("John",234122,4),
                new Player("Isabella",500982,2),
                new Player("Carlos",493212,3),
                new Player("Mike",999999,1)
        );
        List<Player> eRanks = records.stream()
                .filter(e -> e.getRank() < 4)
                .sorted(Comparator.comparing(Player::getRank))
                .toList();
        eRanks.forEach(p -> System.out.println(p.getName() + " " + p.getPoints()));
    }
}
