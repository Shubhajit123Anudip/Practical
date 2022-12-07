package com.java;
import java.io.FileWriter;
public class FileWriteEg {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\File1.txt");//destination
			fw.write("Hello World");	//prints in the file 
			fw.close();
			System.out.println("\nDONE");
		}catch(Exception e)  {
			System.out.println(e);
		}
	}
}
