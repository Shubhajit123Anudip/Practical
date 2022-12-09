package practicle.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveEg {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Suvo");
		ll.add("Soumya");
		ll.add("Ayan");
		ll.add("Puja");
		ll.add("Sourav");
		ll.add("Niladri");
		System.out.println("List 1 elements:"+""+ll);
		LinkedList<String>ll2=new LinkedList<String>();
		ll2.add("Peso");
		ll2.add("Shifa");
		ll2.add("Elijah");
		System.out.println("List 2 elements:"+""+ll2);
		//adding new elements to the list 1
		ll.addAll(ll2);
		 //Removing specific  elements from arraylist 1
	    ll.remove("Niladri");
	    System.err.println("After Removing:"+""+ll);
	   //Removeing specific element on the basic of particular position
	    ll.remove(1);
	    System.out.println("After Removing from specific position:"+""+ll);
	    //remove all the new elements of list 2
	    ll.removeAll(ll2);
	    System.err.println("After removing all new elements:"+""+ll);
	    //remove 1st elements from the list
	    ll.removeFirst();
	    System.out.println("After removing 1st elements:"+""+ll);
	    //remove last elements from the list
	    ll.removeLast();
	    System.err.println("After removing last elements "+""+ll);
	    //adding new elements to the list 1
	    ll.add("Pallabi");
	    ll.add("Anudip");
	    ll.add("java");
	    ll.add("pallabi");
	    ll.add("collection");
	    System.out.println("Updated list elements:"+""+ll);
	    //remove first occurrence if element
	    ll.removeFirstOccurrence("pallabi");
	    System.out.println("Removing 1st occurance:"+""+ll);
	    //remove last occurrence of element
	    ll.removeLastOccurrence("pallabi");
	    System.out.println("Removing last occurance:"+""+ll);
	    //Traversing the list of elements in reverse order
	    Iterator<String>i =ll.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());}
		//remove all the elements
		ll.clear();
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
