package com.sist.abs;

public class UserMain {
	public static void main(String[] args) {
		MusicSystem ms=new GenieMusic();
		ms.dataCollection();
		Music[] musics=ms.musicList();
		for(Music m:musics) {
			System.out.println(m.getMno()+"."+m.getTitle());
		}
		
		System.out.println("=============================");
		ms=new MelonMusic();
		ms.dataCollection();
		for(Music m:musics) {
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}
}
