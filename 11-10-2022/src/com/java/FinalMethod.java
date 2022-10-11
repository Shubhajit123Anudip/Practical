package com.java;

public class FinalMethod {
final void display() {
	System.out.println("this is a final method");
}
public static void main (String[]args) {
	FinalMethod obj =new FinalMethod();
	obj.display();
}
}