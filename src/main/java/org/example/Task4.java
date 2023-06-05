package org.example;

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> Endless = randomizer(a, c, m);
        Endless.forEach(System.out::println);
    }

    public static Stream<Long> randomizer(long a, long c, long m) {
        long seed = System.currentTimeMillis();
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
