package com.sist.io2;

import java.util.*;
import java.util.concurrent.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Genie_DataCollection {
	public static List<Music> list=new ArrayList<Music>(); 
	
	public void dataCollection() {
		//쓰레드 풀 생성(4개)
		ExecutorService service=Executors.newFixedThreadPool(4);
		//작업 결과 저장 Future-결과값 관리, 결과 보관 장소
		List<Future<List<Music>>> futures=new ArrayList<Future<List<Music>>>();
		
		for(int i=1;i<=4;i++) {
			final int page=i;
			Future<List<Music>> future=service.submit(new Callable<List<Music>>() {
				@Override
				public List<Music> call() throws Exception {
					List<Music> temp=new ArrayList<Music>();
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
					return temp;
				}
			});
			futures.add(future);
		}
		//모든 작업 완료 - 대기 - 결과값 가져오기
		for(Future<List<Music>> future:futures) {
			try {
				List<Music> temp=future.get();//join();
				list.addAll(temp);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(Music m:list) {
			System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getSinger());
		}
		//쓰레드 종료
		service.shutdown();
	}
}
