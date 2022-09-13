package ch13.book.s1307;

public class StorageImp1<T> implements Storage<T> {
	private T[] array;
	
	public StorageImp1(int capacity) {
		this.array = (T[]) (new Object[capacity]);
		
	}
	public void add(T item, int index) {
		array[index] = item;
	}
	
	public T get(int index) {
		return array[index];
	}
}
