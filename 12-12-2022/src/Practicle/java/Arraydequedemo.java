package Practicle.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequedemo {

	public static void main(String[] args) {
		// Creating & adding
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("Pallabi");
		deque.add("Subhrajit");
		deque.add("Mamta");
		deque.add("Monami");
		deque.offerFirst("Anju");
		System.out.println("After offer first");
		deque.offerLast("Monalisha");
		System.out.println("After offer last");
		//traversing
		for(String str:deque) {
			System.out.println(str);
			//deque.peek() & deque.peekFirst same as peek()
		}System.out.println("peek:"+deque.peekLast());
		System.out.println("After peek Last");
		for(String str1:deque) {
			System.out.println(str1);}
		//deque.poll() & deque.pollFirst same as poll()
		System.out.println("poll:"+deque.pollLast());
		System.out.println("After poll Last");
		for(String str:deque) {
			System.out.println(str);
		}

	}

}
