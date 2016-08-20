package queue;

public class Queue<T> {
	
	private LinkedList<T> list;
	
	public Queue() {
		list = new LinkedList<>();
	}
	
	public void enque(T data) {
		list.insertAtTail(data);
	}
	
	public T deque() {
		return list.removeAtHead().getData();
	}
	
	public T peek() {
		return list.getTail().getData();
	}
	
	public int size() {
		return list.getSize();
	}
	
}
