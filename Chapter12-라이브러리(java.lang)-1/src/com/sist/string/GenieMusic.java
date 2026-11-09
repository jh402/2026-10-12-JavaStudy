package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic {
	//노래 목록
	private final static int SIZE=50;
	private static MusicVO[] musics=new MusicVO[SIZE];
	private static String[] category= {
			"https://www.genie.co.kr/chart/top200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0100",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0300",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0107",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0500",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0600"
	};
	
	
	public void getData(int cno) {
		try {
			
			Document doc=Jsoup.connect(category[cno]).get();
			//태그 집합
			Elements title=doc.select("table.list-wrap a.title");
			Elements singer=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
			Elements poster=doc.select("table.list-wrap a.cover img");
			Elements etc=doc.select("table.list-wrap span.rank span.rank");
			
			for(int i=0;i<SIZE;i++) {
				musics[i]=new MusicVO();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setAlbum(singer.get(i).text());
				musics[i].setPoster(poster.get(i).attr("src"));
				
				String state="";
				int id=0;
				String temp=etc.get(i).text();
				
				if(temp.equals("유지")) {
					state="유지";
					id=0;
				}
				else {
					state=temp.replaceAll("[^가-힣]", "");
					id=Integer.parseInt(temp.replaceAll("[^0-9]", ""));
				}
				musics[i].setState(state);
				musics[i].setIdcrement(id);
			}
		}catch(Exception ex) {}
		
		for(MusicVO vo:musics)
			System.out.println(vo.getMno()+"."+vo.getTitle());
	}
}
