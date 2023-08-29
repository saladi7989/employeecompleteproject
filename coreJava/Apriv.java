package com.corejavaexample;

public class Apriv {
	private int x=10;
	private int y=30;
	
	 private void sum() {
		int z=x+y;
		System.out.println(z);
	}
	 public static void main(String[] args) {
		 Apriv aa = new Apriv();
		 aa.sum();
		 
	 }
}
