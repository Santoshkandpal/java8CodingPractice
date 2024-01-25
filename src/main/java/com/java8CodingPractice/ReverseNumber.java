package com.java8CodingPractice;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int number=5672;
		
		int reverseNumber=0;
		
		while(number>0) {
			
			int rem=number%10;
			
			reverseNumber=reverseNumber*10+rem;
			
			number=number/10;
		}
		
		System.out.println(reverseNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int reverse =0;
		
		while(number>0) {
			
			int rem = number%10;
			
			reverse=reverse*10+rem;
			
			number = number/10;
		}
		
		System.out.println(reverse);
		
	}*/
	}
}
