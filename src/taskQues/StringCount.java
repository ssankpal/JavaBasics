package taskQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "This is 12 to test test java count count code";
		
		char[] charary = input.toCharArray();
		
		String[] inputAry = input.split(" ");
		
		
		HashMap<Character, Integer> outch = new HashMap<>();
		
//		for(char c: charary) {	
//			
//			if(outch.containsKey(c)) {
//				outch.put(c, outch.get(c)+1);
//				//System.out.println(out.get(s) +"" out.get(key));
//			}
//			else {
//				outch.put(c, 1);
//			}
//		}
		
		
		HashMap<String, Integer> out = new HashMap<>();
		for(String s: inputAry) {
						
			if(out.containsKey(s)) {
				out.put(s, out.get(s)+1);
				//System.out.println(out.get(s) +"" out.get(key));
			}
			else {
				out.put(s, 1);
			}
		}
		
		HashMap<String,Integer> newHM = new HashMap<String,Integer>();
		
		for(String p : inputAry) {
			newHM.put(p, newHM.getOrDefault(p, 0)+1);
		}
		
		for(char p : charary) {
			outch.put(p, outch.getOrDefault(p, 0)+1);
		}
//	System.out.println(out);
	System.out.println(outch);
	System.out.println("O/P using getOrdefault tech: " + newHM);
	
//===============
	
	List<String> lout = Stream.of(input).map(w->w.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList());
	Map <String, Integer > wordCounter = lout.stream()
            .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
 
        System.out.println("Using Stream: " +wordCounter);
	
 Map<String, Long> wcounter = Arrays.asList(inputAry).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 System.out.println(wcounter);
        
        
	}

}
