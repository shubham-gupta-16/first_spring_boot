package com.shubhamgupta16.firstspringboot.respository;

import com.shubhamgupta16.firstspringboot.collections.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
