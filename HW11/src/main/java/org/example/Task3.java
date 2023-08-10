package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static String task3(String[] array) {
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String[] tempArr = array[i].split(",\\s");
            for (int j = 0; j < tempArr.length; j++) {
                numbers.add(tempArr[j]);
            }
        }

        return numbers
                .stream()
                .sorted()
                .collect(Collectors.joining(", "));

    }
}
