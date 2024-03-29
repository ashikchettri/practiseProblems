package com.java8.utility;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumber;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address address() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<MobileNumber> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}