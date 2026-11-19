package com.sist.io;

import java.io.*;

/*
 * BufferedInputStream/BufferedOutputStream-파일 읽어서 복사
 * 웹에서 다운로드 할 때 사용
*/

public class IO_3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\javaDev\\json-simple-1.1.1.jar");
			FileOutputStream fos=new FileOutputStream("C:\\java_data\\json-simple-1.1.1.jar");
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			byte[] buffer=new byte[1024];
			int i=0;
			
			while((i=bis.read(buffer, 0, 1024))!=-1) {
				bos.write(buffer, 0, i);
			}
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
			System.out.println("파일 복사 완료(다운로드)");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}