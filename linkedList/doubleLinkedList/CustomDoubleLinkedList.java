package linkedList.doubleLinkedList;

import java.util.LinkedList;



public class CustomDoubleLinkedList<E> {

	public int capacity;
	
	private Node<E> firstNode;
	private Node<E> lastNode;
	private int nodeCount=0;
	public CustomDoubleLinkedList(){
		this(10);
	}
	
	public  CustomDoubleLinkedList(int capacity){
		this.capacity=capacity;
	}
	
	
	public void add(E e){
		
		if(nodeCount <1){
			
			firstNode=new Node<E>(e,null,null);
			lastNode=firstNode;
			nodeCount++;
		}else{
			Node<E> node = new Node<E>(e, lastNode, null);
			lastNode.setNextNode(node);
			lastNode = node;
			nodeCount++;
		}
	}
	
	
	public void remove(int index){
		
		Node<E> presentNode = firstNode;
		for (int i=0;i<index ;i++){
			System.out.println("Index ::"+i);
			presentNode = presentNode.getNextNode();
			if( i ==index ){
				break;
			}
		}
		if(index==0){
			System.out.println("in index");
			Node<E> nextNode = presentNode.getNextNode();
			System.out.println("previousNode ::"+nextNode.getElement());
			firstNode = nextNode;
			nextNode.setPreviousNode(null);
			nodeCount--;
		}else{
			Node<E> previousNode = presentNode.getPreviousNode();
			System.out.println("previousNode ::"+previousNode);
			Node<E> nextNode = presentNode.getNextNode();
			previousNode.setNextNode(nextNode);
			nodeCount--;
		}
		
	}
	
	public int getSize(){
		return nodeCount;
	}
	
	public void showAll(){
		
		Node<E> presentNode = firstNode;
		 
		while (presentNode.getNextNode()!=null){
			
			System.out.println("Node Details ::"+presentNode.getElement());
			presentNode =presentNode.getNextNode();
			
		}
		System.out.println("Node Details ::"+presentNode.getElement());
		
	}
	
	
	
	
}
