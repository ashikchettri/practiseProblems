package com.java8.utility;

import java.util.stream.Stream;

public class ConcatStream {


    public static void main(String[] args) {


        Stream<String> s1 = Stream.of("AA","BB","CC");
        Stream<String> s2 = Stream.of("AA","BB","CC");
        Stream<String> s = Stream.concat(s1 ,s2);
        s.forEach(e-> System.out.println(e + ""));


        //remove duplicate using streams
        Stream<String> a1 = Stream.of("AA", "BB", "CC");
        Stream<String> a2 = Stream.of("AA", "BB", "CC");
        Stream<String> b = Stream.concat(a1, a2).distinct();
        b.forEach(e -> System.out.println(e + ""));

    }
}
