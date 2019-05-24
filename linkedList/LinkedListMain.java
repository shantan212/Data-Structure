package linkedList;

import arrayList.CustomArraylistMain;
import linkedList.singleLinkedList.CustomSingleLinkedList;

public class LinkedListMain {

	
	
	public static void main(String args[]){
		
		System.out.println("In main ");
		
		CustomSingleLinkedList<String> csll = new CustomSingleLinkedList<String>();
		System.out.println("Single Linked List Init Capacity::"+csll.capacity);
		
		
		CustomSingleLinkedList<String> csllp = new CustomSingleLinkedList<String>(3);
		System.out.println("Single Linked List Init Capacity::"+csllp.capacity);
		
		csllp.add("Shantan");
		csllp.add("Kumar");
		csllp.add("Golla");
		csllp.add("Golla2");
		csllp.add("kgp");
		csllp.add("mumbai");
		csllp.add("pune");
		csllp.add("vizag",4);
		System.out.println("Single Linked List Size ::"+csllp.getSize());
		csllp.showAll();
		csllp.removeAt(5);
		System.out.println("Single Linked List Size ::"+csllp.getSize());
		csllp.showAll();
		
		
	}
}
