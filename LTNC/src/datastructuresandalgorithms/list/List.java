package datastructuresandalgorithms.list;

public interface List<T> {
	public boolean isEmpty();

	public int size();

	public int contains(T elem);

	public void add(T elem);

	public void add(T elem, int index);

	public T removeAt(int index);

	public T remove(Node<T> node);

	public void print();

}
