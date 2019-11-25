package com.java8.service;

import com.java8.model.Person;

import java.util.List;

public interface PersonService {

    int addPerson(Person person);
    List<Person> getAllPerson();
    int deletePerson(int personId);
}
