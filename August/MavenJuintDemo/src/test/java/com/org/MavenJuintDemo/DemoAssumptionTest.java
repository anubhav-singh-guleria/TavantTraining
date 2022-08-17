package com.org.MavenJuintDemo;

import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoAssumptionTest {
	
	private static DemoTestClass demotest;

	@BeforeAll
	static void setUp() {
		demotest=new DemoTestClass();
		System.out.println("test data setup is done");
	}
	@BeforeEach
	void beforeEach()
	{
		System.out.println("@beforeeach executed");
	}
	@Test
	 public void test_add_positive()
	 {
		System.setProperty("EVE", "DEV");
		assumeTrue("DEV".equals(System.getProperty("EVE")));
		int actual=demotest.add(20, 10);
		assertEquals(30, actual);
		//if above assumption is true then rest of the test will proceed
	 }
	@Test
	 public void test_add_negative()
	 {
		System.setProperty("EVE", "DEV");
		assumeTrue("DEV".equals(System.getProperty("EVE")));
		int actual=demotest.add(-20, -10);
		assertEquals(-30, actual);
		//if above assumption is true then rest of the test will proceed
	 }
	

	

}
