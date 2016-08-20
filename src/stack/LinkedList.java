package stack;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public LinkedList() {}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertAtHead(T data) {
		Node<T> temp = new Node<>(data);
		
		if(head == null) {
			head = temp;
			tail = temp;
			size++;
		} else {
			temp.setNext(head);
			head = temp;
			size++;
		}
	}
	
	public void insertAtTail(T data) {
		Node<T> temp = new Node<>(data);
		
		if(head == null) {
			head = temp;
			tail = temp;
			size++;
		} else {
			tail.setNext(temp);
			tail = temp;
		}
		
	}
	
	public Node<T> removeAtHead() {
		
		Node<T> temp = head;
		head = head.getNext();
		
		return temp;
		
	}
}
