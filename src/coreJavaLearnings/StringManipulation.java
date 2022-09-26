package coreJavaLearnings;

import java.util.Arrays;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		// replace odd words by even next to it
		String s = "name This Sachin is know to thing good test best new chk";
		String[] sa = s.split(" ");
		int i=0;
		int loopcnt=sa.length;
		if(sa.length%2!=0){
			loopcnt=sa.length-1;
			System.out.println(loopcnt);
		}
		while(i<loopcnt) {
			String temp = sa[i+1];
			sa[i+1]= sa[i];
			sa[i]=temp;
			i=i+2;
		}
		String out="";
		for(String a: sa) {
			out +=a+" ";
			
		}
		System.out.println(out);
		System.out.println(Arrays.toString(sa));
		
		//=== 
		StringBuffer sb = new StringBuffer("StringB");
		sb.append("uffer");
		System.out.println(sb);
		
		String s1 = "String";
		s1.concat("Test");
		s1= s1+"test3";
		System.out.println(s1);
		
		String s2 = new String("String");
		s2.concat("Test");
		System.out.println(s2);
		
		// reverse string
		
		String x = "Reverse";
		StringBuilder xb = new StringBuilder(x);
		xb.reverse();
		System.out.println(xb.toString());
		
		Arrays.asList(sa).stream().forEach(String::toUpperCase);
	}
}
