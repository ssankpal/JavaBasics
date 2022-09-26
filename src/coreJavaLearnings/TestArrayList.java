package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> list1 = new ArrayList<String>();
		
		list1.add("Abad");
		list1.add(0,"satara");
		list1.add("pune");
		list1.add("warm");
		ArrayList<String> list2 = new ArrayList<String>( Arrays.asList("Cool","Hot","warm","satara"));
		ArrayList<String> list3 = new ArrayList<String>( Arrays.asList("Cool","Hot","warm","satara"));
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println("list3: "+list3);
		
		//Compare List
		Collections.sort(list1);
		Collections.sort(list2);
		boolean c = list1.equals(list2);
		System.err.println("List 1 and List 2 are equal: " +c);
		
		list2.removeAll(list1);
		System.out.println("List2 w/o list1: " +list2);
		
		list3.retainAll(list1);
		System.out.println("List3 and List1 common attr: "+list3);
		

	int[] intArry = {1,2,3,4,5};
	
	intArry = Arrays.stream(intArry).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
	System.out.println("Rev Array: " +Arrays.toString(intArry));
	// COnvert Array to List
	List<Integer> l1 = Arrays.stream(intArry).boxed().collect(Collectors.toList());
	System.out.println(l1);
	
	String z = "Sachin";
	String z1="";
	
	for(int h=z.length()-1;h>=0;h--) {
		z1=z1+z.charAt(h);
	}
	System.out.println(z1);
	}

	
	
	
	}


