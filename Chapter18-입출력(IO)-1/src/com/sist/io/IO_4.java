package com.sist.io;

import java.io.*;

public class IO_4 {
	public static void main(String[] args) {
		try {
			//폴더 생성
			File dir=new File("c:\\upload");
			if(!dir.exists()) {
				//없다면
				dir.mkdir();
				System.out.println("폴더 생성 완료!");
			}
			else {
				//있다면
				System.out.println("이미 존재하는 폴더입니다.");
			}
			//파일 생성
			File file=new File("c:\\upload\\student.txt");
			if(!file.exists()) {
				//없다면
				file.createNewFile();
				System.out.println("파일 생성 완료!");
			}
			else {
				//있다면
				System.out.println("이미 존재하는 파일입니다.");
			}
			//파일 안에 파일 생성
//			File dir2=new File("c:\\upload\\data\\data1\\data2");
//			if(!dir2.exists()) {
//				dir2.mkdirs();
//				System.out.println("폴더 생성 완료!");
//			}
//			else {
//				System.out.println("이미 존재하는 폴더입니다.");
//			}
			//삭제 - 빈 폴더만 삭제 가능
//			if(dir2.exists()) {
//				//있다면
//				dir2.delete();
//				System.out.println("폴더 삭제 완료!!");
//			}
//			else {
//				//없다면
//				System.out.println("존재하지 않는 폴더입니다.");
//			}
			File[] list=dir.listFiles();
			for(File f:list) {
				System.out.println(f.getName()+"삭제");
				f.delete();
			}
			System.out.println(dir.getName()+"삭제");
			dir.delete();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
