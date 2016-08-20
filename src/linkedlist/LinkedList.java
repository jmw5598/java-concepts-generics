package linkedlist;

public class LinkedList<T> {
	
	private Node<T> head;
	private int size = 0;
	
	public LinkedList() {}

	public Node<T> getHead() {
		return head;
	}
	
	public void insertAtHead(T data) {
		
		Node<T> temp = new Node<>(data);
		
		if(head == null) {
			head = temp;
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
		} else {
			head.insertAtTail(temp);
			size++;
		}
		
	}
	
	public Node<T> find(T data) {
		
		if(head == null) {
			return null;
		} else {
			return head.find(data);
		}
		
	}
	
	public void remove(T data) {
		
		if(head != null && head.getData() == data) {
			head = head.getNext();
			size--;
		} else {
			
			Node<T> prev = head;
			Node<T> current = head.getNext();
			
			while(current != null) {
				
				if(current.getData() == data) {
					prev.setNext(current.getNext());
					size--;
				}
				
				prev = current;
				current = current.getNext();
			}
		}
	}
	
	public int size() {
		return size;
	}
	
	
	
}
