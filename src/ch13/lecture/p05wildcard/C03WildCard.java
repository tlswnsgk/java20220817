package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("maverick");
		list1.add("iceman");
		
		//?: unbounded wildcard
		
		ArrayList<?> list2 = list1;
		list2.add(""); // x
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
	}
}
