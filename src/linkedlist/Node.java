package linkedlist;

public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void insertAtTail(Node<T> temp) {
		
		if(next == null) {
			next = temp;
		} else {
			next.insertAtTail(temp);
		}
		
	}
	
	public Node<T> find(T data) {
		
		if(this.data == data) {
			return this;
		} else if(this.next != null) {
			return next.find(data);
		} else {
			return null;
		}
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
