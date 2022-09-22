package ch18.book;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(50000);
			
			//연결 기다림
			System.out.println("연결 기다림");
			Socket socket = serverSocket.accept();
			
			System.out.println(socket.getRemoteSocketAddress());
			
			System.out.println("연결 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
