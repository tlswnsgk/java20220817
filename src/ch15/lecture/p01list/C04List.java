package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C04List {
	public static void main(String[] args) {
		// list : 순서가 있다
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("java");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
	}
}
