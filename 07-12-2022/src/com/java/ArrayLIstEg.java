package com.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstEg {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		//method add()
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily");
		al.add(2,"Daisy");
		al.add("MeriGold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		al.add("Suvo");
		System.out.println(al);
		//define the no. of elements using size()
		System.err.println("Size of Array List:"+al.size());
       //specific element of given index using get()
		System.out.println("Element of index value is:"+al.get(0));
		//remove any alement from list using remove()
		al.remove(6);
		System.out.println(al);
		System.err.println("Size of array list:"+al.size());
		}

}
