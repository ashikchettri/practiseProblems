package com.java8.service;

import com.java8.model.Person;
import com.java8.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public int addPerson(Person person) {
        return personRepository.addPerson(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    @Override
    public int deletePerson(int personId) {
        return 0;
    }
}
