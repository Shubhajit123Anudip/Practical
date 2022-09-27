package com;

public class Copyconst {
	//variable along with data type
	int age;
	String name;
	Copyconst(int a,String n){
		age=a;
		name=n;
		}
	//constructor to initialize another object
	/*Copyconst (Copyconst c){
	 age=c.age;
	 name=c.name;}
	 */
Copyconst(){}
//method
void show() {
	System.out.println(age+""+name);
}
	public static void main(String[] args) {
		Copyconst c1=new Copyconst(23,"Suvo");
         Copyconst c2=new Copyconst();
         c2.age=c1.age;
         c2.name=c1.name;
         //copyconst c2=new Copyconst();
         c1.show();
         c2.show();
	}

}
