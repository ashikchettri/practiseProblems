package com.java8.utility;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.stream.Collectors;

public class SortAmap {

    public static void main(String[] args) {

        //step to sort in java8
            // -> Convert a map into stream
            // -> sort it
            // -> collect and return a new LinkedHashMap(keep the order)

//        Map result = map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//

        // By default collectors.toMap will return a HashMap


        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("a", 11);
        mapping.put("y",22);
        mapping.put("t",23);
        mapping.put("p",43);
        mapping.put("j",15);

//        Map<String,Integer> result2 = new LinkedHashMap<>();
//        unsortMap.entrySet().stream()
//                    .sorted(Map.Entry.comparingByKey())
//                    .forEachOrdered(x-> result2.put(x.getKey(), x.getValue()));
//
//        System.out.println("sorted");
//        System.out.println(result2);

        //Map<Object,Object> Stream cant sort this directly. First, convert it into Map<String,String>

        Properties properties = System.getProperties();
        Set<Map.Entry<Object,Object>> entries = properties.entrySet();

        LinkedHashMap<String,String> collect = entries.stream()
                                                        .collect(Collectors.toMap(k -> (String) k.getKey(), e-> (String) e.getValue()))
                                                        .entrySet()
                                                        .stream()
                                                            .sorted(Map.Entry.comparingByKey())
                                                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                                                                , (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        collect.forEach((k,v)-> System.out.println(k + "" + v));

    }
}
