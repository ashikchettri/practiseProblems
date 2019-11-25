package com.java8.utility;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String[] args) {

        //Convert array to stream- you can use stream.of or Arrays.stream
        String[] letter = {"a", "b", "c", "d", "e"};

        //using Arrays.stream()
        Stream<String> param = Arrays.stream(letter);
        param.forEach(x -> System.out.println(x));

        //using Stream.of

        Stream<String> result = Stream.of(letter);
        result.forEach(x -> System.out.println(x));

        //Primitive Array

        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(numbers);
        intStream1.forEach(x -> System.out.println(x));

        Stream<int[]> temp = Stream.of(numbers);

        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));
    }
}
