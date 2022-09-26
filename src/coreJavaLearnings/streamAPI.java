package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class streamAPI {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 7, 7, 9,26, 8,17));
	
	
	
		// Find distinct from List using Stream

		ArrayList<Integer> strmUnqi = (ArrayList<Integer>) input.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Unqiue List using Stream method: " + strmUnqi);

		// Find duplicate in the list

		Set<Integer> dupEle = input.stream().filter(e -> Collections.frequency(input, e) > 1).collect(Collectors.toSet());
		System.out.println("Duplicate Element: " + dupEle);

		// Find Max
		
		int maxInt = input.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max value in List: "+maxInt); 
		int result = input.stream().max((e1,e2) -> e1-e2).get();
		System.out.println("Max Int: " +result);
		
		//sum of 
		
		int sum= input.stream().reduce((p,q)->p+q).get();
		System.out.println("Sum of Nos:" +sum);
		
		
		// get even nos
		List<Integer> evenList = input.stream().filter(e->(e%2==0)).distinct().collect(Collectors.toList());
		System.out.println("Even No List: "+evenList);
		
		//get square number list
		Function<Integer,Integer> sqr = e->e*e;
		System.out.println("Square : " +sqr.apply(7));
		List<Integer> sqrList = input.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("Square List: " +sqrList);
		
	}
	
	
}
