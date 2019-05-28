package Queues;
public class CustomQueue<E> {

	public int capacity;
	
	public Object[]  elements;
	
	public int elementCounter=0;
	
	
	private int front=-1,rear=-1;
	
	CustomQueue(){
		this(10);
	}
	CustomQueue(int capacity){
		this.capacity=capacity;
		elements=  new Object[capacity];
	}
	
	public void add(E e){
		rear= (rear +1)%elements.length;
		elements[rear] = e;
		if(front ==-1){
			front =0;
		}
		elementCounter++;
	}
	public int size(){
		return elementCounter;
	}
	
	public E peek(){
		return (E) elements[0];
	}
	public E poll(){
		E element= (E) elements[front];
		elements[front] =null;
		front = (front+1)% elements.length;
		elementCounter--;
		front++;
		return (E) element;
	}
	
	public void showAll(){
		for(int i=0;i<elements.length;i++){
			System.out.println("Elements ::"+elements[i]);
		}
	}
	
}
