package ch18.lecture.p04reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C05Reader {
	public static void main(String[] args) throws Exception {
		//441개 문자
				String fileName = "src/ch18/lecture/p04reader/C03reader.java";
				Reader fr = new FileReader(fileName);
				
				
		char[] buf = new char[100];
		int len = 0;
		int cnt = 0;
		
		while((len = fr.read(buf)) != -1) {
			cnt++;
		}
		System.out.println(cnt+"번 읽음");
		
		fr.close();
		
	}
}
