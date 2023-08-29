package com.corejavaexample;
interface staticex{
	void print();
	static int cube(int x) {
		return x*x*x;
	}
}

class StaticMul implements staticex{

	public void print() {
		System.out.println("Hi");
	}	
}
public class InterfaceDe {

	public static void main(String[] args) {
		StaticMul sm=new StaticMul();
		sm.print();
System.out.println(staticex.cube(3));
	}

}
