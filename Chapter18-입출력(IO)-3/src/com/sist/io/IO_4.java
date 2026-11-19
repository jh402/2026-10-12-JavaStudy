package com.sist.io;

import java.io.*;
import java.util.*;


/*
 * 객체 단위로 저장 가능
 * ObjectInputStream
 *   readObject()
 *   close()
 * ObjectOutputStream
 *   writeObejct()
 *   close()
 * 
 * 직렬화 이용
 * 객체: 병렬로 저장-메모리는 직렬
*/

//객체 저장은 Serializable 인터페이스 필요
//Serializable-객체를 파일에 저장할 수 있게 만든 것
class Music implements Serializable{
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	//getter/setter
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}

public class IO_4 {
	public static void main(String[] args) {
		List<Music> list=new ArrayList<Music>(); 
		String musics="";
		try {
			FileReader fr=new FileReader("C:\\java_data\\genie.txt");
			BufferedReader br=new BufferedReader(fr);
			
			while(true) {
				String m=br.readLine();
				if(m==null) {
					break;
				}
				musics+=m+"\n";
			}
			
			br.close();
			fr.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//System.out.println(musics);
		
		String[] mm=musics.split("\n");
		for(String music:mm) {
			String[] s=music.split("\\|");
			Music mu=new Music();
			mu.setMno(Integer.parseInt(s[0]));
			mu.setTitle(s[1]);
			mu.setSinger(s[2]);
			mu.setAlbum(s[3]);
			mu.setPoster(s[4]);
			list.add(mu);
		}
		
		for(Music m:list) {
			System.out.println("번호:"+m.getMno());
			System.out.println("곡명:"+m.getTitle());
			System.out.println("가수명:"+m.getSinger());
			System.out.println("앨범:"+m.getAlbum());
			System.out.println("포스터:"+m.getPoster());
			System.out.println();
		}
		
		try {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\java_data\\music.txt"));
		oos.writeObject(list);
		oos.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
