package com.mukund.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((x,y) -> Integer.compare(y, x));
		
		queue.add(10);
		queue.add(9);
		queue.add(8);
		queue.add(7);
		queue.add(6);
		queue.add(5);
		
		System.out.println(queue);
		queue.remove();
		queue.remove();
		System.out.println(queue);

	}

}
