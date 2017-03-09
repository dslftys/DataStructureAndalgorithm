package util;


public interface List<E> extends Collection<E> {
	E get(int idx);
	E set(int idx,E newVal);
	void add(int idx,E x);
	void remove(int idx);
	ListIterator<E> listIterator(int pos);
}
