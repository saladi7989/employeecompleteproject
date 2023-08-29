package com.corejavaexample;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesStrArray {

	public static void main(String[] args) {
		String arr[]= {"sreenu","bramha","mahesh","sreenu","bramha","mahesh","samba","venu","venky"};
		
		Set<String> remdupli= new HashSet<String>();
		
		Collections.addAll(remdupli, arr);
		
		System.out.println(remdupli);

	}

}
