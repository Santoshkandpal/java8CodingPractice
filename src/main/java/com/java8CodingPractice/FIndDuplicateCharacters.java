package com.java8CodingPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FIndDuplicateCharacters {
	public static void main(String[] args) {
		String str="capgemini";
		
		Map<Character, Long> duplicatEntry = str.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		duplicatEntry.entrySet()
		.stream().filter(e->e.getValue()>1)
		.forEach(e->System.out.println("Repitive Character: "+e.getKey()
		+" Counting: "+e.getValue()));
		
		
		
		
		
		
		
		/*
		 * Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		 * collect(Collectors.groupingBy(i->i,Collectors.counting()));
		 * 
		 * collect.entrySet().stream() .filter(e->e.getValue()>1)
		 * .forEach(e->System.out.println("Repeated Numbers: "+e.getKey()
		 * +" Counting numbers: "+e.getValue()));
		 */
	}

}
