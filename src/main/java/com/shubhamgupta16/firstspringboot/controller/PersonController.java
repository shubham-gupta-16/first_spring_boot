package com.shubhamgupta16.firstspringboot.controller;

import com.shubhamgupta16.firstspringboot.collections.Person;
import com.shubhamgupta16.firstspringboot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> get(){
        return service.getPersonList();
    }

    @PostMapping
    public Person save(@RequestBody Person person){
        return service.save(person);
    }
}
