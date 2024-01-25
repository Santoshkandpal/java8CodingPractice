package com.java8CodingPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,4,5,6,5,7};
		
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().
		collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(i->i.getValue()>1)
		.forEach(i->System.out.println
				("Repeated numbers: "+i.getKey()+" Repeated time: "+i.getValue()));
	}

}
