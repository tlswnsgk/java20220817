package ch11.book.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 ㅣㅅ별키로 사용해서 String 값을 저장하는 hashmap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new key 1 로 홍길동 저장
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 new key1로 홍길동 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
