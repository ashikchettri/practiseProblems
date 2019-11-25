package com.java8.repository;

import com.java8.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addPerson(Person person) {

        Map<String, Object> param = new HashMap<>();
        param.put("name", person.getName());
        param.put("id", person.getId());
        param.put("married", person.isMarried());
        return jdbcTemplate.update(queries.INSERT_PERSON, param);

    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public int deletePerson(int personId) {
        return 0;
    }

    private static class queries {

        private static final String INSERT_PERSON = "INSERT INTO persondb.person(name,id,married)" +
                " VALUES(:name,:id,:married)";

    }
}
