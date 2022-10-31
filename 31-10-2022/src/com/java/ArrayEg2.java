package com.java;

public class ArrayEg2 {

	public static void main(String[] args) {
		/*int a[]=new int[5];//declaration & instantiation initialization
		 a[0]=2;
		 a[1]=9;
		 a[2]=5;
		 a[3]=7;
		 a[4]=1;
		 a[5]=8;*/
  int a[]= {2,9,5,7,1};//declaration & instantiation initialization
//traversing an array
// for(int i:a)
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}

}
