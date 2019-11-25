package com.java8.prologProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrologList {


    //Find the last element of a list. = > [a,b,c,d,e]

//    public String getLastElement(List<String> letters) {
//
//        long countElement = letters.stream().count();
//        Stream<String> checkLetters= letters.stream();
//        return  checkLetters.skip(countElement -1).findFirst().get();
//
//    }

//
//    public static void main(String[] args) {
//
//
//           List<String> valueList = new ArrayList<String>();
//           valueList.add("ashik");
//           valueList.add("kushal");
//           valueList.add("sagar");
//           valueList.add("nischal");
//
//
//           long count = valueList.stream().count();
//           Stream<String> words = valueList.stream();
//        System.out.println(words.skip(count -1).findFirst().get());
//
//    }

    //Find the last element of the list

    public String lastElement(List<String> names){

        long countingValue = names.stream().count();
        Stream<String> streamNames = names.stream();
        return streamNames.skip(countingValue -1).findFirst().get();

    }




}
