package com.bridgelab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ItreateElement {
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<String> list = Arrays.asList("London", "HongKong","Paris", "NewYork");

        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
