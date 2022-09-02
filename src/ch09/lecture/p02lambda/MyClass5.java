package ch09.lecture.p02lambda;

import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1;
		
		o1 = (int a) -> System.out.println(a * a);
		
		o1.accept(3); // 9
		o1.accept(4); // 16
		o1.accept(10); // 100
	}
}


