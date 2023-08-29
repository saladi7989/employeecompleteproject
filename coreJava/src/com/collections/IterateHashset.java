package com.collections;

import java.util.HashSet;
import java.util.Set;

public class IterateHashset {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("mahesh");
		hs.add("ramu");
		hs.add("deepu");
		hs.add("mahesh");
		
		System.out.println("set:"+hs);
		
		for(String x:hs)
		{
			System.out.println(x);
		}

	}

}
