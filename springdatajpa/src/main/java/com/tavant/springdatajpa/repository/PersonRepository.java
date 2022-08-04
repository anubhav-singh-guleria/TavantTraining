package com.tavant.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.springdatajpa.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
    
}
