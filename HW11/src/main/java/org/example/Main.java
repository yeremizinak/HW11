package org.example;

import org.example.task4.Task4Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ryan", "Max", "Bryan", "David");
        String[] arr = {"1, 2, 0", "4, 5"};
        Stream<Integer> first = Stream.of(4, 0, 4, 0, 4);
        Stream<Integer> second = Stream.of(5, 0, 5, 0);

        System.out.println(Task1.odd(names));
        System.out.println(Task2.task2(names));
        System.out.println(Task3.task3(arr));
        Task4Test.task4();

        Stream<Integer> zipped = Task5.zip(first, second);
        String res = zipped
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        System.out.println(res);
    }
}