package com.sist.io;

import java.io.*;

public class FileIO_2 {
	public static void main(String[] args) {
		try {
			//파일 copy
			FileInputStream fis=new FileInputStream("C:\\javaDev\\lombok-1.18.48.jar");
			FileOutputStream fos=new FileOutputStream("C:\\java_data\\lombok-1.18.48.jar");
			
			//파일 읽어서 복사
			int i=0;
			byte[] buffer=new byte[1024];
			//지정된 바이트 크기를 모아서 한번에 전송
			while((i=fis.read(buffer, 0, 1024))!=-1) {
				//TCP:1024, UDP:512
				//i:몇 byte 크기인지 확인, buffer: 글자 읽기
				System.out.println(i);
				fos.write(buffer, 0, i);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("파일 복사 완료!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
