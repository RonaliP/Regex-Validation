package com.Regexuser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "user enter your first name" );
        String Firstname=sc.nextLine();
        boolean result=(isValidFirstname(Firstname));
		if(result==true)
		{
			System.out.println("VALID FIRSTNAME");
		}
		else
			System.out.println("INVALID FIRST NAME PLEASE TRY AGAIN");
    }
    
    public static boolean isValidFirstname(String name)
    {
    	Pattern regex=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    	Matcher m=regex.matcher(name);
    	return m.matches();
    			
    }
}
