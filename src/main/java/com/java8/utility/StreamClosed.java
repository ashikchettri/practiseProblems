package com.java8.utility;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamClosed {

    public static void main(String[] args) {

        // In java8, stream will be closed once it has been used or consumed

        String[] array = {"A", "b", "c", "D"};

        Stream<String> letters = Arrays.stream(array);

        letters.forEach(x -> System.out.println(x));

        //reusing this stream again will throw an IllegalStateException which means stream is closed


        //if you want to reuse the stream then you can use streamSupplier as below
        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new stream
        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another new stream
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);


    }
}
