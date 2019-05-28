package linkedList;

import java.util.LinkedList;

import arrayList.CustomArraylistMain;
import linkedList.doubleLinkedList.CustomDoubleLinkedList;
import linkedList.singleLinkedList.CustomSingleLinkedList;

public class LinkedListMain {

	
	
	public static void main(String args[]){
		
		System.out.println("In main ");
		CustomSingleLinkedList<String> csll = new CustomSingleLinkedList<String>();
		System.out.println("Single Linked List Init Capacity::"+csll.capacity);
		CustomSingleLinkedList<String> csllp = new CustomSingleLinkedList<String>(3);
		System.out.println("Single Linked List Init Capacity::"+csllp.capacity);
		csllp.add("Delhi");
		csllp.add("Hyd");
		csllp.add("Bangalore");
		csllp.add("Chennai");
		csllp.add("Kolkata");
		csllp.add("Mumbai");
		csllp.add("Pune");
		csllp.add("Vizag",4);
		System.out.println("Single Linked List Size ::"+csllp.getSize());
		csllp.showAll();
		csllp.removeAt(5);
		System.out.println("Single Linked List Size ::"+csllp.getSize());
		csllp.showAll();
		System.out.println("----------- Double Linked List --------------");
		CustomDoubleLinkedList<String> cdll =  new CustomDoubleLinkedList<>();
		System.out.println("Double Linked List Capacity ::"+cdll.capacity);
		System.out.println("Double Linked List Size ::"+cdll.getSize());
		cdll.add("Kolkata");
		cdll.add("Vizag");
		cdll.add("Mumbai");
		System.out.println("Double Linked List Size After Adding ::"+cdll.getSize());
		cdll.showAll();
		cdll.remove(2);
		System.out.println("After Removing");
		cdll.showAll();
	}
}
