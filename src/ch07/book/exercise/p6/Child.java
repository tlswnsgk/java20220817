package ch07.book.exercise.p6;

public class Child extends Parent{
	private String name;

	public Child() {
		this("홍길동");
		System.out.println("Chid() Call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
