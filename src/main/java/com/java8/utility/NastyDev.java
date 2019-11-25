package com.java8.utility;

import java.math.BigDecimal;

public class NastyDev {

    private String name;
    private int age;
    private String extra;

    public NastyDev(String name, int age, String extra) {
        this.name = name;
        this.age = age;
        this.extra = extra;
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}