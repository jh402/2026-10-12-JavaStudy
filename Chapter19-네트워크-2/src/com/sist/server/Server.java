package com.sist.server;

import java.io.*;
import java.util.*;
import java.net.*;

public class Server implements Runnable{
	private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=11111;
	
	//접속자 마다 통신이 가능
	class Client extends Thread{
		Socket s;
		OutputStream out;
		BufferedReader in;
		
		public Client(Socket s) {
			try {
				this.s=s;
				out=s.getOutputStream();//응답
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//요청
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		//접속자 마다 통신이 가능하게
		@Override
		public void run() {
			try {
				while(true) {
					//접속자의 요청 받기
					String msg=in.readLine();
					for(Client c:waitVc) {
						//접속한 모든 사람에게 msg 전송
						c.out.write((msg+"\n").getBytes());
					}
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	//서버 구동
	public Server() {
		try {
			ss=new ServerSocket(PORT);//bind - ip/port
			//대기 - listen
			System.out.println("Server Start...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	//접속 시 처리
	@Override
	public void run() {
		try {
			while(true) {
				//클라이언트 접속 시에만 호출
				Socket s=ss.accept();
				Client client=new Client(s);
				waitVc.add(client);//등록
				//접속자마다 통신 시작
				client.start();
			}
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		Server server=new Server();
		new Thread(server).start();
	}
}
