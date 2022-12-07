package com.java;

import java.util.*;

public class ArrayListConvert {

	public static void main(String[] args) {
		//List al1=new ArrayList();//non-generic
		List<String>al=new ArrayList<String>();//creating a arraylist
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add("Lily");
		al.add("Daisy");
		al.add("MeriGold");
		al.add("Tulip");
		//converting of list to array
		System.out.println("List to Array");
		String []arr=al.toArray(new String[al.size()]);
		for(String s : arr) {
			System.out.println(s);
		}
			//Array  to list
			System.out.println("Array to List");
			List<String> al1=new ArrayList<String>();
			al1=Arrays.asList(arr);
			System.out.println(al1);
		}
	}