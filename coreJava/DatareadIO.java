package com.corejavaexample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DatareadIO {

	public static void main(String[] args) throws IOException {
		FileInputStream dr=new FileInputStream("H:\\dataset.txt");
		
		int x=0;
		while ((x=dr.read())!=-1) {
			System.out.print(x);
			char value =(char)x;
			
			System.out.print(value);
		}
	      dr.close();
	}

}
