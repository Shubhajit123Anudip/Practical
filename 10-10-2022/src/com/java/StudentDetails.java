package com.java;

public class StudentDetails {
	int id;
	String name;
	studentAddress address;//reference entity
	public StudentDetails(int id,String name,studentAddress address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.district);
}
	public static void main(String[] args) {
	studentAddress a1=new studentAddress("Bogra","Asansol","Bardhaman");
	StudentDetails d1=new StudentDetails(1,"Suvo",a1);
    d1.show();
	}

}
