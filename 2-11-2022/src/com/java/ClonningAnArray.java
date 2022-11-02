package com.java;

public class ClonningAnArray {

	public static void main(String[] args) {
		int[] arr= {44,5,6,7};
		System.out.println("print the actual array");
		for(int i:arr)//for each loop for print
			System.out.println(i);
		System.out.println("print the clone array");
		int carr[]=arr.clone();
		for(int i:carr) //for each loop for cloning array
			System.out.println(i);
		System.out.println("both are equal or not?");
		System.out.println(arr==carr);//checking

	}

}
