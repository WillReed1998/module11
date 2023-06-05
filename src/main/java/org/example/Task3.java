package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        List<String> list = Arrays.asList(array)
       .stream()

                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(String::trim)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}


