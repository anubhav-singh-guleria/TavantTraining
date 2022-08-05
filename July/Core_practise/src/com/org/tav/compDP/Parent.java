package com.org.tav.compDP;

import java.util.ArrayList;
import java.util.List;
 
public class Parent implements Human {
    private String name;
    private String lastName;

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
 
    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return lastName;
    }
 
    public Parent(String name, String lastName) {
        super();
        this.name = name;
        this.lastName = lastName;
    }
 
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("==============================");
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Parents :");
        for (Human parent: grandParents) {
            System.out.println("  - Name : " + parent.getName());
        }
        System.out.println("childs  :");
        for (Human child: childs) {
            System.out.println("  - Name : " + child.getName());
        }
        System.out.println("==============================");
 
    }
private List<Human > childs = new ArrayList<>();
    @Override
    public void addChild(Human child) {
        // TODO Auto-generated method stub
            childs.add(child);
    }
 
    private List<Human > grandParents = new ArrayList<>();
    @Override
    public void addparant(Human parent) {
        // TODO Auto-generated method stub
         grandParents.add(parent);
    }
 
}