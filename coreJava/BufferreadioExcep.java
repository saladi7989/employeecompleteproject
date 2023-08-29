package com.corejavaexample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferreadioExcep {

	public static void main(String[] args) throws IOException {
     FileReader dr=new FileReader("H:\\dataset.txt");
     BufferedReader br=new BufferedReader(dr);
		int x=0;
		while ((x=dr.read())!=-1) {
			//System.out.print(x);
			char value =(char)x;
			
			System.out.print(value);
		}
	      dr.close();
	      br.close();
	}
}
