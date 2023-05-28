package datastructuresandalgorithms.binarysearchtree;

public class Node<T> {
	private T data;

	private Node<T> nodeLeft;
	private Node<T> nodeRight;

	public Node(T data, Node<T> nodeLeft, Node<T> nodeRight) {
		this.data = data;
		this.nodeLeft = nodeLeft;
		this.nodeRight = nodeRight;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNodeLeft(Node<T> nodeLeft) {
		this.nodeLeft = nodeLeft;
	}

	public void setNodeRight(Node<T> nodeRight) {
		this.nodeRight = nodeRight;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNodeLeft() {
		return nodeLeft;
	}

	public Node<T> getNodeRight() {
		return nodeRight;
	}

}
