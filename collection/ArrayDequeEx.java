package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice-Cream");
		deque.offerFirst("Sandwitch");
		deque.offerLast("Pizza");
		deque.offer("Burger");
		//deque.offer(null);

		System.out.println("Deque :"+deque);
		
		System.out.println("Removing 1st elements :"+deque.pollFirst());
		
		System.out.println("Deque :"+deque);
		
		System.out.println("removing last elements :"+deque.pollLast());
		
		System.out.println("Deque :"+deque);
		
		System.out.println("head of queue :"+deque.peek());
		

	}

}
