package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Andrii", "Peter", "Vasyl", "Dima");
        String result = GetUnpairedNames(names);
        System.out.println(result);
    }

    public static String GetUnpairedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}



