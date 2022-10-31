package com.java;

public class Anonymous {
	static void print(int arr[]) {//static print method receives an array as a anonymous
 for(int i=1;i<arr.length;i++)
	 System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		print(new int[] {10,20,30,40,50,60,70,80});//passing anonymous array to method

	}

}
