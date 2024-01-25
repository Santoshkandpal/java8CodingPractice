package com.java8CodingPractice;

public class RemoveSpecialCharcters {
	
	public static void main(String[] args) {
		
		String str="@#santo&sh ";
		
		String replaceAll = str.replaceAll("[^a-zA-Z0-9- ]", "");
		
		System.out.println(replaceAll);
	}

}
