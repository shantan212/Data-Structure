package linkedList.doubleLinkedList;

public class Node<E> {

	
	public Node(E element, Node<E> previousNode, Node<E> nextNode){
		this.element=element;
		this.previousNode= previousNode;
		this.nextNode=nextNode;
	}
	
	private E element;
	private Node<E> previousNode;
	private Node<E> nextNode;
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node<E> getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node<E> previousNode) {
		this.previousNode = previousNode;
	}
	public Node<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
}
