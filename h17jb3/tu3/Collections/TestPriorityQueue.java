package h17jb3.tu3.Collections;
//Ví dụ về PriorityQueue

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue pQueue = new PriorityQueue();
		pQueue.offer("Hi");
		pQueue.offer("He");
		pQueue.offer("Ha");
		pQueue.offer("Ho");

		System.out.println("1. Comparator: " + pQueue.comparator());
		System.out.println("2. Content of Priority Queue");

		for (Iterator i = pQueue.iterator(); i.hasNext();) {
			System.out.print(i.next() + " - ");
		}

		System.out.println("");
		System.out.println("3. Retrieve and remove head element: " + pQueue.poll());

		for (Iterator i = pQueue.iterator(); i.hasNext();) {
			System.out.print(i.next() + " - ");
		}

	}

}
