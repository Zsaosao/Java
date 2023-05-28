package datastructuresandalgorithms.list;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	private int size;
	private Node<T> nodeHead;
	private Node<T> nodeTail;

	public LinkedList() {
		this.size = 0;
		this.nodeHead = this.nodeTail = null;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int contains(T elem) {
		Node<T> currrentNode = this.nodeHead;
		int index = 0;
		while (currrentNode != null) {
			if (currrentNode.getData() == elem) {
				return index;
			}
			index++;
			currrentNode = currrentNode.getNextNode();
		}
		return -1;
	}

	public void addFirst(T elem) {
		this.nodeHead.setPrevNode(new Node<T>(elem, null, this.nodeHead));
		this.nodeHead = this.nodeHead.prevNode;
		this.size++;
	}

	@Override
	public void add(T elem) {
		if (this.nodeHead == null && nodeTail == null) {
			this.nodeHead = this.nodeTail = new Node<T>(elem, this.nodeHead, this.nodeTail);
		} else {
			this.nodeTail.setNextNode(new Node<T>(elem, this.nodeTail, null));
			this.nodeTail = this.nodeTail.getNextNode();
		}
		this.size++;
	}

	@Override
	public void add(T elem, int index) {
		if (index > size) {
			throw new IllegalArgumentException();
		} else if (index == 0) {
			addFirst(elem);
			return;
		}
		if (index == size) {
			add(elem);
			return;
		}
		Node<T> currrentNode;
		if (index < size / 2) {
			int i = 0;
			currrentNode = this.nodeHead;
			while (i != index) {
				currrentNode = currrentNode.getNextNode();
				i++;
			}
		} else {
			int i = this.size() - 1;
			currrentNode = this.nodeTail;
			while (i != index) {
				currrentNode = currrentNode.getPrevNode();
				i--;
			}
		}
		Node<T> nodeAdd = new Node<T>(elem, currrentNode.getPrevNode(), currrentNode);
		currrentNode.getPrevNode().setNextNode(nodeAdd);
		currrentNode.setPrevNode(nodeAdd);

	}

	private boolean removeFirst() {
		if (isEmpty()) {
			return false;
		}
		this.nodeHead = this.nodeHead.getNextNode();
		this.size--;
		if (isEmpty()) {
			this.nodeTail = null;
		} else {
			this.nodeHead.setPrevNode(null);
		}
		return true;
	}

	private boolean removeLast() {
		if (isEmpty()) {
			return false;
		}
		this.nodeTail = this.nodeTail.getPrevNode();
		this.size--;
		if (isEmpty()) {
			this.nodeTail = null;
		} else {
			this.nodeTail.setNextNode(null);
		}
		return true;
	}

	@Override
	public T remove(Node<T> node) {
		if (node.getPrevNode() == null) {
			this.removeFirst();
		}
		if (node.getNextNode() == null) {
			this.removeLast();
		}
		if (node.getNextNode() != null) {
			node.getNextNode().setPrevNode(node.getPrevNode());
		}
		if (node.getPrevNode() != null) {
			node.getPrevNode().setNextNode(node.getNextNode());
		}

		T data = node.getData();
		node.setData(null);
		node.setNextNode(null);
		node.setPrevNode(null);
		return data;
	}

	@Override
	public T removeAt(int index) {
		if (index >= this.size) {
			throw new IllegalArgumentException();
		}
		Node<T> currentNode;

		if (index < size / 2) {
			int i = 0;
			currentNode = this.nodeHead;
			while (i != index) {
				currentNode = currentNode.getNextNode();
				i++;
			}
		} else {
			int i = this.size() - 1;
			currentNode = this.nodeTail;
			while (i != index) {
				currentNode = currentNode.getPrevNode();
				i--;

			}
		}
		return remove(currentNode);
	}

	@Override
	public void print() {
		Node<T> nodeCurrent = this.nodeHead;
		while (nodeCurrent != null) {
			System.out.print(nodeCurrent.getData() + " ");
			nodeCurrent = nodeCurrent.getNextNode();
		}
	}

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(6);
		linkedList.add(5);
		linkedList.add(4);
		linkedList.add(999, 4);
		linkedList.print();
	}

}
