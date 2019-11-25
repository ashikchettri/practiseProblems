package com.java8.UtilStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractise {

    // Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and add them all up. What is the total?

    public int sumOfFive() {
        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    //  Convert and array of your best friends names into a stream. apply lowecase(withoud using var), then join them into 1 string separated by ','.

    public String getBestFriendNames(String[] bestFriendName) {

        return Arrays.stream(bestFriendName).map(String::toLowerCase).collect(Collectors.joining(","));
    }

//    Print all numbers between 5 and 15 (inclusive).

    public List<Integer> inclusiveNumber() {

        return IntStream.rangeClosed(5, 15)
                .boxed()
                .collect(Collectors.toList());
    }

    //  print all numbers between 5 exclusive and 15 inclusive.

    public List<Integer> exclusiveNumber() {
        return IntStream.rangeClosed(5, 10)
                .skip(1)
                .boxed()
                .collect(Collectors.toList());
    }

//    Convert the word "Porsche" to a list of 7 strings.







}
