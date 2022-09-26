
package coreJavaLearnings;

import java.util.ArrayList;

public class PrimeNumChk {
	
	public static void main(String[] args) {

      int st=1;
      int end=30;
      ArrayList<Integer> l1= new ArrayList<Integer>();
      
      while(st<end) {
    	  
    	  boolean flag=false;
    	  for(int i=2;i<=st/2;i++) {
    		  if(st%i==0) {
    			 flag=true;
    			 break;
    		  }
    	  }
    	    	  
    		  if (!flag )
                 l1.add(st);

    	  
    	  st++;
      }
      System.out.println(l1);
	}

  }

