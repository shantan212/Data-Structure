package linkedList.singleLinkedList;

public class Node<E> {

	
	
	Node(){
		
	}
	
	private E element;
	private Node<E> nextNode;
	private Node<E> previousNode;
	
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
}
