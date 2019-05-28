package Queues;


import java.util.PriorityQueue;
import java.util.Queue;

public class CustomQueueMain {
	public static void main(String args[]){
		CustomQueue customQueue= new CustomQueue(3);
		System.out.println("Capacity of Custom Queue ::"+customQueue.capacity);
		customQueue.add("Mumbai");
		customQueue.add("Pune");
		customQueue.add("Vizag");
		customQueue.showAll();
		System.out.println("After Adding Size of Custom Queue ::"+customQueue.size());
		System.out.println("Peek Method Call ::"+customQueue.peek());
		System.out.println("Poll Method Call ::"+customQueue.poll());
		customQueue.showAll();
		customQueue.add("kolkata");
		customQueue.showAll();
	}
}
