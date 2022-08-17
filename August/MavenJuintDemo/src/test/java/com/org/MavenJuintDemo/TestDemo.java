package com.org.MavenJuintDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void test_add()
	{
		assertEquals(5,DemoTestClass.add(4, 1));
	}

	

}
