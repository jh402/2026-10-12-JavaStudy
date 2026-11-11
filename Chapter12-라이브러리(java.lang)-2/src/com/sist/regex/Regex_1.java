package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식
 * - 지정된 패턴을 가지고 문자열 검색
 * - 검사하는 클래스-유효성 검사
 * - 정규식 - 자바/자바스크립트/오라클
 * 
 * 
 * "[]": 한 개의 문자 ([abc] : a거나 b거나 c)
 * "-": 범위 ([A-Z] : A부터 Z까지)
 * 영어대문자: [A-Z]
 * 영어소문자: [a-z]
 * 영어 전체: [A-Za-z]
 * 한글: [가-힣]
 * 숫자: [0-9], \d
 * 
 * "\s": 공백
 * "\w": 한 개의 알파벳
 * ".": 임의의 한 글자
 * "*": 0개 이상 [A-Z]* 알파벳이 포함되어있거나 없거나
 * "+": 1개 이상 [A-Z]+ 알파벳이 1개 이상은 포함되어 있다
 * "{n}": n개 [A-Z]{3} 알파벳이 3개있다
 * "{n,m}": 범위 [0-9]{1,3} 숫자가 1개이상 3개 이하
 * 예시)
 * IP: 192.168.0.1
 * ->[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 * ->\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}
 * 
 * 정규표현식 중에 그냥 문자로 사용하고 싶다면 \\ 사용
 * 
 * "|": or [a|b] a이거나 b
 * "^": 시작 ^[A-Za-z] 알파벳으로 시작
 *      제외 [^가-힣] 한글 제외
 * "$": 끝 [A-Za-z]$ 알파벳으로 끝
 * "?": 0개 또는 1개가 있다
 * 
 * ((192.168.0).1)
 * 전체 가져오기 : group() -> 192.168.0.1
 * 안쪽꺼 가져오기: group(1) -> 192.168.0
 * 
 * split(), replaceAll() 메소드에서 정규식 사용
*/

public class Regex_1 {
	public static void main(String[] args) {
		String res="맛있는,맛있고,맛있게,맛있소,맛있다,맛없다,맛있습니다";
		
		//맛있. -> '맛있' 다음에 임의의 한 글자
		Pattern p=Pattern.compile("맛있.");
		Matcher m=p.matcher(res);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println();
		
		//뒷 글자 전체 가져오기
		p=Pattern.compile("맛있[가-힣]+");
		m=p.matcher(res);
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}
}
