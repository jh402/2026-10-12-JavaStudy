package com.sist.io2;

import java.io.*;
import java.util.*;

public class MusicData {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		try {
			FileReader fr=new FileReader("c:\\java_data\\genie.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				//System.out.print((char)i);
				sb.append((char)i);
			}
			fr.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//출력
		//System.out.println(sb.toString());
		
		String[] musics=sb.toString().split("\n");
		for(String m:musics) {
			String[] music=m.split("\\|");
			System.out.println("번호:"+music[0]);
			System.out.println("곡명:"+music[1]);
			System.out.println("가수명:"+music[2]);
			System.out.println("앨범:"+music[3]);
			System.out.println("이미지:"+music[4]);
		}
		
	}
}
