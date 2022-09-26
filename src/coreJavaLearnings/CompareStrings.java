package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CompareStrings {
	
	public static void main(String[] args) {
		
		
		String a="aa2bb1ccdd";
		String b="12bbccddaa";
		
		
		String[] alist = a.split("");
		String[] blist = b.split("");

		// ===============Using Hashmap comparison
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		for(String s: alist){
		hmap.put(s,hmap.getOrDefault(s,0)+1);
		
		}

		HashMap<String,Integer> hmap1 = new HashMap<String,Integer>();
		for(String s: blist){
			hmap1.put(s,hmap1.getOrDefault(s,0)+1);
		}
		System.out.println(hmap);
		System.out.println(hmap1);
		
		if(hmap.equals(hmap1)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//================ Using Array Sort and compare
		Arrays.sort(alist);
	//	Arrays.asList(alist).forEach(e->System.out.println(e));
		Arrays.sort(blist);
		if(Arrays.equals(alist, blist)) {
			System.out.println("Strings Matched in content");
		}
		else {
			System.out.println("Strings mismatch in content");
		}
		
	// Using List sort and compare	
		List<String> l1 = Arrays.asList(alist);
		List<String> l2= Arrays.asList(blist);
		Collections.sort(l1);
		Collections.sort(l2);
		boolean result = l1.equals(l2);
		System.out.println("Comparison Result: " + result);
		
	}

}
