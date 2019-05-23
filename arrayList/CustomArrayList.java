package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class CustomArrayList<E> {


	public int capacity;
	public Object[] arrayListArray;
	private int arrayListCounter;
	
	CustomArrayList(){
		this(10);
	}
	CustomArrayList(int capacity){
		this.capacity=capacity;
		this.arrayListArray= new Object[capacity];
	}
	
	public void add(E e){
		if(!checkCapacity()){
			growDynamicStack();
		}
		arrayListArray[arrayListCounter] =e;
		arrayListCounter++;
	}
	
	public int size(){
		return arrayListCounter;
	}
	
	public Object get(int index){
		if((arrayListCounter-1) < index ){
				throw new IndexOutOfBoundsException("Index : "+index);
		}
		return arrayListArray[index];
	}
	
	public void remove(int index){
		if((arrayListCounter-1) < index ){
			System.out.println("In loop");
				throw new IndexOutOfBoundsException("Index : "+index);
		}
		System.arraycopy(arrayListArray, index+1, arrayListArray, index, arrayListCounter-index-1);	
		arrayListCounter--;
	}
	
	private boolean checkCapacity(){
		if(getPercentageValue() >= 80){
			return false;
		}
		return true;
	}
	
	private int getPercentageValue (){
		return (int) (Double.valueOf(arrayListCounter)/ Double.valueOf(capacity) *100);
	}

	public void growDynamicStack(){
		capacity= capacity*2;
		arrayListArray=Arrays.copyOf(arrayListArray, capacity);
	}

	
	
}
