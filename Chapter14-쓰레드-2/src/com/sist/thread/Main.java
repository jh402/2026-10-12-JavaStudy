package com.sist.thread;

import java.util.*;


class MusicVO{
	private int mno;
	private String title;
	
	public MusicVO(int mno, String title) {
		this.mno=mno;
		this.title=title;
	}

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
	
	//오버라이딩이 가장 많은 메소드
	@Override
	public String toString() {
		return mno+":"+title;
	}
}

public class Main {
	public static void main(String[] args) {
		List<MusicVO> list=new ArrayList<MusicVO>();
		
		list.add(new MusicVO(1, "아이유"));
		list.add(new MusicVO(2, "리센느"));
		list.add(new MusicVO(3, "아일릿"));
		System.out.println(list);
		
		//MusicVO::getMno 메소드 참조
		//mno로 정렬
		list.sort(Comparator.comparingInt(MusicVO::getMno));
		System.out.println(list);
		//title로 정렬
		list.sort(Comparator.comparing(MusicVO::getTitle));
		System.out.println(list);
		list.sort(Comparator.comparing(MusicVO::getMno).reversed());
		
	}
}
