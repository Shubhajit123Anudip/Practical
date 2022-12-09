package practicle.java;

import java.util.Iterator;
import java.util.LinkedList;
//add method combination
public class LinkedListEg1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Suvo");
		ll.add("Soumya");
		ll.add("Ayan");
		ll.add("Puja");
		ll.add("Sourav");
		ll.add("Niladri");
		System.out.println(ll);
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
       //Adding an element at the specific position
		ll.add(2,"Nisha");
		System.err.println("After adding:"+""+ll);
		LinkedList<String>ll2=new LinkedList<String>();
		ll2.add("Peso");
		ll2.add("Shifa");
		ll2.add("Elijah");
		System.out.println("List 2 elements:"+""+ll2);
	//adding all 2nd list elements to the 1st list
		ll.addAll(ll2);
		System.err.println("After adding all elements of list 2:"+""+ll);
		//adding all 2nd list elements to the list at a specific position
		ll.addAll(2,ll2);
		System.err.println("After adding all elements of list 2 at specific position:"+""+ll);
   //adding elements at the 1st position
		ll2.addFirst("Pallabi");
		System.out.println("Add elements at 1st:"+""+ll2);
		ll2.addLast("Shubhajit");
	    System.out.println("Add elements at last:"+""+ll2);
	   
	}
	
}
