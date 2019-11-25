package com.java8.utility;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsGroupingBy {

    public static void main(String[] args) {


//        List<String> items = Arrays.asList("apple", "banana", "apple", "apple", "orange", "banana", "papaya");
//
//
//        Map<String, Long> result =
//
//                items.stream().collect(
//                        Collectors.groupingBy(
//                                Function.identity(), Collectors.counting()
//                        )
//                );
//
//        Map<String, Long> finalMap = new LinkedHashMap<>();
//
//        //sort  a map and add to finalMap
//        result.entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue()
//                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
//
//        System.out.println(finalMap);
//        System.out.println(result);


        ///// List objects - examples to group by a list of user defined.

        List<Developer> dev = Arrays.asList(
                new Developer("ashik", 23, new BigDecimal("100")),
                new Developer("sagar", 24, new BigDecimal("200")),
                new Developer("kushal", 26, new BigDecimal("300")),
                new Developer("kiran", 27, new BigDecimal("400")),
                new Developer("sagar", 24, new BigDecimal("200")),
                new Developer("sagar", 24, new BigDecimal("200")),
                new Developer("kushal", 26, new BigDecimal("300"))
        );

        Map<String, Long> counting = dev.stream().collect(
                Collectors.groupingBy(Developer::getName, Collectors.counting()));

        System.out.println(counting);


        Map<String, Integer> sum = dev.stream().collect(
                Collectors.groupingBy(Developer::getName, Collectors.summingInt(Developer::getAge)));

        System.out.println(sum);


        //Group by price -Collectors.groupingBy and Collectors.mapping

        Map<BigDecimal, List<Developer>> groupByPriceMap = dev.stream().collect(Collectors.groupingBy(Developer::getSalary));

        System.out.println(groupByPriceMap);

        System.out.println("mapping to convert List<Item> to Set<String>");
        //group by prices, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> result = dev.stream().
                collect(Collectors.groupingBy(Developer::getSalary, Collectors.mapping(Developer::getName, Collectors.toSet())));

        System.out.println(result);

    }

}
