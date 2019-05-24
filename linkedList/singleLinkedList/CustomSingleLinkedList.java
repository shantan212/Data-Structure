package linkedList.singleLinkedList;

import java.util.LinkedList;

public class CustomSingleLinkedList<E> {

	LinkedList<String> ll = new LinkedList<>();
	
	private Node<E> headNode;
	
	private Node<E> tailNode;
	
	public Node<E> getTailNode() {
		return tailNode;
	}

	public void setTailNode(Node<E> tailNode) {
		this.tailNode = tailNode;
	}

	public Node<E> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node<E> headNode) {
		this.headNode = headNode;
	}

	public int capacity;
	public int nodeCount;
	public CustomSingleLinkedList(){
		this(10);
	}
	
	public CustomSingleLinkedList(int capacity){
		this.capacity=capacity;
	}
	
	
	
	public void add(E e){
		if(headNode == null){
			headNode= new Node<E>();
			headNode.setElement(e);
			nodeCount++;
		}else if (nodeCount==1){
			Node<E> node= new Node<E>();
			node.setElement(e);
			headNode.setNextNode(node);
			nodeCount++;
		}else{
			Node<E> node= headNode;
			while (node.getNextNode() != null){
				node = node.getNextNode();
			}
			Node<E> latestNode = new Node<E>();
			latestNode.setElement(e);
			node.setNextNode(latestNode);
			nodeCount++;
		}
	}
	
	
	public void add(E e, int index){
		if(headNode == null){
			headNode= new Node<E>();
			headNode.setElement(e);
			nodeCount++;
		}else if (nodeCount==1){
			Node<E> node= new Node<E>();
			node.setElement(e);
			headNode.setNextNode(node);
			nodeCount++;
		}else{
			Node<E> node= headNode;
			Node<E> tempNode =null;
			for (int i=1;i<index-1 ;i++){
				node = node.getNextNode();
			}
			Node<E> latestNode = new Node<E>();
			latestNode.setElement(e);
			tempNode = node.getNextNode();
			latestNode.setNextNode(tempNode);
			node.setNextNode(latestNode);
			nodeCount++;
		}
		
	
	}
	
	public void removeAt(int index){
		
			Node<E> node= headNode;
			Node<E> tempNode =null;
			for (int i=1;i<index-1 ;i++){
				node = node.getNextNode();
			}
		node.setNextNode(node.getNextNode().getNextNode());
			nodeCount--;
	
	}
	
	public void showAll()
	{
		Node itrNode = headNode;
		while (itrNode.getNextNode()!=null){
			System.out.println("Node Value ::"+itrNode.getElement());
			itrNode= itrNode.getNextNode();
		}
		System.out.println("Node Value ::"+itrNode.getElement());
	}
	
	
	public int getSize(){
		return nodeCount;
	}
	
	
	
}
