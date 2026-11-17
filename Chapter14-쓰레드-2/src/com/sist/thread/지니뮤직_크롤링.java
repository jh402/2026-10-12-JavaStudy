package com.sist.thread;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 지니뮤직_크롤링 {
	
	public void dataCollection() {
		List<Music> list=new ArrayList<Music>();
		//1페이지당 쓰레드를 이용하여 저장
		Thread[] threads=new Thread[4];
		for(int i=0;i<4;i++) {
			final int page=i+1;
			threads[i]=new Thread(new Runnable() {
				List<Music> temp=new ArrayList<Music>();
				
				@Override
				public void run() {
					try {
						//크롤링할 때 웹사이트 주소가 다를 수 있으므로 예외처리
						Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261117&hh=14&rtm=Y&pg="+page).get();
						Elements title=doc.select("table.list-wrap a.title");
						Elements singer=doc.select("table.list-wrap a.artist");
						Elements poster=doc.select("table.list-wrap a.cover img");
						Elements album=doc.select("table.list-wrap a.albumtitle");
						
						for(int i=0;i<title.size();i++) {
							Music musics=new Music();
							musics.setTitle(title.get(i).text());
							musics.setSinger(singer.get(i).text());
							musics.setPoster(poster.get(i).attr("src"));
							musics.setAlbum(album.get(i).text());
							musics.setMno((page - 1) * 50 + i + 1);
							temp.add(musics);
						}
						System.out.println(page+"페이지 수집 완료:"+temp.size());
					}catch(Exception ex) {
						System.out.println(page+"페이지 오류");
						ex.printStackTrace();
					}
					//동기화
					synchronized (list) {
						//페이지별 결과 저장
						list.addAll(temp);
					}
				}
			});
			threads[i].start();
		}
		for(Thread t:threads) {
			try {
				t.join();
			}catch(Exception ex) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		//순위순 정렬
		list.sort(Comparator.comparingInt(Music::getMno));
		System.out.println("전체 수집 완료:"+list.size()+"곡");
		
		for(Music m : list)
	    {
	        System.out.println(m.getMno() + ". "+m.getTitle()+" - "+m.getSinger());
	    }
	}
	
	public static void main(String[] args) {
		지니뮤직_크롤링 m=new 지니뮤직_크롤링();
		long start=System.currentTimeMillis();
		m.dataCollection();
		long end=System.currentTimeMillis();
		
		System.out.println("총 걸린 시간:"+(end-start)+"ms");
		
	}
}
