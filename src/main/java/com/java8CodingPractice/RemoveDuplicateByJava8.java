package com.java8CodingPractice;

import java.util.Arrays;

public class RemoveDuplicateByJava8 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,4,5};
		
		 Object[] array = Arrays.stream(arr).boxed().distinct().toArray();
		  System.out.println("nothing to say");
		 System.out.println(Arrays.toString(array));
		
	}

}
