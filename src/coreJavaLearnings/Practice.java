package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a = new String("Sachin");
	String b = new String("Sachin");
	System.out.println(a==b);
	System.out.println(a.equals(b));
	
	HashSet<String> hs = new HashSet<String>();
	System.out.println(hs.add(null));
	hs.add("abc");
	hs.add("abc");
//	hs.forEach(e->System.out.println(e));
		
int[] nums ={1,2,3,4,5,6,7,9,10};

int z = getMissingNumber(nums,9);
System.out.println("Missing: " +z);

ArrayList<String> nameList=new ArrayList<String>();
nameList.add("one");
nameList.add("Two");

System.out.println(nameList.toString());
	}

	public static int getMissingNumber(int[] numbers, int totalCount) { 
		int expectedSum =( (totalCount+1) * (totalCount + 2)) / 2; 
		System.out.println("Expected: " +expectedSum);
		int actualSum = 0; 
		for (int i : numbers) 
		{ actualSum += i;
		
		}
		System.out.println(actualSum);
		return expectedSum - actualSum; }


	
	
}

