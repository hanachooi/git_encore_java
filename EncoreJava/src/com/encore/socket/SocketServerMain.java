package com.encore.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

public static void main(String[] args) {
			
		// 읽어들이는 작업을 하기에, ServerSocket 라이브러리를 import 한다.
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader reader = null;
		
		try {
			server = new ServerSocket(7777);
			System.out.println("Server Socket Ready ,,,,, ");
			while(true) {
				socket = server.accept();
				System.out.println(socket.getRemoteSocketAddress() + "에서 접속됌.");
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				new Thread(new SocketServerThread(reader, socket)).start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
