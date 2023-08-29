package com.Array;

public class MaximumArray {

	public static void main(String[] args) {
		
		int arr[]= {14,52,48,92,81,75};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];	
		}
		System.out.println(max);
	}

}
