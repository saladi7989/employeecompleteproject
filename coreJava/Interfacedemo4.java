package com.corejavaexample;
interface printable{
	void print();
}
interface countable{
	void print();
}

class Multiinteface implements printable,countable{
	public void print() {
		System.out.println("Hello");
	}
}
public class Interfacedemo4 {
	public static void main(String[] args) {
		Multiinteface mt=new Multiinteface();
		mt.print();

	}

}



