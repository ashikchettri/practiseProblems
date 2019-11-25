package com.java8.utility;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMapSet {

    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }


    public static void main(String[] args) {

        StreamFlatMapSet student = new StreamFlatMapSet();
        student.setName("mkyong");
        student.addBook("java8 ebook");
        student.addBook("GCP ebook");

        StreamFlatMapSet student2 = new StreamFlatMapSet();
        student2.setName("ashik");
        student2.addBook("java11 notes");
        student2.addBook("aws webservice notes");

        List<StreamFlatMapSet> list = new ArrayList<>();
        list.add(student);
        list.add(student2);

        List<String> collect = list.stream()
                .map(x -> x.getBook())   //Stream<Set<String>>
                .flatMap(x -> x.stream())   //Stream<String>
                .distinct()
                .collect(Collectors.toList());


        collect.forEach(x -> System.out.println(x));


        //Stream + Primitive + flatMapToInt => for primitive type we can use flatMapToInt
        int[] number = {1, 2, 3, 4, 5, 6, 7};
        //1. Stream<int[]>
        Stream<int[]> streamArrays = Stream.of(number);
        //2. Stream<int[]> -> flatMapToInt -> IntStream
        IntStream intStream = streamArrays.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x -> System.out.println(x));



    }

}
