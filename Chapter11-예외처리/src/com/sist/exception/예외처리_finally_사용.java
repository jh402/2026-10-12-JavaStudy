package com.sist.exception;

import java.io.*;

public class 예외처리_finally_사용 {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			//CheckedException
			fr=new FileReader("C:\\Users\\sist-28\\git\\Java-study\\Chapter11-예외처리\\src\\com\\sist\\exception\\숫자야구게임.java");
			
//			int i=0;
//			while((i=fr.read())!=-1) {
//				System.out.print((char)i);
//			}
			
			for(int i=fr.read();i!=-1;i=fr.read()){
				System.out.print((char)i);
			}
			
		}catch(Exception ex) {
			//에러메세지 확인
			System.out.println(ex.getMessage());
		}finally {
			try {
				if(fr!=null)
					fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
}