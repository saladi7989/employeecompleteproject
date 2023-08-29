package com.corejavaexample;
import java.util.HashSet;

public class Hashsetex2 {

	public static void main(String[] args) {
		HashSet sh=new HashSet();
		
		sh.add(40);
		boolean values=sh.add(20);
		System.out.println(values);
		System.out.println(sh);
		boolean value=sh.add(20);
		sh.add(30);
		System.out.println(value);
        System.out.println(sh);
	}

}
