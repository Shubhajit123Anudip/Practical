package com.java;
//Method overloading-same name method with different arguments
//Two way we can overload the method
//1.Changing no. of arguments 
//2.Changing the data type of arguments
public class OverloadingChangingArgs {
/*static int sum(int a,int b) {
		return a+b;
	}
	static int sum(int a,int b,int c) {
		return a+b+c;
	}*/
	static int sum(int a,int b) {
		return a+b;
	}
	static double sum(double a,double b,double c) {
		return a+b+c;
		}
	public static void main(String args[]) {
		System.out.println(OverloadingChangingArgs.sum(03, 04));
		System.out.println(OverloadingChangingArgs.sum(3.2,7.3,9.1));
	}

}
//