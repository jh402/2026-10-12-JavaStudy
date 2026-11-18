package com.sist.io;

import java.io.*;

public class IO_3 {
	public static void main(String[] args) {
		try {
			//경로 지정
			File dir=new File("C:\\javaDev");
			//모든 파일 읽어오기
			File[] list=dir.listFiles();
			
			for(File f:list) {
				if(f.isFile()) {
					String len=f.length()/1000>0?(f.length()/1000)+"KB":f.length()+"Bytes";
					System.out.println(f.getName()+" "+len);
				}
				else {//디렉트리
					System.out.println(f.getName()+" DIR");
				}
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
