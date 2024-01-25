package com.java8CodingPractice;

import java.util.Arrays;

public class PrintOddFirstThenEven {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		Arrays.stream(arr).boxed().filter(i->i%2!=0)
		.forEach(System.out::println);
		
		Arrays.stream(arr).boxed().filter(i->i%2==0)
		.forEach(System.out::println);
	}

}
