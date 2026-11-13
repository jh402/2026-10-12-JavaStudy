package com.sist.list;

import java.util.*;
import lombok.Getter;
import java.sql.*;


/*
 * java.util
 * Date / Calendar - 날짜와 시간 제어
 * StringTokenizer - split를 쉽게 제어
 * Random - 난수 발생
 * 
*/

public class BookSystem {
	@Getter
	private static ArrayList<BookVO> bList=new ArrayList<BookVO>();
	
	//딱 한번 실행
	static {
		try {
			//드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결
			String url="jdbc:oracle:thin:@xxx.xxx.xxx.xxx:XXXX:XE";//git에 올릴 떄 ip 지우고 올리기
			Connection conn=DriverManager.getConnection(url, "hr", "happy");
			
			//SQl 문장 전송
			String sql="SELECT no,title,author,poster,pubdate,pages,price FROM book ORDER BY no ASC";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			//결과값 받기
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BookVO vo=new BookVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setAuthor(rs.getString(3));
				vo.setPoster(rs.getString(4));
				vo.setPubdate(rs.getDate(5));
				vo.setPages(rs.getString(6));
				vo.setPrice(rs.getInt(7));
				bList.add(vo);
			}
			
			//닫기
			rs.close();
			ps.close();
			conn.close();
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	//페이지별 목록
	public ArrayList<BookVO> bookListDate(int page){
		final int ROWSIZE=10;//한 페이지 요소 10개
		
		//페이지 범위 벗어나지 않게
		int maxpage=(int)(Math.ceil(BookSystem.getBList().size()/(double)ROWSIZE));
		if(page<=0) page=1;
		else if(page>maxpage) page=maxpage;
		
		int start=(page-1)*ROWSIZE;
		int end=start+ROWSIZE;
		
		if(end>=bList.size()) end=bList.size();
		
		return new ArrayList<BookVO>(bList.subList(start, end));
	}
	
	
	//상세보기
	public BookVO bookDetailData(int no) {
		BookVO vo=new BookVO();
		
		for(BookVO bvo:bList) {
			if(no==bvo.getNo()) {
				vo=bvo;
				break;
			}
		}
		return vo;
	}
	
	
	//검색
	public ArrayList<BookVO> bookFindData(String title){
		ArrayList<BookVO> list=new ArrayList<BookVO>();
		for(BookVO vo:bList) {
			if(vo.getTitle().contains(title)) {
				list.add(vo);
			}
		}
		return list;
	}
	//삭제
	public void bookDelete(int no) {
		for(int i=0;i<bList.size();i++) {
			if(bList.get(i).getNo()==no) {
				bList.remove(i);
				break;
			}
		}
	}
}
