package stack;

import java.util.Stack;

public class StackMain {

	
	public static void main(String args[]){
		
		
		CustomStack defautStatus = new CustomStack();
		System.out.println("Default Capacity :"+defautStatus.capacity);
		//push a element in Stack
		System.out.println("Getting the Size of Stack Before push :"+defautStatus.size());
		defautStatus.push(1);
		defautStatus.push(2);
		System.out.println("Getting the Size of Stack After push :"+defautStatus.size());
		
		System.out.println("\n");
		
		CustomStack customCapacityStack = new CustomStack(2);
		System.out.println("Custom Capacity Stack :"+customCapacityStack.capacity);
		//push a element in Stack
		System.out.println("Getting the Size of Stack Before push :"+customCapacityStack.size());
		customCapacityStack.push(1);
		customCapacityStack.push(2);
		System.out.println("Getting the Size of Stack After push :"+customCapacityStack.size());
		System.out.println("Peek before Pop :"+customCapacityStack.peek());
		System.out.println("Pop :"+customCapacityStack.pop());
		System.out.println("Size After Pop :"+customCapacityStack.size());
		System.out.println("Peek After Pop :"+customCapacityStack.peek());
		System.out.println("Capacity check for dynamic grow of stack size :"+customCapacityStack.capacity);
		customCapacityStack.push(3);
		customCapacityStack.push(4);
		customCapacityStack.push(6);
		customCapacityStack.push(7);
		customCapacityStack.push(8);
		System.out.println("Capacity after dynamic grow of stack size :"+customCapacityStack.capacity);
		
		// Return the index of first occurrence of element in stack 
		System.out.println("Serach for element :"+customCapacityStack.search(6));
		
		
	}
	
	
}
