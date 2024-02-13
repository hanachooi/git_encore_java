package com.encore.socket;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;

// ip를 이용해서 서버와 통신을 하게 됌. 
// 양쪽의 소켓을 연 후에, 데이터를 이동시킨다.
// 각 클라이언트들이 접속을 하게 하기 위해서는, 스레드를 이용해야 한다.
// 이때, 발생하는 데드락을 조심.
public class SocketClientMAIN {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			// 여기에서의 IPv4 주소는 서버의 주소를 넣음. 이때, 무선이면, 무선 IP 주소를 넣어야 함.
			socket = new Socket("192.168.0.85", 7777);
			System.out.println("연결됌");
			
			// 소켓을 통해서 서버와 연결된 스트림을 만둘어 놓는 작업
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 클라이언트 메시지를 얻기 위해서 만들어 놓은 스트림
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("send message >>>");
				String msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
