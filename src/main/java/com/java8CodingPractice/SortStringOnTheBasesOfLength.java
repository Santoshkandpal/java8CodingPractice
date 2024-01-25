package com.java8CodingPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SortStringOnTheBasesOfLength {
	
	public static void main(String[] args) {
		
		String str[]= {"Apple","Orange","LadyFinger"};
		
		String maxlengthElement = Arrays.stream(str).max((e1,e2)->Integer.compare(e1.length(), e2.length()))
		.orElse(null);
		System.out.println(maxlengthElement);
	
		
		/*
		 * String [] strArray= new String[4]; strArray[0]="a"; strArray[1]="zzz";
		 * strArray[2]="bb"; strArray[3]="dddd";
		 * 
		 * Arrays.sort(strArray,(s1,s2)-> Integer.compare(s1.length(), s2.length()));
		 * 
		 * System.out.println(Arrays.toString(strArray));
		 */
		
	}

}
