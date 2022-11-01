package com.java;

public class CopyArray {

	public static void main(String[] args) {
		char[]copyFrom= {'d','e','c','f','f','e','i'};
		// declaring a source array
		char[]copyTo=new char[6];
		System.arraycopy(copyFrom,1,copyTo, 0, 5);
		System.out.println(String.valueOf(copyTo));
	}

}
