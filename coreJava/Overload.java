package com.corejavaexample;

public class Overload {

	public static void main(String[] args) {
		Overload ovrlo = new Overload();
		ovrlo.add(10, 40, 50);
		ovrlo.add(0, 0);

	}
     void add(int x,int y) {
    	 int z=x+y;
    	 System.out.println(z);
     }

   void add(int x,int y, int k) {
	 int z=x+y+k;
	 System.out.println(z);
}
   void add(int x,float y) {
	 float z=x+y;
	 System.out.println(z);
}
   void add(int x,double y) {
		 double z=x+y;
		 System.out.println(z);
}
}
