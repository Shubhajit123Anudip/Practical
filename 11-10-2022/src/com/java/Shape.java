//1*** refer immediate parent class
package com.java;

public class Shape {
	String name="Circle";
}
class Size extends Shape{
	String name="Tringle";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
	}
class SuperTV{

	public static void main(String[] args) {
		Size obj=new Size();
		obj.print();

	}

}
