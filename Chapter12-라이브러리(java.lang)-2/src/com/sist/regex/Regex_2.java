package com.sist.regex;

public class Regex_2 {
	public static void main(String[] args) {
		System.out.println("======= 데이터 추출 ========");
		String price="가격: 30,000원";
		//숫자를 제외한 나머지 공백
		String s=price.replaceAll("[^0-9]", "");
		System.out.println(s);
		
		String res="홍길동|남자|30|서울|010-1234-5678";
		String[] info=res.split("\\|");//\\붙이기
		for(String s1:info) {
			System.out.println(s1);
		}
	}
}

/*
 * regex
 * 특수기호를 이용해서 복잡한 문자를 찾는 방법
 * 
 * Matcher
 * 문자 형식-패턴
 * .matcher(String) - 문자열에서 패턴을 찾기
 * .find() - 패턴에 맞는 데이터 찾기
 * .group() - 실제 찾은 문자열 
 */
