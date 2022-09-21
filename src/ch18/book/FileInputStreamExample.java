package ch18.book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileInputStreamExample {
	public static void main(String[] args)  {
		try {
			FileInputStream fis = new FileInputStream ("src/ch18/book/FileInputStreamExample.java");
		//한글
		int data;
		while( (data = fis.read()) != -1) {
			System.out.write(data);
		}
		fis.close();
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
