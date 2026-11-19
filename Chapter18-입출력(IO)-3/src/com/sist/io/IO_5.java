package com.sist.io;

import java.util.*;
import java.io.*;

public class IO_5 {
	public static void main(String[] args) {
		try{
			FileInputStream fos=new FileInputStream("C:\\java_data\\music.txt");
			ObjectInputStream ois=new ObjectInputStream(fos);
			
			ArrayList<Music> list=(ArrayList<Music>)ois.readObject();
			ois.close();
			
			for(Music m:list) {
				System.out.println("번호:"+m.getMno());
				System.out.println("곡명:"+m.getTitle());
				System.out.println("가수명:"+m.getSinger());
				System.out.println("앨범:"+m.getAlbum());
				System.out.println("포스터:"+m.getPoster());
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
