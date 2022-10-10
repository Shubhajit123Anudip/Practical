package com.java;

public class Overloadingtypepromotion {
	void add(int a, long b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloadingtypepromotion obj=new Overloadingtypepromotion();
		obj.add(2, 4);
		obj.add(13,23,3);
	}

}
// byte--int---short--long--float--double
//char--int--float--double--long