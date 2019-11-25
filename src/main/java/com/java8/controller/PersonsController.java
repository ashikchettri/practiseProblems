package com.java8.controller;

import com.java8.model.GlobalResponse;
import com.java8.model.Person;
import com.java8.service.PersonService;
import jdk.nashorn.internal.objects.Global;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {

    private final PersonService personService;

    @Autowired
    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/person")
    public ResponseEntity<GlobalResponse> person(@RequestBody Person person) {

        int check = personService.addPerson(person);
        System.out.println(check);

        if (check != 0) {
            return new ResponseEntity<>(
                    new GlobalResponse(200, "successfully inserted", check), HttpStatus.OK);
        }
        return new ResponseEntity<>(
                new GlobalResponse(400, "invalid request", null), HttpStatus.OK);


    }
}
