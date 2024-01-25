package com.java8CodingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("ABC", 30, "Female", "HR"));
		employees.add(new Employee("PQR", 25, "Male", "IT"));
		employees.add(new Employee("LMN", 30, "Male", "HR"));
		employees.add(new Employee("XYZ", 28, "Female", "IT"));
		
		// Max salary 
		/*
		 * int maxAge = employees.stream().
		 * mapToInt(Employee::getAge).max().orElseThrow();
		 * System.out.println("Max age: "+maxAge);
		 */
		
		
		// employee data who have max salary
		
		Optional<Employee> max = employees.stream().max((e1,e2)->
		Integer.compare(e1.getAge(), e2.getAge()));
		System.out.println(max);
		
		Map<String, Double> avgAge = employees.stream().
				collect(Collectors.groupingBy
				(e->e.getDepartment(),Collectors.averagingInt(e->e.getAge())));
		
	//	System.out.println(avgAge);
		
		// employees.stream().map(e->e.getGender().toUpperCase())
	//	.forEach(System.out::println);
		
		
	// employees.stream().map(e->e.getDepartment()).distinct()
	// .forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
