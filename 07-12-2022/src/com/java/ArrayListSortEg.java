package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {

	public static void main(String[] args) {
		List<String>al=new ArrayList<String>();
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        al.add("Rose");
        System.out.println("String sorted list:");
        Collections.sort(al);
        for(String a:al){
        	System.out.println(a);
        	List<Integer> al1=new ArrayList<Integer>();
        	al1.add(20);
        	al1.add(30);
        	al1.add(40);
        	al1.add(50);
        	al1.add(60);
        	al1.add(70);
        	al1.add(50);
        	System.out.println("Integer sorted list:");
        	Collections.sort(al1);
        	for(Integer i:al1) {
        		System.out.println(i);
        		
        	}
        	Collections.reverse(al1);
        	System.out.println(al1);
        	}
        	
        }
	}
