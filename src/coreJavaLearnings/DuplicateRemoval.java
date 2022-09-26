package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 7, 7, 9, 8));

		// Using HashSet
		HashSet<Integer> UniqOutput = new HashSet<Integer>();

		for (int i : input) {

			UniqOutput.add(i);
		}
		ArrayList<Integer> UniqOutPut1 = new ArrayList<Integer>(UniqOutput);
		System.out.println("Unique List using HashSet; " + UniqOutPut1);

		// Using LinkedHashSet

		LinkedHashSet<Integer> lhashset = new LinkedHashSet<Integer>(input);
		ArrayList<Integer> UniqOutPut = new ArrayList<Integer>(lhashset);
		System.out.println("Unique List using LinkedHashSet: " + UniqOutPut);

		// Using Stream

		ArrayList<Integer> strmUnqi = (ArrayList<Integer>) input.stream().distinct().collect(Collectors.toList());
		System.out.println("Unqiue List using Stream method: " + strmUnqi);

		// Find duplicate in the list

		List<Integer> nondupEle = input.stream().filter(e -> Collections.frequency(input, e) <2).distinct().collect(Collectors.toList());
		System.out.println("Non duplicate Element: " + nondupEle);
		
		List<Integer> dupEle = input.stream().filter(e -> Collections.frequency(input, e) >1).distinct().collect(Collectors.toList());
		System.out.println("Duplicate Element: " + dupEle);
	
// Get second highest element		
		Integer m = input.stream().sorted(Comparator.reverseOrder()).distinct().max(Integer::compare).get();
		System.out.println("HIghest: "+m);
		Integer k = input.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).findFirst().get();
		
		System.out.println("Second highest: " +k);
		
// Get even elements
		
		Integer[] intAry= input.stream().distinct().filter(e->e%2==0).toArray(Integer[]::new);
		System.out.println("Even Nums: " +intAry.length);
		
		int[] iary = {2,5,7,6,4,5};
		List<Integer> ix = Arrays.stream(iary).boxed().sorted().collect(Collectors.toList());
		ix=ix.stream().sorted().distinct().collect(Collectors.toList());
		Integer x = ix.stream().sorted(Collections.reverseOrder()).distinct().skip(1).limit(1).findFirst().get();
			//Arrays.stream(iary).filter(e->e%2==0).distinct().sorted().limit(2).findFirst().getAsInt();
		System.out.println(x);
		System.out.println(Arrays.toString(iary));

	}
}