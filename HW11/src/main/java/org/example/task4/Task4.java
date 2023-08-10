package org.example.task4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class Task4 {
    private long a, c, m;
    private AtomicLong x;

    public Task4(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Task4 withSeed(long seed) {
        this.x = new AtomicLong(seed);
        return this;
    }

    public Stream<Long> genStream() {
        return Stream.iterate(x.get(), xn -> (a * xn + c) % m);
    }
}
