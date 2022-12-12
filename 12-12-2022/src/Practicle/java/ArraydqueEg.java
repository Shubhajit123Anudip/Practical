package Practicle.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArraydqueEg {

	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
        dq.add("Ram");
        dq.add("Karan");
        dq.add("Riya");
        dq.add("Rohit");
        dq.add("Sajal");
        dq.add("Soumik");
        System.out.println(dq);
        dq.addFirst("Shree");
        dq.addLast("Riya");
        System.out.println("New List");
        for(String s1:dq) {
        	System.out.println(s1);
        }
        dq.removeFirst();
        dq.removeLast();
        System.out.println("new list after Removal");
        for(String s2:dq) {
        	System.out.println(s2);
        }
	}

}
