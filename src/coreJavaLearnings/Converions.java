package coreJavaLearnings;

import java.sql.Timestamp;
import java.util.Date;

public class Converions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// String to int/Integer	
		String d = "123";
		System.out.println(Integer.parseInt(d)); // convert to primitive int
		System.out.println(Integer.valueOf(d)); // convert to Integer object
		
	// int to String	
		int k = 12;
		System.out.println(String.valueOf(k));
		System.out.println(Integer.toString(k));
	
	// character to int	
		char c = '1';
		
		int x = Character.getNumericValue(c);
		System.out.println("int of char: " +x);
		int y = Integer.parseInt(String.valueOf(c));
		System.out.println(y);
		
		
		Timestamp ts=new Timestamp(System.currentTimeMillis());  
	    Date date=new Date(ts.getTime());  
	    System.out.println(date);  
	}

}
