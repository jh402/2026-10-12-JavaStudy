package com.sist.music;


import java.net.URLEncoder;
import java.util.*;
import java.util.regex.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import lombok.Getter;

public abstract class MusicSystem {
	@Getter
	private static ArrayList<Music> mList=new ArrayList<Music>();
	
	//추상메소드
	public abstract void dataCollection();
	
	//페이지별 목록
	public ArrayList<Music> musicList(int page){
		final int ROWSIZE=10;
		
		if(page<=0)return null;
		
		int start=(page-1)*ROWSIZE;
		int end=page*ROWSIZE;
		
		return new ArrayList<Music>(mList.subList(start, end));
	}
	
	//전체목록
	public ArrayList<Music> musicAllData(){
		return mList;
	}
	
	//상세보기
	public Music musicDetailData(int mno) {
		return mList.get(mno-1);
	}
	
	//검색
	public ArrayList<Music> musicFindData(String type, String fd){
		ArrayList<Music> list=new ArrayList<Music>();
		
		for(Music m:mList) {
			/*
			if(m.getTitle().contains(fd)) {
				if(type.equals("title")) list.add(m);
				else list.add(m);
			}*/
			if(m.getTitle().contains(fd)) list.add(m);
		}
		return list;
	}
	
	public static String youtubeFindKey(String title) {
		String key="";
		
		try {
			String url="https://www.youtube.com/results?search_query="
		+URLEncoder.encode(title, "UTF-8");
			Document doc=Jsoup.connect(url).get();
			
			//System.out.println(doc.toString());
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m=p.matcher(doc.toString());
			while(m.find()) {
				String s=m.group();
				key=s.substring(s.indexOf("=")+1, s.indexOf("\""));
				key=key.substring(0, key.indexOf("\\"));
				System.out.println(key);
				break;
			}
		}catch(Exception ex) {}
		
		return key;
	}
}
