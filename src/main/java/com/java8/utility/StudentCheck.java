package com.java8.utility;

import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Optional;

public class StudentCheck {


    public static void main(String[] args) {


        Student student1 = new Student(
                "ashik",24, new Address("janakpur"), Arrays.asList(new MobileNumber("92342323"), new MobileNumber("32423234")));

        Student student2 = new Student(
                "kushal", 23, new Address("pokhara"), Arrays.asList(new MobileNumber("234234234"), new MobileNumber("234234234")));

        Student student3 = new Student(
                "sagar", 25, new Address("butwal"), Arrays.asList(new MobileNumber("234233223"), new MobileNumber("234234213")));


        List<Student>  students = Arrays.asList(student1, student2, student3);

        Optional<Student> stude1 = students.stream().filter(student -> student.getName().equals("aeshik")).findFirst();
        System.out.println(stude1.isPresent() ? stude1.get().getName() : "No student Found");
        System.out.println("-----------------------------------");
    }




}
