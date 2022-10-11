//final keyword---cannot change the value of final variable 
//exmaple:final variable,final class,final method
package com.java;

public class Finalvariable {
	final int value=50;//final variable
	void display() {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Finalvariable obj=new Finalvariable();
	}

}
