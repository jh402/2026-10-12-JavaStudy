package com.sist.abs;

public abstract class MusicSystem {
	//상속 받은 클래스까지 접근 가능
	protected static Music[] musics=new Music[50];
	
	//크롤링 하는 방식이 다르므로 추상메소드
	public abstract void dataCollection();
	//기능이 같으므로 구현
	public Music[] musicList() {
		
		return musics;
	}
	public Music musicDetail(int mno) {
		return musics[mno-1];
	}
	public Music[] musicFindData(String title) {
		int count=0;
		for(Music m:musics) {
			if(m.getTitle().contains(title))
				count++;
		}
		Music[] findMusic=new Music[count];
		int i=0;
		for(Music m:musics) {
			if(m.getTitle().contains(title)) {
				findMusic[i]=m;
				i++;
			}
		}
		return findMusic;
	}
	//getter
	public static Music[] getMusics() {
		//System.out.println("MusicSystem:musics->"+musics);
		return musics;
	}
	
}