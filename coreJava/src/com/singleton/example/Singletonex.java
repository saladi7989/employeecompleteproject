package com.singleton.example;

public class Singletonex {
	
		private static Singletonex single_instance = null;

		public String st;
		
		private Singletonex()
		{
			st = "Hello I am a string part of Singleton class";
		}

		public static Singletonex getInstance() {
			if (single_instance == null)
				single_instance = new Singletonex();

			return single_instance;
		}
	}

	
	class GFG {
		// Main driver method
		public static void main(String args[])
		{
			// Instantiating Singleton class with variable x
			
	}

}
