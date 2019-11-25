package com.java8.model;

public class Person {

    private String name;
    private int id;
    private boolean isMarried;

    public Person(String name, int id, boolean isMarried) {
        this.name = name;
        this.id = id;
        this.isMarried = isMarried;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isMarried=" + isMarried +
                '}';
    }
}
