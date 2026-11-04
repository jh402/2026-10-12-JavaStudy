package com.sist.exception;

import java.io.File;
import java.io.FileReader;

public class 예외처리_자원자동화처리 {
	public static void main(String[] args) {
		//자동으로 파일 닫기
		try(FileReader fr=new FileReader("C:\\Users\\sist-28\\git\\Java-study\\Chapter11-예외처리\\src\\com\\sist\\exception\\숫자야구게임.java")){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
