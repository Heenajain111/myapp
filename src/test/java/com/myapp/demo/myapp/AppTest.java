package com.myapp.demo.myapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testSum()
    {
    	System.out.println("This is a JUnit test of a sum.");
        assertEquals(9, App.sum(5, 4));
    }
    
    public void testIsGreeting() {

    	System.out.println("This is a Junit test of greeting");
    	App.setGreeting("welcome");

        assertEquals("welcome", App.getGreeting());

    } 
    
    
}
