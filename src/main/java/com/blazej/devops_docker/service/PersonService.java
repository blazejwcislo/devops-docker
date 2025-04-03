package com.blazej.devops_docker.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blazej.devops_docker.model.Person;
import com.blazej.devops_docker.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void generateRandomPersons() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setId((long) (random.nextInt(1000) + 1));
            person.setName("Person" + random.nextInt(1000));
            person.setAge(random.nextInt(100) + 1);
            personRepository.save(person);
        }
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}