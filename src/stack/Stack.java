package stack;

public class Stack<T> {
	
	private LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<>();
	}
	
	public void push(T data) {
		list.insertAtHead(data);
	}
	
	public T pop() {
		return list.removeAtHead().getData();
	}
	
	public int size() {
		return list.getSize();
	}
	
	public T peek() {
		return list.getHead().getData();
	}
	
	
	
}
