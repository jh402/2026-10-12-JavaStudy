package com.sist.io;

import java.io.*;
import java.util.*;
import java.net.*;

public class IO_2 {
	private static final String baseUrl="https://www.kobis.or.kr/kobis/business/main/";
	private static String[] strUrl= {
			//"",
			"searchMainDailyBoxOffice.do",
			"searchMainRealTicket.do",
			"searchMainDailySeatTicket.do"
	};
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. 박스오피스");
		System.out.println("2. 실시간 예매율");
		System.out.println("3. 좌석 점유율");
		System.out.print("메뉴 선택:");
		int menu=scan.nextInt();
		
		try {
			URI uri=new URI(baseUrl+strUrl[menu-1]);
			URL url=uri.toURL();
			
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			
			//연결이 안된 경우
			if(conn==null) {
				return;
			}
			
			BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String movie="";
			while(true) {
				String json=br.readLine();
				if(json==null)
					break;
				movie+=json+"\n";
			}
			br.close();
			System.out.println(movie.trim());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
