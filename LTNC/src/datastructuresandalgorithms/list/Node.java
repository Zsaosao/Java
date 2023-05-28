package datastructuresandalgorithms.list;

public class Node<T> {
	T data;
	Node<T> prevNode;
	Node<T> nextNode;

	public Node(T data, Node<T> prevNode, Node<T> nextNode) {
		this.data = data;
		this.prevNode = prevNode;
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node<T> prevNode) {
		this.prevNode = prevNode;
	}
}
