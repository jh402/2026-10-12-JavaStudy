package com.sist.list;

import java.util.*;

public class ArrayList_2 {
	public static void main(String[] args) {
		String[] names= {"홍길동", "이순신", "박문수", "심청이", "춘향이"};
		
		List<String> list=new ArrayList<String>();
		list=Arrays.asList(names); //배열을 리스트로
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
