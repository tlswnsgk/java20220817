package ch16.book;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","신용권","감자바","신용권","신민철");
		
		names.stream()
		.distinct()
		.forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream()
		.filter(e -> e.startsWith("신"))
		.forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(e -> e.startsWith("신") )
		.forEach(e -> System.out.println(e));
	}
}
