package com.shubhamgupta16.firstspringboot.services;

import com.shubhamgupta16.firstspringboot.collections.Person;
import com.shubhamgupta16.firstspringboot.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person save(Person person) {
        return repository.insert(person);
    }

    public List<Person> getPersonList() {
        try{
            return repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
