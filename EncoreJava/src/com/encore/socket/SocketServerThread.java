package com.encore.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class SocketServerThread implements Runnable{

	private BufferedReader br;
	private Socket socket;
	
	public SocketServerThread() {
		
	}
	
	public SocketServerThread(BufferedReader reader, Socket socket) {
		this.socket = socket;
		this.br = reader;
	}
	
	@Override
	public void run() {
		try {

			while(true) {
				String msg = br.readLine();
				System.out.println("from " + socket.getRemoteSocketAddress() + " >> " + msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {br.close();}
				if(socket != null) {socket.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
