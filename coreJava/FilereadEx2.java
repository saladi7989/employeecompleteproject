package com.corejavaexample;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilereadEx2 {

	public static void main(String[] args) throws IOException {
FileInputStream fs=new FileInputStream("H:\\dataset2.txt");
		
		int x=0;
		while ((x=fs.read())!=-1) {
			//System.out.print(x);
			char value =(char)x;
			
			System.out.print(value);
		}
		fs.close();

	}

}
