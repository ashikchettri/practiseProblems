package com.java8.repository;

import com.java8.model.Person;

import java.util.List;

public interface PersonRepository {

    int addPerson(Person person);
    List<Person> getAllPersons();
    int deletePerson(int personId);
}
