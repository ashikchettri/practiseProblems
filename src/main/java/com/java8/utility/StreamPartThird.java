package com.java8.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPartThird {

    public static void main(String[] args) {
        System.out.println("the total amount is " + streamOfIntegers());
    }


    // Create a stream of 1000 integers(starting at 1), skip ones that are not multiple of 5 and add them all up. What is the total?
    public static int streamOfIntegers(){

        return IntStream.rangeClosed(1,1000)
                        .boxed()
                        .filter(n-> n % 5 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();
    }

  //  Convert and array of your best friends names into a stream. apply lowecase(withoud using var), then join them into 1 string separated by ','.

    public static String names(String[] friends){

        String[] friendsNames = {"ashik","sagar","kushal"};

        return Arrays.stream(friendsNames)
                      .map(String::toLowerCase)
                      .collect(Collectors.joining(","));
    }


//    Print all numbers between 5 and 15 (inclusive).



public List<Integer> number(int a , int b){
        return IntStream.rangeClosed(5,15)
                        .boxed()
                        .collect(Collectors.toList());
}

public List<Integer> numberCheck(int a, int b){
        return IntStream.range(5,15)
                        .boxed()
                        .collect(Collectors.toList());
}






}