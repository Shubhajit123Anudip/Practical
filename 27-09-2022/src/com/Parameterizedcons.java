package com;

public class Parameterizedcons {
	int age;
	String name;
//parameterized constuctor where we have to pass the parameterize/arguments
	Parameterizedcons(int a,String n){
		age =a;
		name =n;
	}
	void show() {
		System.out.println(age+" "+name);}
	public static void main(String[] args) {
		Parameterizedcons d=new Parameterizedcons(50,"karan");
		Parameterizedcons d1=new Parameterizedcons(25,"rohit");
d.show();
d1.show();
	}

}
