package com.java8.utility;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfIntegers {


    public static void main(String[] args) {
        getNumberBetweenFiveandFifteen(5, 15);
        get15Exclusive(5, 15);

    }

    public int getSum() {

        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .filter(n -> n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }


    public static List<Integer> getNumberBetweenFiveandFifteen(int from, int to) {

        return IntStream.rangeClosed(from, to)
                .boxed()
                .collect(Collectors.toList());

    }

    public List<Integer> getFiveExclusive() {

        return IntStream.rangeClosed(5, 15)
                .boxed()
                .skip(1)
                .collect(Collectors.toList());
    }

    public static List<Integer> get15Exclusive(int from, int to) {

        return IntStream.range(from, to)
                .boxed()
                .collect(Collectors.toList());
    }

//    Convert and array of your best friends names into a stream. apply lowecase(withoud using var),
//    then join them into 1 string separated by ','.


    public String getNames(String[] names) {
        return Arrays.stream(names).map(String::toLowerCase).collect(Collectors.joining(","));

    }

//    Take a map of Australian states and their capital cities and
//    a. create a list of cities out of it.
//    b.create a list of states out of it.
//    c.apply transformation such that the map becomes a new map with abbreviated statenames as key


    public List<String> states(Map<String, String> cities) {
        return cities.keySet().stream().sorted().collect(Collectors.toList());
    }

    public List<String> cities(Map<String, String> citi) {
        return citi.values().stream().sorted().collect(Collectors.toList());
    }


    public Map<String,String> abbrev(Map<String,String> states){

        Map<String, String> abb = new HashMap<>();

        states.entrySet().stream().forEach(
                entry -> {
                    if (entry.getKey().contains(" ")) {
                        String[] token = entry.getKey().split(" ");
                        StringBuilder builder = new StringBuilder();
                        for (int i = 0; i < token.length; i++) {
                            builder.append(token[i].charAt(0));
                        }
                        abb.put(builder.toString().toUpperCase(), entry.getValue());
                    } else {
                        String abbrv = entry.getKey().substring(0, 3);
                        abb.put(abbrv.toUpperCase(), entry.getValue());
                    }
                });

        return abb;
    }


//    Take a list of Australian capital cities and reverse everyone of them.

    public List<String> reverse(List<String> citiies){

        return citiies.stream().map(s ->{
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() -1; i>= 0; i--){
                sb.append(s.charAt(i));
            }
            return sb.toString();
                }).collect(Collectors.toList());
    }



//    Take a list of Australian capital cities and sort them.


    public List<String> capitalCities(List<String> citi){
        return citi.stream().sorted().collect(Collectors.toList());
    }


//    Convert the word "Porsche" to a list of 7 strings.

    public List<String> listString(String word){
        return Arrays.stream(word.split("")).collect(Collectors.toList());
    }








}


