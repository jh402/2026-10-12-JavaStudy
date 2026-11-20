package com.sist.server;

import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;


/*
연결 대기->연결 수락->ServerSocket
Scoket->클라이언트 연결->송수신
송신: OutputStream / 수신: BufferedReader
서버구동->접속자 연결 승락->데이터 입출력->종료

PORT
0~65535까지 사용 가능
0~1023 - 이미 사용중인 포트

1521-오라클
1433-MS-SQL
3306-MYSQL
5687-PostgreSQL
8080-프록시
4000-머드
20000-음성
30000-화상
*/

public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=3355;
	private Vector<Client> waitVc=new Vector<Client>();
	
	class Client extends Thread{
		//접속자 정보
		private String id;
		private String name;
		private String sex;
		
		//접속자 통신
		private Socket s;//연결 기기
		private OutputStream out;//송신
		private BufferedReader in;//수신
		
		public Client(Socket s) {
			try {
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
		//통신 시작
		@Override
		public void run() {
			try {
				while(true) {
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg, "|");
					int protocol=Integer.parseInt(st.nextToken());
					
					switch (protocol) {
						case Function.LOGIN->{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							
							//접속 되어 있는 사람들 처리
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							messageAll(Function.CHAT+"|[알림 ☞]"+name+"님 입장하셨습니다.");
							waitVc.add(this);
							//접속 하는 사람 처리
							messageTo(Function.MYLOG+"|"+id);
							
							for(Client c:waitVc) {
								messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.sex);
							}
						}
						case Function.CHAT->{
							messageAll(Function.CHAT+"|["+name+"]"+st.nextToken());
						}
						case Function.EXIT->{
							messageAll(Function.EXIT+"|"+id);
							messageAll(Function.CHAT+"|[알림 ☞]"+name+"님 퇴장하셨습니다.");
							
							for(Client c:waitVc) {
								if(c.id.equals(id)) {
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(c);
									
									in.close();
									out.close();
									break;
								}
							}
						}
					}
				}
			}catch(Exception ex) {}
		}
		//접속자 개인
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			}catch (Exception ex) {}
		}
		//접속자 전체
		public synchronized void messageAll(String msg) {
			
			try {
				for(Client c:waitVc) {
					c.messageTo(msg);
				}
			}catch (Exception ex) {}
		}
	}
	
	
	public Server() {
		try {
			ss=new ServerSocket(PORT);
			System.out.println("Server Start...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//접속 시 독립적으로 접속자마다 통신이 가능하게
	@Override
	public void run() {
		try {
			while(true) {
				//발신자 정보
				Socket s=ss.accept();
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server=new Server();
		new Thread(server).start();
		
	}
}
