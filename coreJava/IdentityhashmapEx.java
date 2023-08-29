package com.corejavaexample;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;

public class IdentityhashmapEx {

	public static void main(String[] args) {
		HashMap mh=new HashMap();
		
		Integer x=new Integer(10);
		Integer y=new Integer(10);
		
		mh.put(null, "sr");
		mh.put(10, "sreenu");
		mh.put(10, "sri");
		System.out.println(mh);
		
		IdentityHashMap idm=new IdentityHashMap();
		
		idm.put(x, "sreenu");
		idm.put(y, "sri");
		System.out.println(idm);
		
		Hashtable ht=new Hashtable();
		
		ht.put(2, "ssr");
		ht.put(1, "sree");
		ht.put(2, "sr");
		System.out.println(ht);

	}

}
