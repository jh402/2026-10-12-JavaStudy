package com.sist.io;

import java.io.*;
import java.util.*;
/*
 * 스트림 - 단방향
 * FileInputStream
 * FileOutputStream
 * 
 * 파일 업로드/다운로드 때 사용
 * 단점 : 한 글자씩 읽기/전송, 1byte씩 읽어옴
 * 
*/
public class FileIO {
	public static void main(String[] args) {
		try {
			//폴더 생성
			File dir=new File("c:\\java_data");
			if(dir.exists()) {
				System.out.println("이미 존재하는 폴더입니다.");
			}
			else {
				dir.mkdir();
				System.out.println("폴더 생성 완료");
			}
			//파일 생성
			File file=new File("c:\\java_data\\sawon.txt");
			if(file.exists()) {
				System.out.println("이미 존재하는 파일입니다.");
			}
			else {
				file.createNewFile();
				System.out.println("sawon.txt파일 생성");
			}
			
			//파일 쓰기
			FileOutputStream fos=new FileOutputStream(file.getPath(), true);//append 모드
			String hong="1|홍길동|개발부|대리|4000";
			fos.write(hong.getBytes());//인수가 byte 배열이므로 getBytes()
			fos.close();
			System.out.println("파일 쓰기 완료!");
			
			//파일 읽기
			FileInputStream fis=new FileInputStream(file.getPath());
			int i=0;//한 글자->정수(A=65)
			//-1은 파일의 끝 - EOF
			//read(): 한 글자씩 읽기
			while((i=fis.read())!=-1) {
				//(char)i - 한글 안깨지게
				//i - 한글 없는 경우
				System.out.print((char)i);
			}
			System.out.println();
			
			//파일이 gif, zip 등일 때 사용
			//byte[] buffer=fis.readAllBytes();
			//System.out.println(Arrays.toString(buffer));
			
			fis.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
