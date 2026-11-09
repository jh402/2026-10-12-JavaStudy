package com.sist.string;

import java.util.*;

public class 문자열_4 {
	public static void main(String[] args) {
		String color="red|green|blue|black|white";
		
		//정규식(regex)으로 인해 |를 쓰려면 \\| 사용
		String[] colors=color.split("\\|");
		for(String s:colors) {
			System.out.println(s);
		}
		System.out.println();
		
		//StringTokenizer클래스는 정규식 사용x
		StringTokenizer st=new StringTokenizer(color, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
/*
 * ^ : 제외
 * | : 선택
 * ? : 0, 1
 * + : 1개 이상
 * * : 0개 이상
 * . : 임의 한 글자
 */