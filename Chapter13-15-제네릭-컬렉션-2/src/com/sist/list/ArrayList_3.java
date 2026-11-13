package com.sist.list;

import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class ArrayList_3 {
	public ArrayList<String> genieData(){
		ArrayList<String> list=new ArrayList<String>();
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++) {
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {}
		return list;
	}
	public ArrayList<String> melonData(){
		ArrayList<String> list=new ArrayList<String>();
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("tr#lst50 div.rank01 a");
			for(int i=0;i<title.size();i++) {
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {}
		return list;
	}
	
	public void musicPrint(ArrayList<String> musicList) {
		for(int i=0;i<musicList.size();i++) {
			System.out.println((i+1)+". "+musicList.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList_3 a=new ArrayList_3();
		
		System.out.println("======= 지니뮤직 출력 =======");
		ArrayList<String> genie=a.genieData();
		a.musicPrint(genie);
		
		System.out.println("======= 멜론뮤직 출력 =======");
		ArrayList<String> melon=a.melonData();
		a.musicPrint(melon);
		
		//지니뮤직에만 있는 노래(MINUS)
		System.out.println("======= 지니뮤직에만 있는 노래 =======");
		genie.removeAll(melon);
		a.musicPrint(genie);
		genie=a.genieData();//복구
		
		//멜론뮤직에만 있는 노래(MINUS)
		System.out.println("======= 멜론뮤직에만 있는 노래 =======");
		melon.removeAll(genie);
		a.musicPrint(melon);
		melon=a.melonData();//복구
		
		//교집합(INTERSECT)
		System.out.println("======= 공통으로 가지고 있는 곡 =======");
		genie.retainAll(melon);
		a.musicPrint(genie);
		genie=a.genieData();//복구
		
		//UNION ALL
		System.out.println("======= 지니+멜론 =======");
		genie.addAll(melon);
		a.musicPrint(genie);
		genie=a.genieData();//복구
		
		//UNION
		System.out.println("======= 지니+멜론 =======");
		genie.containsAll(melon);
		a.musicPrint(genie);
		genie=a.genieData();
	}
}