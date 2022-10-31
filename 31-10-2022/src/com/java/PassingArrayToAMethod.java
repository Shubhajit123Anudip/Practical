package com.java;

public class PassingArrayToAMethod {
	//creating a method which pass an array as a parameters
	static void maximumNo(int array[]) {//method name maximumNo
		int max=array[0];
		for(int i=1;i<array.length;i++)
			if(max<array[i])
				max=array[i];
		      System.out.println(max);
	}

	public static void main(String[] args) {
		//declaring & initializing
		int a[]= {5,7,9,2,3};
		maximumNo(a);//passing array to a method max
	}

}
