package coreJavaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DuplicateFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> input = Arrays.asList("test", "to", "duplicates", "to", "test");

		List<String> dupList = input.stream().filter(e -> Collections.frequency(input, e) > 1).distinct()
				.collect(Collectors.toList());
		System.out.println("Duplicate words: " + dupList.toString());

		HashMap<String, Integer> cntMap = new HashMap<String, Integer>();
		for (String s : input) {
			cntMap.put(s, cntMap.getOrDefault(s, 0) + 1);
		}
		System.out.println("Word occurance Count: " + cntMap);
		String s = "123abc345def234ASD";
		String[] numerics = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		for (String st : numerics) {
			System.out.println(st);
		}

		String[] alpha = s.split("[0-9]+");

		for (String st : alpha) {
			System.out.println("-> " +st);
		}

		Pattern pat = Pattern.compile("[a-zA-Z]+|s\\d+");
		Matcher m = pat.matcher(s);
		ArrayList<String> allMatches = new ArrayList<>();
		while (m.find()) {
			allMatches.add(m.group());
		}
		System.out.println(allMatches);

	}

}
