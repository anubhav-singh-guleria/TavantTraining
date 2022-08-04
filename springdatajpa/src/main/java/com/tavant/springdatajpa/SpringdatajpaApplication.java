package com.tavant.springdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tavant.springdatajpa.entity.Person;
import com.tavant.springdatajpa.repository.PersonRepository;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;
	public static void main(String[] args) {
		// System.out.println("Jai MahaKal");
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inseting Person Records");
		Person person1 = new Person(22,"Anubhav");
		Person person2 = new Person(22, "Asura");
		List<Person> personList = personRepository.findAll();
		personRepository.save(person1);
		personRepository.save(person2);
		personList.forEach(person->System.out.println(person.toString()));

	}

}
