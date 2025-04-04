package com.blazej.devops_docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blazej.devops_docker.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}