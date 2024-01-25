package com.java8CodingPractice;

import java.util.Arrays;

public class PrintOddandEvenFirst {
	    public static void main(String[] args) {
	        
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        
	        Arrays.stream(array)
	                .boxed()
	                .sorted((a, b) -> Integer.compare(a % 2, b % 2))
	                .forEach(System.out::println);
	    }
	}

