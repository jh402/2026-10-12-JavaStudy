package com.sist.io;

import java.io.*;
/*
 * 문자 스트림
 * BufferedReader
 *  -메모리/파일/네트워크
 *  -파일에 저장된 글자를 한 줄씩 읽어오는 클래스
 *  -txt파일
 * BufferedWriter
 *   -글자를 효율적으로 파일에 저장하는 클래스
 *   -메모장/로그/게시물
 *     write() - 문자 저장
 *     newLine() - 줄바꿈
 *     close() - 닫기
 * 
 * 
 * 바이트 스트림-이미지/동영상/파일->업로드/다운로드
 * BufferedInputStream
 *   -이미지/음악/동영상 파일 - 바이트 단위로 읽기
 *   -다운로드
 *     read() - 1byte 읽기
 *     read(byte[]) - 여러 바이트 읽기
 *     close() - 닫기
 * BufferedOutputStream
 *   -바이트 데이터를 모아서 파일에 저장
 *   -이미지 복사, 파일 다운로드
 * 
 * 객체 데이터 처리-애플리케이션
 * ObjectInputStream
 *   readObject()
 * ObjectOutputStream
 *   writeObject(list)
 * 
 * 파일/폴더 관리
 * File - java.io
 * Files - java.nio
 * 
 * 
 * 네트워크
 * ServerSocket/Socket/Thread사용법
*/
public class IO_1 {
	public static void main(String[] args) {
		try {
			File file=new File("C:\\java_data\\student.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw= new FileWriter(file, true);
			String msg="Hello IOStream\r\n";//메모장에서 \r\n을 써야 줄바꿈이 됨
			fw.write(msg);
			
			msg="Hello Oracle!!";
			BufferedWriter bw=new BufferedWriter(fw);//fw의 데이터를 넘겨줌
			bw.write(msg);
			System.out.println("저장 완료!");
			
			bw.close();
			fw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
