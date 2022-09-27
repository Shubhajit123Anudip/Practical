package com;

public class Defaultcon {
	int age=5;
	String name="Suvo";
	void show() {
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
		// 1st object for name & age
		Defaultcon d=new Defaultcon();
		//object for name & age
		Defaultcon d1=new Defaultcon();
		d.show();
		d1.show();
		
		/*Defaultcon(){//default constructor
		 System.out.println("Default constructor is created");}
		 public static void main(String []args) {
		 Defaultcon d=new Defaultcon();*/
		 

	}

}
