package com.bridgelab;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6,8,9);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
