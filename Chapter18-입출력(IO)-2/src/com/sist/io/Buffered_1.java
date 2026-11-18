package com.sist.io;

import java.io.*;
/* 
 * 문자
 * BufferedWriter - 읽거나 쓰기 시에 데이터량이 많은 경우 효율적
 *   - write(String)
 *   - newLine()
 *   - close()
 * BufferedReader - 메모리/파일 읽기
 *   - read()
 *   - readLine() - 한 줄씩 읽기
 *   - close()
 * 바이트
 * BufferedInputStream
 * BufferedOuputStream
*/

public class Buffered_1 {
	
	public static void main(String[] args) {
		try {
			//키보드 입력값 읽기
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("입력:");
			String msg=br.readLine();//무조건 String, enter 치면 값 받음-한 줄씩
			System.out.println(msg);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}