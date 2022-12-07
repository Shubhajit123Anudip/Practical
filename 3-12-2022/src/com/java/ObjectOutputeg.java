package com.java;

import java.io.*;


//writing state of an object into byt-stream SERIALIZATION
class Student implements Serializable{
	int id;
	String name;
	int fee;
	Student(int id,String name,int fee){
     this.id=id;
     this.name=name;
     this.fee=fee;
	}
}
public class ObjectOutputeg {

	public static void main(String[] args) {
		try {
			Student s=new Student(123,"Suvo",4000);
			FileOutputStream os=new FileOutputStream("D:\\File.txt");
		ObjectOutputStream op=new ObjectOutputStream(os);
		op.writeObject(s);
		op.close();
		System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
