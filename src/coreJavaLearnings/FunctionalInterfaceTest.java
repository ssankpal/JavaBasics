package coreJavaLearnings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UnaryOperator Fun interface
		List<String> places = Arrays.asList("Satara","Kanpur","Pune","Solapur");
		places.replaceAll(e -> e+"-New");
		System.out.println("New Places: "+places);
		
		//===predicate fucn interface
		
		Predicate<String> fun = x -> x.startsWith("S");
		System.out.println(fun.test("Skk"));
		
	//	List<String> places = Arrays.asList("Satara","Kanpur","Pune","Solapur");
		List<String> splaces = places.stream().filter(fun).collect(Collectors.toList());
		System.out.println("Places starting with S: " +splaces);
		
		
		Function<String,Integer> f1 = e -> e.length();
		
		System.out.println(f1.apply("Software Testing"));
		
		List<String> citylist = Arrays.asList("Satara","Kanpur","Pune","Solapur");	
		
		long z = citylist.stream().count();
		System.out.println("Total Cities: " +z);
				
		
		List<String> cl1 = citylist.stream().map(String::toUpperCase).collect(Collectors.toList());
		//List<String> cl1 = citylist.stream().map(e -> e.toUpperCase).collect(Collectors.toList());
		System.out.println(cl1);
		
		boolean g = citylist.stream().anyMatch("Solapur"::equalsIgnoreCase);
		
		System.out.println("Is city available: " +g);

	//======== HashMap with lambda
		
		Map<String,Integer> hmap= new HashMap<String,Integer>();
		Map<String,Integer> nhmap= new HashMap<String,Integer>();
		Map<Object, List<Entry<String, Integer>>> nhmap1= new HashMap<Object, List<Entry<String, Integer>>>();
		hmap.put("Nike", 788);
		hmap.put("PUMA", 476);
		hmap.put("Lancer", 256);
		hmap.put("Tata", 788);
		hmap.put("Honda", 1200);
	//	hmap.put("PUMA", 787);
	
		Map<String,Integer> nhmap2= new HashMap<String,Integer>();
		hmap.entrySet().stream().filter(e->e.getValue() >400).forEach(v->System.out.println(v));
		nhmap= hmap.entrySet().stream().filter(e->e.getValue() >400 & e.getValue()<800).collect(Collectors.toMap(Map.Entry::getKey,entry -> entry.getValue()));
		nhmap2 = hmap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,entyr-> entyr.getValue()));
		System.out.println("New Map with filter: " +nhmap);
		System.out.println("New Map with top sales using sort: " +nhmap2);
		nhmap1= hmap.entrySet().stream().filter(e->e.getValue() >400 & e.getValue()<800).collect(Collectors.groupingBy(d->d.getValue()));
		System.out.println("New Map group by count: " +nhmap1);
		
		//sort map  on key/value
		hmap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(System.out::println);
		
		Consumer<Integer> h = i-> System.out.println(i);
		h.accept(41234);
		
	}

}
