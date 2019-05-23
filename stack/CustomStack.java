package stack;

import java.util.Arrays;

public class CustomStack {

	public int capacity;
	private int stackElementsCount=0; 	
	
	
	private Object[] stackElements;
	
	CustomStack(){
		this(10);
	}
	
	CustomStack(int capacity){
	this.capacity=capacity;	
	this.stackElements = new Object[capacity];
	}
	
	
	 /**
     * <p>
     * Adding an element to out custom implemented Stack
     * @param obj
     *            Object (Element) to be added in the custom Stack
     * @author Shantan Kumar Golla
     */
	public void push(Object obj){
		if(!checkCapacity()){
			growDynamicStack();
		}
		stackElements[stackElementsCount] =obj;
		stackElementsCount++;
	}
	
	
	/**
     * <p>
     * Remove and Returns the top most elements 
     * @return 
     * 		   (Object) Returns the top most element of the stack and removes that element. 
     * @author Shantan Kumar Golla
     */
	public Object pop(){
		
		Object returnObj= stackElements[stackElementsCount-1];
		
		stackElements[stackElementsCount-1] =null;
		stackElementsCount--;
		return returnObj;
	}
	
	/**
     * <p>
     * Returns the top most elements 
     * @return 
     * 		   (Object) Returns the top most element of the stack. 
     * @author Shantan Kumar Golla
     */
	public Object peek(){
		
		Object returnObj= stackElements[stackElementsCount-1];
		return returnObj;
	}
	
	
	/**
     * <p>
     * Search for the value passed and return the index of that element 
     * @return 
     * 		   (Object) Returns the top most element of the stack. 
     * @author Shantan Kumar Golla
     */
	public Object search(Object searchElement){
		
		for(int i=0;i<stackElements.length ;i++){
			if(stackElements[i].equals(searchElement)){
				return i;
			}
			
		}
		
		
		Object returnObj= stackElements[stackElementsCount-1];
		return returnObj;
	}
	
	
	 /**
     * <p>
     * Returns the number of element present in Stack
     * @return (Integer) 
     *            Returns the number of element present in Stack
     * @author Shantan Kumar Golla
     */
	
	public int size(){
		return stackElementsCount;
	}
	
	
	private boolean checkCapacity(){
		if(getPercentageValue() >= 80){
			return false;
		}
		return true;
	}
	
	private int getPercentageValue (){
		return (int) (Double.valueOf(stackElementsCount)/ Double.valueOf(capacity) *100);
	}
	
	
	public void growDynamicStack(){
		capacity= capacity*2;
		stackElements=Arrays.copyOf(stackElements, capacity);
	}
	
}
