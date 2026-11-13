package com.sist.list;

import java.util.*;

public class UserBookMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BookSystem bs=new BookSystem();
		
		while(true) {
			System.out.println("========== 메뉴 ==========");
			System.out.println("1. 목록");//for-each
			System.out.println("2. 상세보기");//get
			System.out.println("3. 검색");//get -> for-each
			System.out.println("4. 삭제");//remove
			System.out.println("5. 수정");//set
			System.out.println("6. 종료");//exit
			System.out.println("=========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			if(menu==6) {
				System.out.println("프로그램을 종료");
				System.exit(0);
			}
			else if(menu==1) {
				int totalpage=(int)(Math.ceil(BookSystem.getBList().size()/10.0));
				System.out.print("페이지 입력(1~"+totalpage+"):");
				int page=scan.nextInt();
				ArrayList<BookVO> list=bs.bookListDate(page);
				
				//목록 출력
				for(BookVO vo:list) {
					System.err.println(vo.getNo()+"."+vo.getTitle());
				}
			}
			else if(menu==2) {
				int count=BookSystem.getBList().size();
				System.out.print("책 번호 입력(1~"+count+"):");
				int no=scan.nextInt();
				BookVO vo=bs.bookDetailData(no);
				
				System.out.println("책번호:"+vo.getNo());
				System.out.println("제목:"+vo.getTitle());
				System.out.println("저자:"+vo.getAuthor());
				System.out.println("이미지:"+vo.getPoster());
				System.out.println("총 페이지 수:"+vo.getPages());
				System.out.println("출판일:"+vo.getPubdate());
				System.out.println("가격:"+vo.getPrice());
				
			}
			else if(menu==3) {
				System.out.print("검색어 입력:");
				String fd=scan.next();
				ArrayList<BookVO> list=bs.bookFindData(fd);
				for(BookVO vo:list) {
					System.err.println(vo.getNo()+"."+vo.getTitle());
				}
			}
			else if(menu==4) {
				System.out.print("삭제할 책 번호 입력:");
				int no=scan.nextInt();
				System.out.println("책 삭제 전 총 갯수:"+BookSystem.getBList().size()+"개");
				bs.bookDelete(no);
				System.out.println("책 삭제 후 총 갯수:"+BookSystem.getBList().size()+"개");
			}
		}
	}
}