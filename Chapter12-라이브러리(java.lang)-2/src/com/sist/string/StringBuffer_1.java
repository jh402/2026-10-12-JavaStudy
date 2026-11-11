package com.sist.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// String과 동일 -> 문자열 결합 속도가 빠름 -> append
/*
 * StringBuffer -> 문자열 => 비동기화 
 * 
 * StringBuffer sb=new StringBuffer() 
 * sb.append(문장) ...
 */
public class StringBuffer_1 {

	public static void main(String[] args) {
        try{
        	//Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
        	//System.out.println(doc.toString());
        	//URL url=new URL("https://www.10000recipe.com/recipe/list.html");
        	// => 20버전 경고 
        	URI uri=URI.create("https://www.10000recipe.com/recipe/list.html");
        	URL url=uri.toURL();
        	/*
        	 *   URLConnection
        	 *      |
        	 *  -------------------
        	 *  |                 |
        	 * HttpURLConnection HttpsURLConnection
        	 */
        	HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        	
        	long time1=0, time2=0;
        	
        	String html="";
        	if(conn!=null) {// 웹과 연결되었다면
        	 	BufferedReader br=new BufferedReader(
        	 	        new InputStreamReader(conn.getInputStream())
        	 	        );
        	 	long start=System.currentTimeMillis();
        	 	
        	 	while(true) {
        	 		String s=br.readLine();
        	 		if(s==null)
        	 			break;
        	 		html+=s+"\n";
        	 	}
        	 	long end=System.currentTimeMillis();
        	 	System.out.println(html);
        	 	time1=end-start;
        	}
        	
        	conn=(HttpURLConnection)url.openConnection();
        	StringBuffer sb=new StringBuffer();
        	if(conn!=null) {// 웹과 연결되었다면
        	 	BufferedReader br=new BufferedReader(
        	 	        new InputStreamReader(conn.getInputStream())
        	 	        );
        	 	long start=System.currentTimeMillis();
        	 	
        	 	while(true) {
        	 		String s=br.readLine();
        	 		if(s==null)
        	 			break;
        	 		sb.append(s+"\n");
        	 	}
        	 	long end=System.currentTimeMillis();
        	 	System.out.println(sb.toString());
        	 	time2=end-start;
        	}
        	System.out.println("문자열 결합 걸린 시간:"+time1+"MS");
        	System.out.println("StringBuffer 걸린 시간:"+time2+"MS");
        	
        }catch(Exception ex) {}
	}

}