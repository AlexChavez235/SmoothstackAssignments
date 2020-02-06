package com.smoothstack.assignments.assignment3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasAndStreams {

	public static void main(String[] args) {
		
		String[] strings = {"dog","book","author","publisher","fog", "cat","chicken"};
		// sort by length (shortest to longest)
		List<String> shortestToLongest = Arrays.stream(strings).sorted((s1, s2) -> {
			return s1.length() - s2.length();
		}).collect(Collectors.toList());
		System.out.println(shortestToLongest);
		
		// sort by reverse length (longest to shortest)
		List<String> longestToShortest = Arrays.stream(strings).sorted((s1, s2) -> {
			return s2.length() - s1.length();
		}).collect(Collectors.toList());
		System.out.println(longestToShortest);
		
		// alphabetically by the first character only
		List<String> sortedByFirstChar = Arrays.stream(strings).sorted((s1, s2) -> {
			return s1.charAt(0) - s2.charAt(0);
		}).collect(Collectors.toList());
		System.out.println(sortedByFirstChar);
		
		// string that contain "e" first and everything else second
		List<String> containsEFirst = Arrays.stream(strings).sorted((s1, s2) -> {
			return (s2.contains("e")? 1: 0) - (s1.contains("e")? 1: 0);
		}).collect(Collectors.toList());
		System.out.println(containsEFirst);

		// same as previous but use static helper method
		Arrays.sort(strings, (s1,s2) -> containsEFirstHelper(s1,s2));
		System.out.println(Arrays.toString(strings));

		// list of integers to comma separated string with 'e' or 'o' appended to the beginning of every entry
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(3);
		ints.add(44);

		System.out.println(commaSeperatedString(ints));
		
		List<String> strings2 = new ArrayList<String>();
		strings2.add("apple");
		strings2.add("ate");
		strings2.add("banana");
		strings2.add("orange");
		strings2.add("are");
		strings2.add("edible");
		strings2.add("air");
		System.out.println(threeLettersAndStartsWithLowerCaseA(strings2));
		

	}

	public static int containsEFirstHelper(String s1, String s2) {
		return (s2.contains("e")? 1: 0) - (s1.contains("e")? 1: 0);
	}
	
	//Using Java 8 features write a method that returns a comma separated string based on a given list of integers.
	// Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. 
	//For example, if the input list is (3,44), the output should be 'o3,e44'.
	public static String commaSeperatedString(List<Integer> ints) {
		return ints.stream().map(i ->  (i%2==1? "o": "e") + Integer.toString(i)).collect(Collectors.joining(","));
	}
	
	// Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and 
	// have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
	public static List<String> threeLettersAndStartsWithLowerCaseA(List<String> strings) {
		return strings.stream().filter(str -> str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
	}
	
	

}
