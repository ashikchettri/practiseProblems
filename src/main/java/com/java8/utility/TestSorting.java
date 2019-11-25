package com.java8.utility;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;

import java.math.BigDecimal;
import java.util.*;

public class TestSorting {

    // classic comparator example
//    Comparator<Developers> dev = new Comparator<Developers>() {
//        @Override
//        public int compare(Developers o1, Developers o2) {
//            return 01.getName().compare(o2.getName());
//        }
//    };


    //Lambda expresssion equivalent
    // Comparator<Developer> dev = (Developer o1, Developer 02)-> o1.getName().compare(o2.getName());

    public static void main(String[] args) {

        List<Developer> listDevs = getDeveloper();

//        System.out.println("Before Sort");
//        for (Developer developer : listDevs) {
//            System.out.println(developer);
//        }
//
//        Collections.sort(listDevs, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//        System.out.println("After sort");
//        for (Developer developer : listDevs) {
//            System.out.println(developer);
//        }
//
//        // sort by name
//        Collections.sort(listDevs, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        System.out.println("Sort BY NAME");
//        for (Developer developer : listDevs) {
//            System.out.println(developer);
//        }
//
//        //sort by salary
//
//        Collections.sort(listDevs, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getSalary().compareTo(o2.getSalary());
//            }
//        });
//
//        System.out.println("Sort by salary");
//        for (Developer developer : listDevs) {
//            System.out.println(developer);
//        }

        System.out.println("sort by age");
        //lambda expression
        listDevs.sort((Developer o1,Developer o2 )-> o1.getAge()-o2.getAge());
        listDevs.forEach(developer -> System.out.println(developer));

        System.out.println("sort by name");
        //sort by name
        listDevs.sort((Developer o1, Developer o2)-> o1.getName().compareTo(o2.getName()));
        listDevs.forEach(developer -> System.out.println(developer));


        System.out.println("sort by salary");
        listDevs.sort((Developer o1, Developer o2)-> o1.getSalary().compareTo(o2.getSalary()));
        listDevs.forEach(developer -> System.out.println(developer));


        //salary in reversed order
        Comparator<Developer> salaryComparator = (o1,o2)-> o1.getSalary().compareTo(o2.getSalary());
        listDevs.sort(salaryComparator.reversed());

    }

    private static List<Developer> getDeveloper() {

        List<Developer> result = new ArrayList<>();
        result.add(new Developer("sagar", 44, new BigDecimal("123")));
        result.add(new Developer("zer", 11, new BigDecimal("890")));
        result.add(new Developer("yam", 54, new BigDecimal("456")));

        return result;

    }
}
