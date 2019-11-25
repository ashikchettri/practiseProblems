package com.java8.utility;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatSet {

    public static void main(String[] args) {

        Set<Book> set1 = new HashSet<>();
        Set<Book> set2 = new HashSet<>();

        set1.add(new Book("Core Java", "200"));
        set1.add(new Book("Spring Mvc", "300"));


        set2.add(new Book("Core Java", "200"));
        set2.add(new Book("GCP developer","400"));

        Set<Book> bks = Stream.concat(set1.stream(), set2.stream()).distinct().collect(Collectors.toSet());
        bks.forEach(b-> System.out.println(b.getName() + "," + b.getPrice()));

    }
}
