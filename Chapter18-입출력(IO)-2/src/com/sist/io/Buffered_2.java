package com.sist.io;

import java.io.*;

/*
 * 트러블 슈팅 - 문제해결능력
 * 디자인패턴/알고리즘
 * 
 * Buffered - 속도를 빠르게 만드는 방법
 * -임시 공간 : 데이터를 모아서 한 번에 처리
 * 
 * 
 * FileInputStream(System.in) - 키보드 연결
 * FileInputStream(socket.getInputStream()) - 네트워크 연결
 * FileInputStream(url.getInputStream()) - 웹 연결
*/
public class Buffered_2 {
	public static void main(String[] args) {
		try {
			//FilReader
			FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
			int i=0;
			long start1=System.currentTimeMillis();
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			long end1=System.currentTimeMillis();
			fr.close();
			
			//BufferedReader
			//FileInputStream으로 파일 읽기, InputStreamReader은 InputStream(1byte)을 2byte로 변환, BufferedReader으로 한 번에 처리
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\javaDev\\movie.txt")));
			long start2=System.currentTimeMillis();
			while(true) {
				String msg=br.readLine();
				if(msg==null)
					break;
				System.out.println(msg);
			}
			long end2=System.currentTimeMillis();
			br.close();
			
			System.out.println("총 수행 시간:"+(end1-start1)+"ms");
			System.out.println("총 수행 시간:"+(end2-start2)+"ms");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
