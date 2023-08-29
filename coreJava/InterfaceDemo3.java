package com.corejavaexample;
interface drawble {
	void draw();
	default void msg(){
		System.out.println("Draw the triangle");
	}
}

class rectangle implements drawble{

	
	public void draw() {
		System.out.println("Draw the reangle");	
	}
	
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		drawble d=new rectangle();
		d.draw();
		d.msg();

	}

}
