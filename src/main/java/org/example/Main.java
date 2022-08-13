package org.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int countOfNumbers = 10;
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(countOfNumbers)
                .map(y -> y[0])
                .forEach(System.out::println);
    }
}