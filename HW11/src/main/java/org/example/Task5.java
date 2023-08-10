package org.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iter1 = first.iterator();
        Iterator<T> iter2 = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        while (iter1.hasNext() && iter2.hasNext()) {
            builder.accept(iter1.next());
            builder.accept(iter2.next());
        }
        return builder.build();
    }
}
