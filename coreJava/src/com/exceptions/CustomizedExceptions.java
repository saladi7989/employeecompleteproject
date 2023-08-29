package com.exceptions;

public class CustomizedExceptions {
	
	static void validate(int age) throws InvalidAgeException{
		
		if(age<18) {
			
			throw new InvalidAgeException("Age is not valid to vote");
			
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		
		try {
			validate(13);
			
		}
		catch(InvalidAgeException ex) {
			
			System.out.println("caught the exception");
			
			System.out.println(ex.getMessage());
	     }
		System.out.println("Rest of the code");
	}
}
