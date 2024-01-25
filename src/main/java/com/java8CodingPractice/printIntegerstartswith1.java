package com.java8CodingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class printIntegerstartswith1 {
	
	public static void main(String[] args) {
	
		  int arr[]= {112,212,313,142,521,1123};
		  
		  Arrays.stream(arr).filter(e->String.valueOf(e).startsWith("1"))
		  .forEach(System.out::println);
		  
			/*
			 * int max = Arrays.stream(arr).max().orElseThrow();
			 * 
			 * System.out.println(max);
			 */
		 
		 
		
		
		/*
		 * arr.stream().filter(i->String.valueOf(i).startsWith("1"))
		 * .forEach(System.out::println);
		 */
		
		
	}
		
		/*Arrays.stream(arr).boxed()
		.filter(e->String.valueOf(e).startsWith("1"))
		.forEach(e->System.out.println(e));
	}
*/
}
