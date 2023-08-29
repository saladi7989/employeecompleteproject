package com.collections;

import java.util.HashSet;

public class ValuinHashset {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(new Integer(6)));
    
	}

}
