package com.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.LineNumberReader;
//write a java program to read first 3 line from a file
public class ReadLine {//class

	public static void main(String[] args) {//main method
		BufferedReader b=null;//bufferreader class
		String s=" ";//blank string
		try {
			LineNumberReader l= new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\File.txt")));
		while(((s=l.readLine())!=null) && l.getLineNumber()<=4) {
			System.out.println(s);
		}
		l.close();
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		}catch(IOException ae) {
			System.out.println("Unable to read file");
		}

	}

}
