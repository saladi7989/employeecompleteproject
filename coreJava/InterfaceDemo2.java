package com.corejavaexample;
interface Bankintrate{
     float intrate();
}

class Unb implements Bankintrate{
	public float intrate() {
		
		return  19.3f;	
	}
}

class Pnb implements Bankintrate{
	public float intrate() {
		return 15.5f;
		
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Bankintrate b=new Pnb();
		Bankintrate s=new Unb();
		System.out.println("UNB Rate of interest "+s.intrate()+"  " +"PNB Rate of interest "+b.intrate());
		

	}

}
