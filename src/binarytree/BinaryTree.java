package binarytree;

public class BinaryTree<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public BinaryTree() {}
	
	public void insert(T data) {
		
		Node<T> temp = new Node<>(data);
		
		if(root == null) {
			root = temp;
		} else {
			root.insert(temp);
		}
	}
	
	public Node<T> find(T data) {
		
		if(root != null) {
			return root.find(data);
		} else {
			return null;
		}
		
	}
	
	public void remove(T data) {
		
		if(root != null) {
			root.remove(data);
		}
		
	}
	
}
