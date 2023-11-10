package Metodo_Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(3,6,9,12,15);

        List<Integer> dox = lista.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(dox);

    }
}
