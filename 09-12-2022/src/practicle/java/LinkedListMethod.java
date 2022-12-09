package practicle.java;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Suvo");
		ll.add("Soumya");
		ll.add("Ayan");
		ll.add("Puja");
		ll.add("Sourav");
		ll.add("Niladri");
		System.err.println("List 1 elements:"+""+ll);
		//retrieves the 1st elements of the list
		System.out.println(ll.peek());
		//retrieves the 1st elements of the list
		System.out.println(ll.peekFirst());
		//retrieves the last elements of the list
		System.out.println(ll.peekLast());
		//retrieves and remove the 1st elements of the list
		System.out.println(ll.poll());
		System.out.println("List 1 elements:"+""+ll);
		//retrieves the 1st elements of the list
		System.out.println(ll.pollFirst());
		System.out.println("List 1 elements:"+""+ll);
		//retrieves the Last elements of the list
		System.out.println(ll.pollLast());
		System.out.println("List 1 elements:"+""+ll);
	  //retrive and remove 1st element by default using pop() method
		System.out.println(ll.pop());
	System.out.println("New List 1 element:"+ll);
	}

}
