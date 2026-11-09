package com.sist.string;


/*
 * length() - 문자 갯수
 * split() / StringTokenizer() - 문자 분해
 * indexOf() / lastIndexOf() - 문자 찾기
 * substring() - 문자 자르기
 * trim() - 공백 제거
 * valueOf() - 문자열 변환
 * replace() - 문자 변경
 * equals() / contains() / startsWith() / endsWith() - 비교
 */
public class 문자열_2 {
	public static void main(String[] args) {
		String category="https://www.genie.co.kr/chart/genre";
		String s=category.substring(category.lastIndexOf("/")+1);
		System.out.println(s);
		
		s=category.substring(0, category.indexOf(":"));
		System.out.println(s);
		
		s=category.substring(category.indexOf("/")+2);
		s=s.substring(0, s.indexOf("/"));
		System.out.println(s);
		
		
		String msg1="Hello Java";
		String msg2="HELLO JAVA";
		
		boolean strCompare1=msg1.toUpperCase().equals(msg2);//대문자로 바꿔서 비교
		boolean strCompare2=msg1.equalsIgnoreCase(msg2);//대소문자 구분없이 비교
		
		if(strCompare2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		String msg="Hello Java";
		if(msg.contains("Java")) {//검색
			System.out.println("Java 포함됨");
		}
		if(msg.startsWith("Hello")) {//자동 완성기
			System.out.println("Hello로 시작함");
		}
		if(msg.endsWith("Java")) {//확장자
			System.out.println("Java로 끝남");
		}
		
	}
}
