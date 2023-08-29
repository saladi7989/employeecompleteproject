package com.corejavaexample;
import java.util.HashSet;

public class HashsetRemo {

	public static void main(String[] args) {
		HashsetRemo hr=new HashsetRemo();
		 int arh[]= {10,20,30,40,10,20,30};
		 HashSet h=hr.removedupli(arh);
		 System.out.println(h);
	}
      HashSet removedupli(int b[]) {
    	  HashSet hd=new HashSet();
    	  for (int i=0;i<b.length;i++) {
    		  hd.add(b[i]);
    	  }
    	  return hd;
      }
}
