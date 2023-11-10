package Metodo_Sorted;

import java.util.Arrays;
import java.util.List;

public class Number {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,4,7,8,3,0);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);
    }
}