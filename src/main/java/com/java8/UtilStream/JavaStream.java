package com.java8.UtilStream;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

    //  Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and
    //  add them all up. What is the total?
    public long multipleNumber() {

        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    //    Convert and array of your best friends names into a stream. apply lowecase(withoud using var),
//    then join them into 1 string separated by ','.
    public String names(String[] names) {
        return Arrays.stream(names).map(String::toLowerCase).collect(Collectors.joining(","));
    }

    //Print all numbers between 5 and 15 (inclusive).
    public List<Integer> inclusiveNumber() {

        return IntStream.rangeClosed(5, 12)
                .boxed()
                .map(Integer::intValue)
                .collect(Collectors.toList());
    }

    //  print all numbers between 5 inclusive and 15 exclusive.

    public List<Integer> getExclusiveNumbers() {
        return IntStream.range(5, 12)
                .boxed()
                .map(Integer::intValue)
                .collect(Collectors.toList());
    }

    // Take a list of Australian capital cities and reverse everyone of them.

    // Take a list of Australian capital cities and sort them.

    public List<String> sortNames(String[] cities) {

        return Arrays.stream(cities).sorted().collect(Collectors.toList());

    }


}
