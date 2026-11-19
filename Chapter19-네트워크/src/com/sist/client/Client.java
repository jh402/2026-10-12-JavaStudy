package com.sist.client;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s=new Socket("xxx.xxx.xxx.xxx", 11111);
			
			System.out.println("서버 접속 완료");
			OutputStream out=s.getOutputStream();
			//서버의 소켓
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out.write("Hi Server!!!\n".getBytes());
			String msg=in.readLine();
			System.out.println("서버 응답:"+msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
