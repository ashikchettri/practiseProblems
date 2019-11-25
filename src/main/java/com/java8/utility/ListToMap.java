package com.java8.utility;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {

    private int Id;
    private String name;
    private long websites;

    public ListToMap(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites() {
        this.websites = websites;
    }

    @Override
    public String toString() {
        return "ListToMap{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", websites=" + websites +
                '}';
    }


    public static void main(String[] args) {

        List<ListToMap> param = new ArrayList<>();
        param.add(new ListToMap(1, "ashik.com", 8000000));
        param.add(new ListToMap(2, "kushalcom", 900000));
        param.add(new ListToMap(3, "sagar.com", 700000));

        param.add(new ListToMap(3, "sagar.com", 1));

        // getting the id and name
        Map<Integer, String> check = param.stream().collect(Collectors
                .toMap(ListToMap::getId, ListToMap::getName, (oldValue, newValue) -> oldValue));
        System.out.println("result" + check);

        //getting the id and websites
        Map<Integer, Long> second = param.stream().collect(Collectors.
                toMap(ListToMap::getId, ListToMap::getWebsites, (oldValue, newValue) -> oldValue));
        System.out.println("result 2" + second);

        //getting the name and websites
        Map<String, Long> third = param.stream().collect(Collectors
                .toMap(ListToMap::getName, ListToMap::getWebsites, (oldValue, newValue) -> newValue));
        System.out.println("result3" + third);


        //sort the map and collect it
        Map sortMap = param.stream()
                .sorted(Comparator.comparingLong(ListToMap::getWebsites).reversed())
                .collect(
                        Collectors.toMap(
                                ListToMap::getName, ListToMap::getWebsites,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new              //return a linkedhashMap, keep order
                        )
                );

        System.out.println("sorted result " + sortMap);

    }

}