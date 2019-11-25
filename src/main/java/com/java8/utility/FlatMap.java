package com.java8.utility;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FlatMap {

    //In java8 streams can hold different data types
//    Stream<String[]>
//    Stream<Set<String>>
//    Stream<List<String>>
//    Stream<List<Object>>
    //But the stream operations like filter,sum,distinct,collectors do not support it.so we need flatMap() to do the conversion.

//    Stream<String[]> -> flatMap  -> Stream<String>
//    Stream<Set<String>> -> flatMap -> Stream<String>
//    Stream<List<String>> -> flatMap -> Stream<String>
//    Stream<List<Object>> -> flatMap -> Stream<Object>
//
//    How flatMap works ??
//        {{1,2},{3,4},{5,6}} -> flatMap -> {1,2,3,4,5,6}
//        {{'a','b'},{'c','d'},{'e','f'}} -> flatMap -> {'a','b','c','d','e','f'}


    public static void main(String[] args) {

        //1) STREAM + STRING[] + FLATMAP
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        //STREAM<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a  stream of String[], and return a string[]
//        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));
//        stream.forEach(System.out::println); // this prints empty because filter doesn't know how to filter a stream of String[].


        //1.1)Now lets use flatMap to convert Stream<String[]> to Stream<String>

        Stream<String> flatMapUsed = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> streamCheck = flatMapUsed.filter(x -> "a".equals(x.toString()));
        streamCheck.forEach(System.out::println);


    }
}
