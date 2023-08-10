package org.example.task4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Test {
    public static void task4() {
        long a = 25214903917L;
        long c = 11L;
        long m = 2^48;

        Task4 task4 = new Task4(a,c,m);
        task4.withSeed(34);
        task4.genStream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }



}
