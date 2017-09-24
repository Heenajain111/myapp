package com.myapp.demo.myapp;

/**
 * Hello world!
 *
 */
public class App 
{
	
	String greeting;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public static Object sum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
    public static String getGreeting(){
    	return "welcome";
    }


	public static boolean setGreeting(String greeting) {
		// TODO Auto-generated method stub

		if (greeting.contains("welcome") || greeting.contains("thanks")|| greeting.contains("good morning"))
		{
    		return true;
		}
    	
    	return false;
	}
}
