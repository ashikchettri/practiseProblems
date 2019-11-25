package com.java8.utility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatListDemo {

    public static void main(String[] args) {

        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();

        list1.add(new Book("gcp book", "900"));
        list1.add(new Book("sbi life", "500"));

        list2.add(new Book("gcp book", "900"));
        list2.add(new Book("rayban", "333"));

        List<Book> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        list.forEach(b-> System.out.println(b.getName() + "," + b.getPrice()));


    list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
    list.forEach(c-> System.out.println(c.getName() + "," + c.getPrice()));
    }
}
