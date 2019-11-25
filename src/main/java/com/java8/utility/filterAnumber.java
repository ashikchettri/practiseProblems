package com.java8.utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filterAnumber {

    public static void main(String[] args) {

        Stream<String> words = Stream.of("ashik","sagar","kushal");
        List<String> result = words.collect(Collectors.toList());
        result.forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        List<Integer> num = numbers.filter(x-> x!= 3).collect(Collectors.toList());
        num.forEach(x-> System.out.println(x));
    }
}
