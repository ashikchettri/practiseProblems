package com.java8.UtilStream;

import com.google.common.primitives.Ints;
import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PractiseStream {

    // Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and add them all up. What is the total?

    public int sumOfNumbers() {

        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Convert and array of your best friends names into a stream. apply lowecase(withoud using var), then join them into 1 string separated by ','.

    public String friendsName(String[] names) {
        return Arrays.stream(names).map(String::toLowerCase).collect(Collectors.joining(","));
    }

//    Print all numbers between 5 and 15 (inclusive).

    public List<Integer> printInclusive() {
        return IntStream.rangeClosed(5, 10).boxed().collect(Collectors.toList());
    }

//    print all numbers between 5 exclusive and 15 inclusive.

    public List<Integer> fiveExclusive() {
        return IntStream.rangeClosed(5, 10).skip(1).boxed().collect(Collectors.toList());
    }

//    print all numbers between 5 inclusive and 15 exclusive.

    public List<Integer> fiveInclusiveAndTenExclusive() {
        return IntStream.range(5, 10).boxed().collect(Collectors.toList());
    }

//    Take a list of Australian capital cities and sort them.

    public List<String> cities(List<String> capitals) {

        return capitals.stream().sorted().collect(Collectors.toList());
    }


//    Take a list of Australian capital cities and reverse everyone of them.

    public List<String> australianCapital(List<String> cities) {

        return cities.stream().map(s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }).collect(Collectors.toList());
    }


//    Convert the word "Porsche" to a list of 7 strings.

    public List<String> porsche(String listing) {

        return Arrays.stream(listing.split("")).collect(Collectors.toList());
    }

   // Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and add them all up. What is the total?



}


