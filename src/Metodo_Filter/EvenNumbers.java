package Metodo_Filter;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66,77, 88, 99, 100);

        List<Integer> identifyEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + identifyEvenNumbers);
    }
}