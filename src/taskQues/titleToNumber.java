package taskQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class titleToNumber {

	static int titleToNumber(String s)
	{
	    // This process is similar to
	    // binary-to-decimal conversion
	    int result = 0;
	    for (int i = 0; i < s.length(); i++)
	    {
	        result *= 26;
	        result += s.charAt(i) - 'A' + 1;
	    }
	    return result;
	}
	
	public static void main (String[] args)
	{
	  
	    
	    String[] code = {"AA","AZ","P","BS","H"};
	    List<Integer> pass = new ArrayList<Integer>();
	    int cnt=0;
	    for(int i = 0;i<code.length;i++) {
	    	cnt= titleToNumber(code[i]);
	    	
	    	pass.add(cnt);
	    
	    }
	    pass.sort( Collections.reverseOrder());
	    System.out.println(pass);
	   StringBuffer x= new StringBuffer();
	 //  System.out.println(pass.size());
	    for(int j=0; j<pass.size();j++) {
	  //  System.out.println(pass.get(j));
	    x.append(pass.get(j).toString());
	    	
	    }
	    System.out.println(x);
	}
	
	
	
}
