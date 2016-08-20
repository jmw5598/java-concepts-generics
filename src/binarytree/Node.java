package binarytree;

public class Node<T extends Comparable<T>> {
	
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	private boolean isRemoved = false;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public void insert(Node<T> temp) {
		
		int result = temp.getData().compareTo(data);
		
		if(result < 0 && leftChild == null) {
			leftChild = temp;
		} else if(result < 0 && leftChild != null) {
			leftChild.insert(temp);
		} else if(result > 0 && rightChild == null) {
			rightChild = temp;
		} else if(result > 0 && rightChild != null) {
			rightChild.insert(temp);
		}
		
	}
	
	public Node<T> find(T data) {
		
		int result = data.compareTo(this.data);
		
		if(result == 0 && !isRemoved) {
			return this;
		} else if(result < 0 && leftChild != null) {
			return leftChild.find(data);
		} else if(result > 0 && rightChild != null) {
			return rightChild.find(data);
		}
		
		return null;
	}
	
	public void remove(T data) {
		
		int result = data.compareTo(this.data);
		
		if(result == 0 && !isRemoved) {
			isRemoved = !isRemoved;
		} else if(result < 0 && leftChild != null) {
			leftChild.remove(data);
		} else if(result > 0 && rightChild != null) {
			rightChild.remove(data);
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
}
