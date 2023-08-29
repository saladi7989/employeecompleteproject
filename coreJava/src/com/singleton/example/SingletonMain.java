package com.singleton.example;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singletonex x = Singletonex.getInstance();
		Singletonex y = Singletonex.getInstance();
		Singletonex z = Singletonex.getInstance();

		
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		System.out.println("Hashcode of z is "+ z.hashCode());

		if (x == y && y == z) {
			
		System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}else 
		{
	
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}
	}

	}


