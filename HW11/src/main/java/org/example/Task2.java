package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static String task2(List<String> names){
        return names
                .stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));

    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill","Ryan","Max","Bryan","David");
        System.out.println(task2(names));
    }
}
