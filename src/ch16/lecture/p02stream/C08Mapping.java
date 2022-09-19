package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
//		IntStream (primitive type stream) -> Stream<Integer>
		
		IntStream.of(3,5,9,1,0)
		.boxed()
		.sorted((a,b)->b-a)
		.forEach((e)->System.out.println(e));
		
		
		//
		String res = IntStream.of(3,5,9,1,0)
		//스트링 하나로 압축 "9,5,3,1,0
		//거꾸로 정렬
		.boxed()
		.sorted((a,b)->b-a)
		.map((s)->String.valueOf(s))		
		.collect(Collectors.joining(", "));
		
		System.out.println(res);
		
		
	}
}
