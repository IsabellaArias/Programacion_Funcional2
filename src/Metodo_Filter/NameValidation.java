package Metodo_Filter;

import java.util.Arrays;
import java.util.List;

public class NameValidation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Brenda", "Manuela", "kimberly", "Amadeus", "Carla Maria");

        List<String> NamesValidation = names.stream()
                .filter(e -> e.length() > 7)
                .toList();

        NamesValidation.forEach(System.out::println);
    }
}

