package com.java;

class A {//base class 
	public void print() {
	System.out.println("Suvo");
}
}
class B extends A{//child class
	public void prints() {
		System.out.println("Maji");
	}
		
	}
class C extends B{
	public void printss(){
	System.out.println("I'm playing");
}
class Main{
	public static void main(String[]args) {
		C s=new C();
		s.print();
		s.prints();
		s.printss();
		}
}
}