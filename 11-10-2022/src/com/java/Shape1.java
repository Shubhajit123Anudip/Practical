//Super keyword-- reference variable which refer immediate parent class
//3 usage of super keyword
//2*** refer immediate parent class method
package com.java;

public class Shape1 {
	void print() {
		System.out.println("print circle");
	}
	}
class Size1 extends Shape1{
	void print() {
		System.out.println("print traingle");
		}
		void display() {
			System.out.println("print nothing");
			}
			void show() {//final method
				super.print();
				display();
				print();
			}
		}
		class SuperMethod{
	public static void main(String[] args) {
		Size1 obj=new Size1();
		obj.show();

	}

}
