package com.tavant.springdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int age;

    private String name;

    @Override
    public String toString() {
        return "Person [age=" + age + ", id=" + id + ", name=" + name + "]";
    }

    public Person(int age, String name) {
        // this.id = id;
        this.age = age;
        this.name = name;
    }
    public Person(){

    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
