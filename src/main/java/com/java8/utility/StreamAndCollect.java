//package com.java8.utility;
//
//import com.java8.model.Person;
//import org.hibernate.transform.ToListResultTransformer;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StreamAndCollect {
//
//
//    public static void main(String[] args) {
//
//        System.out.println("Stream,filter,collect");
//        List<String> lines = Arrays.asList("spring", "webflux", "reactive programming");
//        List<String> result = lines.stream()
//                .filter(n -> !"webflux".equals(lines))
//                .collect(Collectors.toList());
//
//        result.forEach(System.out::println);
//
//
//        System.out.println("Stream,filter,findany, orelse");
//        List<Person> personList = Arrays.asList(
//                new Person("ashik", "23", 1),
//                new Person("kushal", "22", 2),
//                new Person("sagar", "24", 3)
//        );
//
//        Person resulltSet = personList.stream()
//                .filter(x -> "ashik".equals(x.getName()))
//                .findAny()
//                .orElse(null);
//
//        System.out.println(resulltSet);
//
//
//        System.out.println("Filter and Map");
//
//
//        String name = personList.stream()
//                .filter(x -> "ashik".equals(x.getName()))
//                .map(Person::getName)
//                .findAny()
//                .orElse("");
//
//        System.out.println(name);
//
//        List<String> collect = personList.stream().map(Person::getName).collect(Collectors.toList());
//        collect.forEach(System.out::println);
//
//    }
//
//
//}
//
