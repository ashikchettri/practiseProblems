package com.java8.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {


    private int id;
    private String name;

    public MapToList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Few Examples to convert  a Map to a List

    // Map<String,String> map = new HashMap<>();
    //Java8 convert all Map keys to a list
    // List<String> result = map.keySet().stream().collect(Collectors.toList());
    //Java8 convert all Map values to a list
    // List<String> result1 = map.values().stream().collect(Collectors.toList());
    // List<String> result2 = map.values().stream().filter(x-> !"a".equalsIgnoreCase(x)).collect(Collectors.toList());

    public static void main(String[] args) {

        Map<Integer, String> param = new HashMap<>();
        param.put(1, "ashik");
        param.put(2, "sagar");
        param.put(3, "kushal");

        //simple map to list conversion
        System.out.println("Export map key to list");

        List<Integer> result = new ArrayList<>(param.keySet());
        result.forEach(System.out::println);

        System.out.println("Export map value to list");
        List<String> result1 = new ArrayList<>(param.values());
        result1.forEach(System.out::println);


        //Another way is to convert the Map into a stream, process it and then return back as list
        List<Integer> result2 = param.keySet().stream().collect(Collectors.toList());
        result2.forEach(System.out::println);
        List<String> result3 = param.values().stream().collect(Collectors.toList());
        result3.forEach(System.out::println);

        List<String> result4 = param.values().stream().filter(x -> !"ashik".equalsIgnoreCase(x)).collect(Collectors.toList());
        result4.forEach(System.out::println);


        //map.entrySet() to convert a Map into 2 List
        //split a map into 2 list
        List<Integer> resultSortedKey = new ArrayList<>();
        List<String> resultValues = param.entrySet().stream()
                //sort a Map by a key and stored in resultSortedKey
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .peek(e -> resultSortedKey.add(e.getKey()))
                .map(x -> x.getValue())
                //filter ashik and retrurn it to resultValues
                .filter(x -> !"ashik".equalsIgnoreCase(x))
                .collect(Collectors.toList());

        resultSortedKey.forEach(System.out::println);
        resultValues.forEach(System.out::println);


    }

}
