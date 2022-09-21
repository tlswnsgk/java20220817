package ch18.book.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		//정확한 경로로 수정하세요
		String filePath = "src/ch18/book/exercise/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		int num = 1;
		
		while((line = br.readLine()) != null) {
			System.out.println(num+ ":" +line);
			num++;
		}
		br.close();
		fr.close();
		
	}
}
