package com.sist.server;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=11111;
	
	//서버->대기
	//한 컴퓨터에서 서버는 한 번만 수행
	public Server() {
		try {
			//bind - IP+PORT
			//listen - 대기
			//50명까지 가능(디폴트 값)
			ss=new ServerSocket(PORT); //(100, PORT) - 100명까지
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//클라이언트 접속 대기
	@Override
	public void run() {
		while(true) {
			try {
				//접속 시에 누가 접속 했는 확인(IP)
				Socket client=ss.accept();
				System.out.println("Client IP:"+client.getInetAddress().getHostAddress());
				System.out.println("Client PORT:"+client.getPort());
				//서버는 고정 PORT
				//클라이언트는 자동 생성 - 중복 없이
				BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
				//접속자의 메세지 받기
				OutputStream out=client.getOutputStream();
				//접속자에게 응답
				String msg=in.readLine();
				System.out.println("받은 메세지:"+msg);
				out.write(("서버입니다!! 받은 메세지:"+msg+"\n").getBytes());
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Server server=new Server();
		new Thread(server).start();
	}
}


/*
 * client->server - Request 요청
 * server->client - Response 응답
 * 
 * 서버 실행
 * ServerSocket ss=new ServerSocket(PORT);
 * 
 * bind() - 개통, 유심
 * listen() - 접근 대기 상태
 * 
 * 클라이언트 접근
 * Socket socket=new Socket(서버IP, 서버 PORT)
 * 
 * 서버 연결 수락
 * ss.accept() - 접속이 된 경우에만 호출
 * 클라이언트의 IP, PORT 저장
 * 
 * 데이터 송수신
 * s.getInputStream() - 클라이언트 메세지 읽기
 * s.getOutputStream() - 클라이언트로 전송
 * 
 * 통신 종료
 * s.close()
 * 
 * 
 * Socket - 다른 컴퓨터와 연결하는 기기
 * ServerSocket - 서버에서 클라이언트 접속 담당
 *   -접속을 기다린다
 *   -특정 포트 사용
 *   -accept()로 연결 수락
 * Socket - 실제 통신 담당
 *   -서버와 클라이언트 연결
 *   -읽기(요청받기)
 *   -쓰기(요청하기)
 *   -연결종료
 * 
 */