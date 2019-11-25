package com.java8.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPartSecond {

//  Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and add them all up. What is the total?

    public int multipleOfFive() {
        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

    }


    // Convert and array of your best friends names into a stream. apply lowecase(withoud using var), then join them into 1
    // string separated by ','.


    public String names(String[] friendsName) {
        return Arrays.stream(friendsName).map(String::toLowerCase).collect(Collectors.joining(","));

    }


//    Print all numbers between 5 and 15 (inclusive).

    public List<Integer> getNumbers(int a, int b) {
        return IntStream.rangeClosed(a, b).boxed().collect(Collectors.toList());
    }


//    print all numbers between 5 inclusive and 15 exclusive.

    public List<Integer> getExclusive(int a, int b) {
        return IntStream.range(a, b).boxed().collect(Collectors.toList());
    }


    //    Take a list of Australian capital cities and reverse everyone of them.
    public List<String> capitalCity(List<String> citites) {
        return citites.stream().map(s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }).collect(Collectors.toList());
    }



//    Take a list of Australian capital cities and sort them.

    public List<String> cities(List<String> capital){
        return  capital.stream().sorted().collect(Collectors.toList());

    }


//  Convert the word "Porsche" to a list of 7 strings.

    public List<String> convertWord(String car){
        return Arrays.stream(car.split("")).collect(Collectors.toList());

    }






}