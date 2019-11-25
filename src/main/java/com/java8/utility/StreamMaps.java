package com.java8.utility;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Collectors;

public class StreamMaps {


    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        //  System.out.println(collect);


        //List of object -> list of other object
        List<Developer> dev = Arrays.asList(
                new Developer("ashik", 11, new BigDecimal("33232")),
                new Developer("kiran", 22, new BigDecimal("32233")),
                new Developer("sagar", 33, new BigDecimal("5643"))
        );


    }


}