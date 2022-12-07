package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsingIteratorEg {

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
		
		System.out.println("Traversing using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("traversing using for each loop");
		for(String a:al) {
			System.out.println(a);
			}
		System.out.println("traversing using for iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing using for iterator-forward");
		ListIterator<String> itr1=al.listIterator(al.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		System.out.println("traversing using iterator-backward");
		ListIterator<String> itr2=al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("traversing using forEach()method");
		al.forEach(a->System.out.println(al));
		}
	}
