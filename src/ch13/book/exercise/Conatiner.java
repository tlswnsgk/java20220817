package ch13.book.exercise;

public class Conatiner<T> {
	private T v;

	public void set(T o) {
		v = o;
	}
	
	public T get() {
		return v;
	}
}
