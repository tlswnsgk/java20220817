package ch15.book;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample2 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","김자바");
		for(String name: list1) {
			System.out.println(name);
		}
		for (int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.forEach((e) -> System.out.println(e));
		
		Iterator<String> iterator = list1.iterator();
		while()
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
		
	}
}
