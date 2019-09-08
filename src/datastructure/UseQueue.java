package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * emonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> Queue = new LinkedList<>();
		Queue.add("farhana");
		Queue.add("farzana");
		Queue.add("Shah");
		Queue.add("amaya");
		Queue.add("maruf");
		System.out.println("Peek " + Queue.peek());
		System.out.println("Poll " + Queue.poll());
		System.out.println(Queue.poll());
		System.out.println("Remove " + Queue.remove());
		Iterator it = Queue.iterator();
		while (it.hasNext()) {
			System.out.println(Queue.poll());
		}

	}
}
