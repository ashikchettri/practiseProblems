package com.java8.utility;

import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValueFromStream {

    public static void main(String[] args) {

        Stream<String> words = Stream.of("kubernets", "gcp", "java8", null, "angularjs", "react", null);
        List<String> result = words
                .filter(x -> x != null)
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        //another way to remove null is by using filter(Objects::nonNull)
        // List<String> checkResult = words.filter(Objects::nonNull).collect(Collectors.toList());
    }
}
