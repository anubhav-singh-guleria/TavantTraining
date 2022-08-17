package com.org.MavenJuintDemo;

/**
 * Hello world!
 *
 */
/*Assumption class - collection of utility methods that support conditional test execution based on assumptions
* jupiter assumptions are static methods in the org.junit.jupitor.api.Assumptions
*
*  Assumptions.assumeTrue() - if condition is true then run the test else aborting test
*  Assumptions.false()-if condition is false then run the test else abort
*  Assumptions.assumingThat() - flexible , if condition is true then execute , else do not abort the test continue
*  rest of the code in test
*
*/
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
