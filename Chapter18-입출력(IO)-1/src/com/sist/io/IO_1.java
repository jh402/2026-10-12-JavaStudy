package com.sist.io;

import java.io.*;

/*
 * IO - 프로그램에서 데이터를 읽기/쓰기 기능
 * Input-외부 데이터를 프로그램으로 가져오기
 *   - 키보드 읽기
 *   - 파일 읽기
 *   - 클라이언트가 보낸 값 읽기
 *   - 서버 값 읽기
 *   - System.in
 * Output-프로그램 데이터를 외부로 보내기
 *   - 브라우저 보내기
 *   - 도스창으로 보내기
 *   - 파일 보내기
 *   - System.out
 * 
 * 사용
 * 1. 메모리
 * 2. 파일
 * - Input:파일읽기
 * - Output:파일쓰기
 *   1)한글이 있는 파일-txt, doc, ... - char 단위
 *     ->FileReader / FileWriter
 *   2)zip / image 파일 - byte단위
 *     ->FileInputStream / FileOutputStream
 * 3. 네트워크 : 다른 컴퓨터와 연동
 * - 서버 -> 쓰레드 / 입출력
 * - 클라이언트 -> 쓰레드 / 입출력
 * 
 * 
 * Stream
 * - 단방향 - 데이터 이동 통로-절대 손실염려 없음
 * 1byte 통로-ByteStream - InputStream/OutputStream
 * 2byte 통로-CharStream - Reader/Writer
*/

public class IO_1 {
	public static void main(String[] args) {
		try {
			//한글 깨짐
			//FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy\\Chapter18-입출력(IO)-1\\src\\com\\sist\\io\\IO_1.java");
			//한글 안깨짐
			FileReader fis=new FileReader("C:\\javaDev\\javaStudy\\Chapter18-입출력(IO)-1\\src\\com\\sist\\io\\IO_1.java");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
