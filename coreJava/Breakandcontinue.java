package com.corejavaexample;

public class Breakandcontinue {

	public static void main(String[] args) {
	int	capacity = 30;
	int count=0;

		for (int i=0;i<30;i++){
		count=count+i;
		if(count<=capacity){	
		break;
		}
		System.out.println(i);
		}	
	}
}
