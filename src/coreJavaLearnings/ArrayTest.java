package coreJavaLearnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] ip = {2,4,8,25,5,6};
		int[] ip1 = {2,8,5,3,5,6};
		
		
		// Compare arrays
		System.out.println(Arrays.equals(ip1, ip));
		
		//Sort Array
		Arrays.parallelSort(ip1,0,4);
		System.out.println("Prallel Sort: " +Arrays.toString(ip1));
		Arrays.sort(ip);
		System.out.println(Arrays.toString(ip));
		int[] op = Arrays.stream(ip).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
	//	int mv = Arrays.stream(ip1).boxed().sorted().distinct().max(Integer::compare)
		System.out.println(Arrays.toString(op));

		// max
		List<Integer> list = Arrays.stream(ip1).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		int max = list.stream().distinct().max(Integer::compare).get();
		System.out.println("Maximum: "+max );
		int maxInt = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max value in List: "+maxInt); 
		int mv  = Arrays.stream(ip1).max().getAsInt();
		System.out.println("MAx using getAsint: "+mv);
		
		int sum = IntStream.range(1,10).sum();
		System.out.println("Sum of 1-10: " +sum);
		String s="This is to to test duplicate duplicate word";
		String[] input = s.split(" ");
		
		// Find duplicate words in String
		List<String> dupWords = Arrays.asList(input).stream().filter(e-> Collections.frequency(Arrays.asList(input), e)>1).distinct().collect(Collectors.toList());
		System.out.println("Duplicates words: "+dupWords);
	
		
		List<Integer> sqtList= list.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("Square List: " +sqtList);
		
	}

}
