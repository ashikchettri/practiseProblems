package com.java8.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExamples {


    public static void main(String[] args) {


        //For each and Map loop(Normal Way)
        Map<String,Integer> param = new HashMap<>();
        param.put("A",11);
        param.put("B",22);
        param.put("C",33);
        param.put("D",44);

        for (Map.Entry<String,Integer> entry: param.entrySet()){
            System.out.println("Item= "+ entry.getKey() + " values=" + entry.getValue());
        }

        System.out.println("\n");
        System.out.println("using java8 foreach and lambda");
        //java8...forEach with lambda expression
        param.forEach((k,v)-> System.out.println("Item:" + k + " values: " + v));

        //for each with a equals conditions
        System.out.println("\n");
        param.forEach((k,v)->{
            System.out.println("Items "+ k + " values" + v);
            if ("B".equals(k)){
                System.out.println("Hello ashik");
            }
        });

        System.out.println("\n");
        System.out.println("For each and list examples");
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");


        //normal way to for-loop to loop a list
        for (String item: items){
            System.out.println(item);

        }
        System.out.println("\n");
        System.out.println("loop list with a forEach and lambda");
        //loop a list with forEach and lambda expression
        items.forEach(item-> System.out.println(item));

        System.out.println("\n");
        System.out.println("forEach with a equal condition ");
        //forEach with a equals conditions
        items.forEach(item->{
            if ("C".equals(item)){
                System.out.println(item);
            }
        });

        System.out.println("\n");
        System.out.println("method reference ");
        items.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("Stream and filter");
        items.stream().filter(s->s.contains("B"))
                        .forEach(System.out::println);

    }

    }




