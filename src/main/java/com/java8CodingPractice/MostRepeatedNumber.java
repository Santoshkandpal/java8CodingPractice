package com.java8CodingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostRepeatedNumber {
	
	public static void main(String[] args) {
	//	List<Integer> arr = List.of(1,2,3,3,4,5,4,5,6,5,7);
		
		int[] arr = {1,2,3,3,4,5,4,5,6,5,7};
		
		Map<Integer, Long> count = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,
				Collectors.counting()));
		
		Integer maxRepetiveNumbers = count.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(e->e.getKey()).orElse(null);
		
		System.out.println(maxRepetiveNumbers);
		
		
		/*
		 * Map<Integer, Long>
		 * collect=arr.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()
		 * ));
		 * 
		 * Integer maxRepetiveNumbers = collect.entrySet().stream()
		 * .max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		 * .map(e->e.getKey()).orElse(null);
		 * 
		 * System.out.println(maxRepetiveNumbers);
		 */
		
	}

}
