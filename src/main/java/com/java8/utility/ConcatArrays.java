package com.java8.utility;

import java.util.stream.Stream;

public class ConcatArrays {

    public static void main(String[] args) {


        Book[] b1 =  new Book[3];
        Book[] b2 = new Book[3];

        {
            b1[0] = new Book("Core Java", "200");
            b1[1] = new Book("gcp engineer", "400");
            b1[2] = new Book("wollies", "300");

            b2[0] = new Book("Core Java", "200");
            b2[1] = new Book("JDBC template", "321");
            b2[2] = new Book("Kubernetes", "123");
        }

        Book[] books = (Book[]) Stream.concat(Stream.of(b1), Stream.of(b2)).toArray(b -> new Book[b]);
        for (Book b : books){
            System.out.println(b.getName()+ "," + b.getPrice());
        }

        System.out.println("----------------------------remove duplicate books-------------------------");
        books = (Book[]) Stream.concat(Stream.of(b1), Stream.of(b2)).distinct().toArray(b -> new Book[b]);
        for (Book b : books){
            System.out.println(b.getName() + "," + b.getPrice());
        }


    }
}
