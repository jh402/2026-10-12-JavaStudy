package com.sist.string;

import java.util.StringTokenizer;

/*
 * 계란,새송이버섯,대파,참기름,통깨,물,굵은소금,식초,진간장,맛술,설탕,올리고당,다진 마늘 
 */

public class 문자열_3 {
	public static void main(String[] args) {
		String data="계란,새송이버섯,대파,참기름,통깨,물,굵은소금,식초,진간장,맛술,설탕,올리고당,다진 마늘";
		//split()
		String[] datas=data.split(",");
		for(String s:datas) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		
		//StringTokenizer
		StringTokenizer st=new StringTokenizer(data, ",");
		System.out.println("분리된 재료:"+st.countTokens());//토큰 갯수
		//자른 개수만큼 반복
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");//단어 한 개씩 읽어옴
		}
		
	}
}
