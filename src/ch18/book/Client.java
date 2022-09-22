package ch18.book;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		System.out.println("연결 기다림");
		try {
			Socket socket = new Socket("172.30.1.25",60000);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("연결 종료");

	}
}
