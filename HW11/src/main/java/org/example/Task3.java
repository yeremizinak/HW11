package org.example;

import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static String task3(String[] array) {
        String result = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        return result;
    }
}
