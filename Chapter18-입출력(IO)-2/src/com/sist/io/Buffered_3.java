package com.sist.io;

import java.io.*;
import java.net.*;//URL

/*
 * URL:https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
 * URI:/kobis/business/main/searchMainDailyBoxOffice.do
*/

public class Buffered_3 {
	public static void main(String[] args) {
		try {
			URI uri=new URI("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do");
			URL url=uri.toURL();
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();//웹연결
			
			//연결이 되었다면
			if(conn!=null) {
				BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true) {
					String json=br.readLine();
					if(json==null)
						break;
					System.out.println(json);
				}
				br.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
