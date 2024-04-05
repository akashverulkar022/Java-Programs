package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Jasmin");
		queue.offer("Lotus");
		queue.offer("Rose");
		queue.offer("Mogra");
		queue.offer("Lilly");
		//queue.offer(null); you can't store null
		
		System.out.println("Queue :"+queue);
		
		System.out.println("hand of queue :"+queue.element());
		
		System.out.println("Removing Elements :"+queue.remove());
		
		System.out.println("After removing Queue :"+queue);
		
		System.out.println("removing elements :"+queue.poll());
		
		System.out.println("after removing Wueue :"+queue);

	}

}
