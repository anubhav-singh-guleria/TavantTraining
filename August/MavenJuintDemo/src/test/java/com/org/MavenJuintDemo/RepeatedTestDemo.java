package com.org.MavenJuintDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {
	
	@RepeatedTest(1)
	 void test_add()
	{
		System.out.println("test_Add()");
		assertEquals(5, DemoTestClass.add(3, 2));
	}
	
	@Test
	void test_multi() {
		System.out.println("test_Multi()");
		assertEquals(15, DemoTestClass.multiple(3, 5));
		
	}
	
	@RepeatedTest(3)
	void test_dev() {
		System.out.println("test_Divide()");
		assertEquals(3, DemoTestClass.devide(15, 5));
		
	}

	

}
