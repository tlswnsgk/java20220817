package ch13.book.s1307;

public interface Storage<T> {
	public void ad(T item, int index);
	public T get (int index);
}
