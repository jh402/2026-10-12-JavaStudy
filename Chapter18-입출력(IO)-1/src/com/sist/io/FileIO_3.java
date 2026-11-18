package com.sist.io;

import java.io.*;

/*
 * FileReader/FileWritere
 *   - 실제 파일 제어
 *   - 2byte씩 읽기 - 한글깨짐x
 * 
 * 파일
 * r:read - FileReader
 * w:write - FileWriter - 덮어쓰기
 * a:append - 이어서 쓰기
 * 
 * FileReader
 * -read()
 * -read(char[], int, int)
 * 
 * FileWriter
 * -write(char)
 * -write(String)
*/

public class FileIO_3{
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter18-입출력(IO)-1\\src\\com\\sist\\io\\FileIO.java");
			
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
