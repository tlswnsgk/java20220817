package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		//list : 순서 있음
		List<String> list1 = new ArrayList<>();
		
		
		// add : element(item) 추가
		list1.add("coyote");
		list1.add("phoneix");
		list1.add("goose");
		
		// get : index로 element(item) 얻기
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
		System.out.println(s1);
		
		System.out.println(list1.get(0));
		
		// IndexOutOfBoundsException 주의
//		System.out.println(list1.get(3)); //x
		
		//size : list의 길이( 아이템의 객수)
		int len = list1.size();
		System.out.println(len);
		
		System.out.println("마지막 아이템:"+list1.get(list1.size()-1));
		
	}
}
