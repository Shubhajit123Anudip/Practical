package com.java;

public class ArrayExample {

	public static void main(String[] args) {
		//Declaration
		String []names = ("Suvo","Bishnu","Soumya","Niladry","Atif");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
System.out.println();
int [] phone= {123 ,456,475,459,779};
//for each loop
for(int n : phone) {
	System.out.println(n);
}
	}

}
