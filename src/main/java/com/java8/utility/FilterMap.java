package com.java8.utility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMap {

    private int id;
    private String name;

    public FilterMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FilterMap{" +
                "id=" + id +
                "name=" + name + '\'' +
                '}';

    }

    //with java8, you can convert Map.entrySet() into stream, followed by filter() and collect() it .

    public static void main(String[] args) {

        Map<Integer, String> param = new HashMap<>();
        param.put(1, "ashik");
        param.put(2, "kushal");
        param.put(3, "sagar");

        //Map -> Stream -> Filter  -> String
        String result = param.entrySet().stream()
                .filter(x -> "ashik".equals(x.getValue()))
                .map(x -> x.getValue())
                .collect(Collectors.joining());

        System.out.println("in java8: " + result);

        //Map -> stream -> filter -> Map
        Map<Integer, String> map = param.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        //or like this
        Map<Integer, String> collect = param.entrySet().stream()
                .filter(x -> x.getKey() == 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        //filter  more values
        result = param.entrySet().stream()
                .filter(x -> {
                    if (!x.getValue().contains("ashik") && !x.getValue().contains("don")) {
                        return true;
                    }
                    return false;
                }).map(y -> y.getValue())
                .collect(Collectors.joining(","));

        System.out.println("Using more filter with java8 : " + result);


        //Another way to filter a map , return MAP this time
        Map<Integer, String> filterMap = param.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println("return the result in MAP " + filterMap);


        //Print all the values with a return type map
        Map<Integer, String> all = param.entrySet().stream()
                .filter(x -> x.getKey() <= 4)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(all);


        //Using java8 Predicate to filter a map


    }


}
