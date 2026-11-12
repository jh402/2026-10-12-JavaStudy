package com.sist.music;

import java.util.*;

public class UserMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("선택 지니뮤직(1), 멜론(2):");
		int select=scan.nextInt();
		
		MusicSystem ms=null;
		if(select==1) {
			ms=new GenieMusic();
			ms.dataCollection();
		}
		else {
			ms=new MelonMusic();
			ms.dataCollection();
		}
		
		while(true) {
			System.out.println("========== Menu ==========");
			System.out.println("1. 전체 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println("==========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			if(menu==4) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			else if(menu==1) {
				ArrayList<Music> list=ms.musicAllData();
				for(Music m:list) {
					System.out.println(m.getMno()+"."+m.getTitle());
				}
			}
		}
	}
}
