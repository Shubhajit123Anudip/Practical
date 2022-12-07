package com.java;
//read content from byte-stream into objec -DESERIALIZATION
import java.io.*;
import java.io.FileInputStream;
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
public class ObjectInputeg {

	public static void main(String[] args) {
		try {
	ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\File3.txt"));
    Student s=(Student) oi.readObject();
    System.out.println(s.id+" "+s.name+" "+s.fee);		
    oi.close();
	}catch(Exception e) {
		System.out.println(e);
	}
  }
}
