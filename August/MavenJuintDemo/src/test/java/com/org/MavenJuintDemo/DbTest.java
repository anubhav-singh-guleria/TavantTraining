package com.org.MavenJuintDemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.mock.DataBase;
import com.demo.mock.Service;

@ExtendWith(MockitoExtension.class)//tells mockito to create mock based on @mocke Anno
class DbTest {
	
	@Mock
	DataBase databaseMock;//tells mockito to mock the databasemock instance
	
	@Test
	public void testQuery() {
		assertNotNull(databaseMock);
		when(databaseMock.isAvailable()).thenReturn(true);//configure the mock to return true when  isAvailable method
		Service s=new Service(databaseMock);//execute some code of class under test
		boolean check=s.query(" * from s");//assert that the method call returned true
		assertTrue(check);
	}
	
	@Test
	void ensureMockitoReturnsTheConfiguredValue() {
		when(databaseMock.getUniqueid()).thenReturn(45);
		Service ser=new Service(databaseMock);
		assertEquals(ser.toString(),"Using database with id45");
	}
	
	
	}
