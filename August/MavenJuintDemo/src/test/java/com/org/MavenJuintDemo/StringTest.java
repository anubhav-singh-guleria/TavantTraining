package com.org.MavenJuintDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","refer","civic","deified"})
	public void ispalindrome(String word) {
		
		assertTrue(StringUtils.isPalindrom(word));
		
	}

}
