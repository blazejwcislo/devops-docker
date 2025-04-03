package com.blazej.devops_docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.blazej.devops_docker.model.Person;
import com.blazej.devops_docker.service.PersonService;

@RestController
public class HelloController {

    @Autowired
    private PersonService personService;

    @GetMapping("/generate-random-persons")
    public String generateRandomPersons() {
        personService.generateRandomPersons();
        return "Generated random persons!";
    }

    @GetMapping("/get-all-persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, cruel World!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/devops")
    public String getDevOps() {
        String devOpsUsername = System.getenv("DEVOPS");
        return "DevOps Username: " + devOpsUsername;
    }

    @GetMapping("/")
    public String defaultController() {
        return "Hello Blazej ";
    }
}