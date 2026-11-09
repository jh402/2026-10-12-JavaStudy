package com.sist.string;

/*
 * 라이브러리(자바에서 지원)
 * String 표준화-오버라이딩이 불가능-final 클래스
 * 
 * length - 문자의 갯수
 * int length()
 * 
 * trim - 공백 제거
 * String trim()
 * 
 * substring - 문자열 자르기
 * String substring(int beginIndex)
 * String substring(int beginIndex, int endIndex)
 * 
 * indexOf - 지정된 문자의 위치(앞에서부터 찾기)
 * int indexOf(char c)
 * int indexOf(String s)
 * 
 * lastIndexOf - 지정된 문자의 위치(뒤에서부터 찾기)
 * int lastIndexOf(char c)
 * int lastIndexOf(String s)
 * 
 * contains - 포함된 단어 찾기
 * boolean contains(String s)
 * 
 * startsWith - 시작 문자열
 * boolean startsWith(String s)
 * 
 * endsWith - 끝 문자열
 * boolean endsWith(String s)
 * 
 * equals - 같은 문자열(대소문자 구분)
 * boolean equals(String s)
 * 
 * equalsIgnoreCase - 대소문자 구분 없이 문자열 비교
 * boolean equals(String s)
 * 
 * valueOf - 모든 데이터형 문자열로 변환
 * String valueOf(모든 기본형)
 * 
 * split - 단어별 분리
 * String[] split(String regex) - 정규식
 * 예) 맛있고 맛있는 맛있게 ....
 * 맛있+
 * 
 * replace-문자열, 문자를 변경
 * String replace(char c1, char c2)
 * String replace(String s1, String s2)
 * 
 * replaceAll-정규식을 이용한 변경
 * String replaceAll(String regex, String s)
 * [A-Za-z]영문 전체
 * [0-9]숫자 전체
 * [가-힣]한글 전체
 * 
 * concat-문자열 결합(+연산자가 더 편함)
 * String concat(String s)
*/
public class 문자열_정리 {
	public static void main(String[] args) {
		String str="Hello";
		
	}
}
