package coreJavaLearnings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat = Pattern.compile("[789]{1}[0-9]{9}"); // starts with 7/8/9 and then 9 digits betw 0-9
		Matcher r = pat.matcher("7567484785");
		boolean s = r.matches();
		System.out.println(s);
		System.out.println(Pattern.matches("[789]{1}[0-9]+", "995303894934")); // single liner matcher
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		
		System.out.println(Pattern.matches("\\d++", "9953038949")); // only numeric
		System.out.println(Pattern.matches("[0-9]+", "9953038949")); //only numeric
	}

}
