package datastructuresandalgorithms.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADt<T> {
	private int nodeCount = 0;
	private Node<T> root = null;

	@Override
	public boolean isEmpty() {
		return nodeCount == 0;
	}

	@Override
	public int size() {
		return nodeCount;
	}

	@Override
	public boolean contains(T elem) {
		return contains(this.root, elem);
	}

	private boolean contains(Node<T> node, T elem) {
		if (node == null) {
			return false;
		}
		int result = elem.compareTo(node.getData());
		if (result > 0) {
			return contains(node.getNodeRight(), elem);
		} else if (result < 0) {
			return contains(node.getNodeLeft(), elem);
		} else {
			return true;
		}
	}

	@Override
	public int hight() {
		return hight(this.root);
	}

	private int hight(Node<T> node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(this.hight(node.getNodeLeft()), this.hight(node.getNodeRight()));
	}

	@Override
	public boolean add(T elem) {
		if (this.contains(elem)) {
			return false;
		}
		this.nodeCount++;
		this.root = this.add(this.root, elem);
		return true;
	}

	private Node<T> add(Node<T> node, T elem) {
		if (node == null) {
			return new Node<T>(elem, null, null);
		}
		int result = elem.compareTo(node.getData());

		if (result > 0) {
			node.setNodeRight(this.add(node.getNodeRight(), elem));
		} else {
			node.setNodeLeft(this.add(node.getNodeLeft(), elem));
		}
		return node;
	}

	@Override
	public boolean remove(T elem) {
		if (!this.contains(elem)) {
			return false;
		}
		this.nodeCount--;
		this.root = this.remove(this.root, elem);
		return true;
	}

	private Node<T> remove(Node<T> node, T elem) {
		int result = elem.compareTo(node.getData());
		if (result > 0) {
			node.setNodeRight(this.remove(node.getNodeRight(), elem));
		} else if (result < 0) {
			node.setNodeRight(this.remove(node.getNodeLeft(), elem));
		} else {
			if (node.getNodeLeft() == null) {
				Node<T> nodeRight = node.getNodeRight();
				node.setData(null);
				node = null;
				return nodeRight;
			} else if (node.getNodeRight() == null) {
				Node<T> nodeLeft = node.getNodeLeft();
				node.setData(null);
				node = null;
				return nodeLeft;
			} else {
				T temp = this.minRight(node);
				node.setData(temp);
				node.setNodeRight(remove(node.getNodeRight(), elem));
			}
		}
		return node;
	}

	private T minRight(Node<T> node) {
		while (node.getNodeLeft() != null) {
			node = node.getNodeLeft();
		}
		return node.getData();
	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(3);
		tree.add(4);
		System.out.println(tree.contains(3));
		tree.remove(3);
		System.out.println(tree.contains(4));

	}

}
