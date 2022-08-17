package com.org.tav.spring.autowired;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Employee emp=context.getBean(Employee.class);
        Passport p=new Passport();
        p.setPassNum(123456);
        p.setDateofIssue(new Date(2020,6,6));
		p.setDateofExpiry(new Date(2022,22,2));
        emp.setEmpId(12);
        emp.setEmpName("Reethik");
        System.out.println(emp.toString());
    }
}
