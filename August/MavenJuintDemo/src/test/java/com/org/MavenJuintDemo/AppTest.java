package com.org.MavenJuintDemo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private static List<Integer> vals;
	
	@BeforeAll
	static void setup()
	{
		vals=List.of(2,1,-1,-2,0,-1);
	}
	
	@Test
	@DisplayName("Testing sum of values")
	public void sumTest()
	{
		var sum=MathUtils.sum(vals);
		assertEquals(Integer.valueOf(2),sum);
	}
	
	@Test
	@DisplayName("shold get positive values")
	public void positiveTest() {
		var positiveValues=MathUtils.positive(vals);
		assertEquals(positiveValues,List.of(1,2,3));
		
	}
	
	@Test
	@DisplayName("shold get positive values")
	public void negativeTest() {
		var negativeValues=MathUtils.negative(vals);
		assertEquals(negativeValues,List.of(-1,-2,-3));
		
	}
    
}
