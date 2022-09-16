package ch15.book;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 80);
		
		System.out.println("총 엔트리 수 :"+map.size());
	}
}
