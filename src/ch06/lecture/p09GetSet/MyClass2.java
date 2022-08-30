package ch06.lecture.p09GetSet;

public class MyClass2 {
	// field는 특별한 이유 없으면 private
	private String name;
	private int age;
	private boolean alive;

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isAlive() { // boolean type getter 는 is로 작성
		return alive;
	}

	// 대신 getter,setter method 공개(public)
	// boolean
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
}
